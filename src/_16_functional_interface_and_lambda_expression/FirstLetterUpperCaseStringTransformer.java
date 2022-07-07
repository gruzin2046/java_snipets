package _16_functional_interface_and_lambda_expression;

import java.util.Locale;

public class FirstLetterUpperCaseStringTransformer implements StringTransformer {
    @Override
    public String transformer(String string) {
        return String.valueOf(string.charAt(0)).toUpperCase(Locale.ROOT)
                + string.substring(1).toLowerCase(Locale.ROOT);
    }
}
