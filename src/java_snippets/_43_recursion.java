package java_snippets;//calc numbers from range using recursion (inception of the same method)

public class _43_recursion {
    static int loopNum = 1;
    static String resultExplanation = " = ";

    public static int sum(int start, int end) {
        if (end > start) {
            // increment loop iterator
            System.out.println("call sum method for the : " + loopNum + " time");
            loopNum++;
            // print end number to understand where we are :)
            System.out.println("second number in sum method : " + end);
            resultExplanation = resultExplanation.concat(end + " + ");
            // here we have second number (end) and we call sum method again
            return end + sum(start, end - 1);
        } else {
            resultExplanation = resultExplanation.concat(Integer.toString(end));
            return end;
        }
    }

    public static void main(String[] args) {
        int result = sum(2, 7);
        resultExplanation = result + resultExplanation;
        System.out.println(resultExplanation);
        System.out.println(result + ": result");
    }
}