package _16_functional_interface_and_lambda_expression;

@FunctionalInterface
public interface StringTransformer {
    String transformer(String string);
}
