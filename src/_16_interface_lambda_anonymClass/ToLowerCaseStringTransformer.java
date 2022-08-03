package _16_interface_lambda_anonymClass;

import java.util.Locale;

public class ToLowerCaseStringTransformer implements StringTransformer {
    @Override
    public String transformer(String string) {
        return string.toLowerCase(Locale.ROOT);
    }
}
