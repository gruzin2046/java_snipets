import java.math.BigDecimal;
import java.math.RoundingMode;

public class _19_double_rounded {
    public static void main(String[] args) {
        //double is not rounded
        double input = 17.032942938;

        // round double using BigDecimal and setScale(int precision, Rounding mode)
        // about Rounding mode look: https://docs.oracle.com/javase/8/docs/api/java/math/RoundingMode.html
        BigDecimal rounded = new BigDecimal(input).setScale(3, RoundingMode.HALF_UP);

        System.out.println(rounded); //prints 17.033

        // cast to double type again
        input = rounded.doubleValue();
        System.out.println(input);
    }
}
