public class _33_StringBuilder {
    public static void main(String[] args) {
        // 1. String builder class offers us fastest and easiest way to
        // create and modify strings

        StringBuilder stringBuilder = new StringBuilder();
        char[] charArr = new char[] {'a', '1', '$'};
        String str = "xyz";

        //************ METHODS ************
        // 2. append convert multiple types to a string and add them
        stringBuilder.append(2.2);
        stringBuilder.append(charArr);
        stringBuilder.append(str);

        System.out.println(stringBuilder); // prints: 2.2a1$xyz

        // 3. insert(int index, String value) insert string on given index
        stringBuilder.insert(4, "yyy");
        System.out.println(stringBuilder); // prints: 2.2ayyy1$xyz

        // 4. charAt(int index) returns char from given index
        char dollar = stringBuilder.charAt(8);
        System.out.println(dollar); // prints: $

        // 5. indexOf() returns index given string
        int xxx = stringBuilder.indexOf("xxx");
        System.out.println(xxx); // prints: -1
        int yyy = stringBuilder.indexOf("yyy");
        System.out.println(yyy); // prints: 4

        // 6. toString() returns string value from builder
        String strValue = stringBuilder.toString();
        System.out.println(strValue);
    }
}
