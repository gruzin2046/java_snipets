package java_snippets._16_interface_lambda_anonymClass;

import java.util.Locale;

public class ToUpperCaseStringTransformer implements StringTransformer {
    @Override
    public String transformer(String string) {
        return string.toUpperCase(Locale.ROOT);
    }
}
