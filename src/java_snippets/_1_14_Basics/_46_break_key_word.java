package java_snippets._1_14_Basics;

public class _46_break_key_word {
    public static void main(String[] args) {

        // 1. break can terminate the current loop of any type (for, while, do-while);
        // in this case, we terminate inner loop if condition is true:

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(j + " ");
                if (i == j) {
                    System.out.print('\n');
                    break;
                }
            }
        }

        /* Output:
        0
        0 1
        0 1 2
        0 1 2 3
        0 1 2 3 4
        0 1 2 3 4 5
        0 1 2 3 4 5 6
        0 1 2 3 4 5 6 7
        0 1 2 3 4 5 6 7 8
        0 1 2 3 4 5 6 7 8 9
        */

        // 2. break can terminate case in switch statement

        String climbingLevel = "9a";
        switch (climbingLevel) {
            case "6a":
                System.out.println("beginner");
                break;
            case "7a":
                System.out.println("intermediate");
                break;
            case "8a":
                System.out.println("strong");
                break;
            case "9a":
                System.out.println("master");
                break;
            case "10a":
                System.out.println("future generations");
        }

        // Output:
        // master

    }
}
