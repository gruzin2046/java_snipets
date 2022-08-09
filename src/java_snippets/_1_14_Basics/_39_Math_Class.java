package java_snippets._1_14_Basics;

public class _39_Math_Class {
    public static void main(String[] args) {
        // class Math provide us useful methods

        // constant numbers like pi or e
        double pi = Math.PI; // 3.141592653589793
        double e = Math.E; // 2.718281828459045

        // ***** methods *****

        // absolute value
        double abs = Math.abs(-22.33); // 22.33

        // floor value
        double floor = Math.floor(321.456); // 321.0

        // max/min value
        double max = Math.max(123.4, 121.5); // 123.4
        double min = Math.min(123.4, 121.5); // 121.5

        // round to integer number, long type
        long round = Math.round(123.50); // 124
        long round2 = Math.round(123.49); // 123

        // pow value
        double pow = Math.pow(3, 2); // 9.0
        double pow2 = Math.pow(2, 6); // 64.0

        // sqrt value
        double sqrt = Math.sqrt(36); // 6.0
        double sqrt2 = Math.sqrt(27); // 5.196152422706632

        // random number between 0.0 (inclusive), and 1.0 (exclusive)
        int randomNum = (int) (Math.random() * 101);  // 0 to 100
        System.out.println(randomNum);

    }
}
