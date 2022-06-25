package lesson2.NewProgram2;

public class NewProgram2 {
    public static void main(String[] args) {
        System.out.println(plus(1,2));

        int plus = plus(3,4);
        System.out.println(plus);
    }

    public static int plus(int arg1, int arg2) {
        int result = arg1 + arg2;
        return result;

    }
}
