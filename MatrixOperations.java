public class MatrixOperations {
    // Задание первое
    private final int[][] matrix;
    private int numberColumn;
    private int max;
    private int maxIndex;
    public MatrixOperations(int[][] matrix , int numberColumn) {
        this.matrix = matrix;
        this.numberColumn = numberColumn;
    }
    public MatrixOperations(MatrixOperations other) {
        this.matrix = new int[other.matrix.length][other.matrix.length];
        for(int i = 0; i < matrix.length; i++) {
            for ( int j = 0; j < matrix.length; j++) {
                this.matrix[i][j] = other.matrix[i][j];
            }
        }
    }
    public int maxElementColumn() {
        max = matrix[0][numberColumn];
        maxIndex = 0;
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][numberColumn] > max) {
                max = matrix[i][numberColumn];
                maxIndex = i;
            }
        }
        return max;
    }
    public void multiplicationOnMaxElement() {
        for (int i = 0; i < matrix.length; i++) {
            if (i != maxIndex) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = matrix[i][j] * max;
                }
            }
        }
    }
    public void outputMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        System.out.println();
        }
    }

}
