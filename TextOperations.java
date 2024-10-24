public class TextOperations {
        // Задача 2
        public final int MAX_COUNT_SPLIT = 100;
        private String sentence;
        private String delimiter = " ";
        public TextOperations(String sentence) {
            this.sentence = sentence;
        }
        public TextOperations() {
            this.sentence = "Это предложение тестовое шиш пуп кок тыт";
        }

        public String countPalindrom() {
            String[] words = customSplit();
            String palindroms = "";
            int count = 0;
            for (String word : words) {
                if (isPalindrome(word)) {
                    palindroms += " " +  word;
                    count++;
                }
            }
            System.out.println("Количество палиндромов: " + count);
            return palindroms;
        }
        public int countWords() {
            String[] words = customSplit();
            return words.length;
        }
        public int countChangePositionWord() {
            String[] words = customSplit(); // разделяем строку на слова
            System.out.println("Число слов в предложении: " + words.length);
            int faqt = words.length;
            int result = 1;
            for (int i=1; i<=faqt; i++) {
                result = result * i;
            }
            return result;
        }
        public String[] customSplit() {
            String[] parts = new String[MAX_COUNT_SPLIT];
            int partCount = 0;
            int startIndex = 0;
            while (true) {
                int end = sentence.indexOf(delimiter, startIndex); // Ищет пробел

                if (end == -1) {
                    parts[partCount++] = sentence.substring(startIndex); // Добавляет в массив последнюю часть
                    break;
                }
                parts[partCount++] = sentence.substring(startIndex, end); // Добавляет подстроку

                startIndex = end + 1;
            }
            String[] result = new String[partCount];
            for (int i = 0; i < partCount; i++) {
                result[i] = parts[i];
            }

            return result;
        }
        public boolean isPalindrome(String word) {
            String lowerWord = word.toLowerCase();
            String reversedWord = new StringBuilder(lowerWord).reverse().toString();
            return customEquals(lowerWord, reversedWord);
        }
        public boolean customEquals(String a, String b) {

        if (a.length() != b.length()) {
            return false;
        }


        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i)  !=b.charAt(i)) {
                return false;
            }
        }
            return true;
        }

}

