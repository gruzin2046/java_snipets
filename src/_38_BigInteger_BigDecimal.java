import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class _38_BigInteger_BigDecimal {
    public static void main(String[] args) {
        // big decimal for big integers
        // big decimal for big floating numbers
        // create Big using String inside constructor
        BigInteger bigInteger1 = new BigInteger("99999999999999999999999999999999");
        BigDecimal bigDecimal1 = new BigDecimal("34192837498127348971298.2342134");

        // create BigInteger using valueOf(long l)
        BigInteger bigInteger2 = BigInteger.valueOf(73412749871239847L);
        BigDecimal bigDecimal2 = BigDecimal.valueOf(73412749871239847L);

        // do NOT create bigDecimal from double itself!!!!!
        BigDecimal bigDecimal3 = new BigDecimal(0.3);
        BigDecimal bigDecimal4 = new BigDecimal(0.7);
        BigDecimal bigDecimal5 = bigDecimal4.subtract(bigDecimal3);
        System.out.println(bigDecimal5); // prints 0.399999999999999966693309261245303787291049957275390625

        // math operation using methods (add, subtract, multiply, divide)
        BigInteger sum = bigInteger1.add(bigInteger2);
        BigDecimal difference = bigDecimal2.subtract(bigDecimal1);

        //rounding double using big decimal
        double input = 17.032942938;

        // round double using BigDecimal and setScale(int precision, Rounding mode)
        // about Rounding mode look: https://docs.oracle.com/javase/8/docs/api/java/math/RoundingMode.html
        BigDecimal rounded = new BigDecimal(input).setScale(3, RoundingMode.HALF_UP);

        System.out.println(rounded); // 17.033

        // cast to double type again
        input = rounded.doubleValue();

    }
}
