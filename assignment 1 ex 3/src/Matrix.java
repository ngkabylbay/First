public class Matrix {

    private int row;
    private int col;
    private int[][] matrix;

    public Matrix(int row, int col, int matrix[][]){
        this.row = row;
        this.col = col;
       // matrix = new int [row][col];
        this.matrix = matrix;
    }

    public void matrixAddition(int[][] matrix2) {
        int[][] resMatrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = matrix[i][j] + matrix2[i][j];
            }
        }
    }

    public void multNumb(int n) {
        int[][] resMatrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = matrix[i][j] * n;
            }
        }
    }

    public void print(){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public void matrixMultiplacation(int[][] matrix2) {
        int[][] resMatrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = matrix[i][j] * matrix2[i][j];
            }
        }
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

}
