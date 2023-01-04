
public class Main {
    public static void main(String[] args) {
        Matrix test1 = new Matrix(3, 3, new int[][]{{1, 2, 2}, { 2, 1, 2},{1, 1, 1}});
        Matrix test2 = new Matrix(2, 2, new int[][]{{1, 2, 2}, { 2, 1, 2},{1, 1, 1}});
        test1.matrixAddition(test2.getMatrix());
        test1.print();

    }
}