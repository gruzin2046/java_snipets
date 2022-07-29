package _16_interface_and_lambda_expression;

public class CapitalLetterStringTransformer implements StringTransformer {
    @Override
    public String transformer(String string) {
        return String.valueOf(string.charAt(0)).toUpperCase()
                + string.substring(1).toLowerCase();
    }
}
