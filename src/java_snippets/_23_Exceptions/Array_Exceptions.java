package java_snippets._23_Exceptions;

public class Array_Exceptions {
    public static void main(String[] args) {

        // 1. NullPointerException
        int[] numbers = null;
        int size = numbers.length; // It throws NPE

        // 2. NegativeArraySizeException
        int negSize = -1;
        int[] numbers2 = new int[negSize]; // an exception here

        // 3. ArrayIndexOutOfBoundsException
        int[] array = { 1, 2, 3 }; // an array of ints

        int n1 = array[2]; // n1 is 3
        int n2 = array[3]; // Exception
    }
}
