package java_snippets._1_14_Basics;

//ternary operator

public class _36_Ternary_operator {

    public static void main(String[] args) {
        boolean areYouClever = true;

        // variable = (condition) ? expressionTrue :  expressionFalse;

        String statement = areYouClever ? "you're smart" : "you're stupid";
        System.out.println(statement); // prints: "you're smart"
    }
}