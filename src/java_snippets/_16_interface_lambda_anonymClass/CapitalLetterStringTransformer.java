package java_snippets._16_interface_lambda_anonymClass;

public class CapitalLetterStringTransformer implements StringTransformer {
    @Override
    public String transformer(String string) {
        return String.valueOf(string.charAt(0)).toUpperCase()
                + string.substring(1).toLowerCase();
    }
}
