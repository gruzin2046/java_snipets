package java_snippets._1_14_Basics;

public class _3_Variables {
    public static void main(String[] args) {
        //constant variables - final key word
        // _ help to separate long numbers to clear; 2_000_000 is the same as 2000000
        final int millennium = 2_000;
        // cannot assign new value to final variable: millennium = 2018;

        //we can use var key word - type of variable will be assigning automatically
        var firstName = "Albert"; //here type is obviously String
    }
}
