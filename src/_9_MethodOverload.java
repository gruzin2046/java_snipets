public class _9_MethodOverload {
    public static int multiplyTwoNumbers(int firstNum, int secNumber) {
        return  firstNum * secNumber;
    }

    public static double multiplyTwoNumbers(double firstNum, double secNumber) {
        return  firstNum * secNumber;
    }

    public static void main(String[] args) {
        int multi1 = multiplyTwoNumbers(324, 423);
        double multi2 = multiplyTwoNumbers(234.32, 21.9);

        System.out.println(multi1);
        System.out.println(multi2);
    }
}
