package _1_14_Basics;

// Regular expression
import java.util.regex.*;

public class _37_Regex_Pattern_Matcher {
    public static void main(String[] args) {

        String lorem = "Lorem ipsum lorem ipsum lorem ipsum wTF lorem ipsum";

        // create and describe pattern using .compile(String regex, int flags)
        Pattern pattern = Pattern.compile("wtf", Pattern.CASE_INSENSITIVE);

        // create matcher by calling .matcher(CharSequence input) method on pattern instance
        Matcher matcher = pattern.matcher(lorem);
        System.out.println(matcher);
        // Prints: java.util.regex.Matcher[pattern=wtf region=0,51 lastmatch=]

        // now we can check if pattern we created can be found in lorem
        boolean matchFound = matcher.find();
        System.out.println(matchFound); // Prints: true

    }
}