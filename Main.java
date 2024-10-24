public class Main {
    public static void main(String[] args) {
            System.out.println(" Первое задание ");
            int[][] matrix = {{9, 5, 8}, {4, 6, 5},{1, 9, 3}};
            MatrixOperations matrixOperations = new MatrixOperations(matrix, 0);
            System.out.println("Исходная матрица" );
            matrixOperations.outputMatrix();

            System.out.println("Максимальный элемент заданного столбца: " + matrixOperations.maxElementColumn());
            matrixOperations.multiplicationOnMaxElement();
            System.out.println("Преобразованная матрица:" );
            matrixOperations.outputMatrix();

            System.out.println(" ");

            TextOperations textOperations = new TextOperations("беб буб мым пуп нет да тут");
            System.out.println(" Второе задание ");
            System.out.println(" Палиндромы в предложении: " + textOperations.countPalindrom());

            System.out.println(" ");

            System.out.println(" Третье задание ");
            System.out.println("Число слов в предложении: " + textOperations.countWords());
            System.out.println(" ");

            System.out.println(" Четвертое задание ");
            System.out.println("Максимальное число перестановок = " + textOperations.countChangePositionWord());
    }
}
