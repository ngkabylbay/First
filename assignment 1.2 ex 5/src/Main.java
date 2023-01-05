public class Main {

    public static void recursiveOutput (int a, int b) {
        if (a == b) System.out.println(a);
        else if (a > b) {
            System.out.print(a + " ");
            recursiveOutput(a - 1, b);
        }
        else if (a < b) {
            System.out.print(a + " ");
            recursiveOutput(a + 1, b);
        }
    }

    public static void main(String[] args) {
        recursiveOutput(1, 5);
    }
}