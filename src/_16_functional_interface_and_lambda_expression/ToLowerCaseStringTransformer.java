package _16_functional_interface_and_lambda_expression;

import java.util.Locale;

public class ToLowerCaseStringTransformer implements StringTransformer {
    @Override
    public String transformer(String string) {
        return string.toLowerCase(Locale.ROOT);
    }
}
