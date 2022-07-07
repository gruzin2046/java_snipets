package _16_functional_interface_and_lambda_expression;

import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String[] texts = {"Ala","ma", "kotA"};

        //There is no need for class or instance if we are using lambda
        //StringTransformer toUpperCaseStringTransformer = new ToUpperCaseStringTransformer();
        //StringTransformer toLowerCaseStringTransformer = new ToLowerCaseStringTransformer();

        // 1. example with lambda, method defined as a parameter inside
        String[] result1 = transformStrings(texts, string -> string.toUpperCase(Locale.ROOT));
        System.out.println(Arrays.toString(result1));// {"ALA","MA", "KOTA"}

        // 2. example with lambda, method defined as an instance
        StringTransformer transformerInLambda = string -> string.toLowerCase(Locale.ROOT);
        String[] result2 = transformStrings(texts, transformerInLambda);
        System.out.println(Arrays.toString(result2));// // {"ala","ma", "kota"}

        // 3. example with method defined inside class. Instance is passed as an argument
        StringTransformer firstLetterUpperCaseStringTransformer = new FirstLetterUpperCaseStringTransformer();
        String[] result3 = transformStrings(texts, firstLetterUpperCaseStringTransformer);
        System.out.println(Arrays.toString(result3)); //{"Ala","Ma", "Kota"};
    }

    public static String[] transformStrings(String[] strings, StringTransformer stringTransformer){
        String[] result = new String[strings.length];
        //todo -> done
        for (int i = 0; i < strings.length; i++) {
            result[i] = stringTransformer.transformer(strings[i]);
        }
        return result;
    }
}
