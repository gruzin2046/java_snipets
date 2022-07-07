package _16_functional_interface_and_lambda_expression;

import java.util.Locale;

public class ToUpperCaseStringTransformer implements StringTransformer {
    @Override
    public String transformer(String string) {
        return string.toUpperCase(Locale.ROOT);
    }
}
