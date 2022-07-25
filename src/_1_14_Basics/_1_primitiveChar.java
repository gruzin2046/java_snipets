package _1_14_Basics;

public class _1_primitiveChar {
    public static void main(String[] args) {
        //we can use special signs, for example umbrella (search for: "unicode table" in google)
        // default code is UTF-16
        System.out.println('\u2602');
        // concatenation of two char will output integer sum of unicode:
        System.out.println('a' + 'b'); //prints 195
    }
}
