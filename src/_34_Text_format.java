public class _34_Text_format {
    public static void main(String[] args) {
        // 1. to format certain string we can use
        // - System.out.printf()
        // - String.format(String s, arguments)
        // - formatted() -> called on string itself

        // 2. to specify how to format a string we use notation:
        // %[argument_index$][flags][width][.precision]conversion_type

        // conversion_type
        // most common: (b - boolean, c - character, d - decimal num, f - float, s - String)

        // argument_index$ is pointing which argument we want to use from given:
        String firstName = "Jan";
        int age = 23;
        char gender = 'M';
        System.out.printf("Imię: %1$s, Płeć: %3$c, Wiek: %2$d%n", firstName, age, gender);

        // .precision
        double number = 123.4567890;
        System.out.printf("%.2f", number); //123.46

        // width describes minimum with of given argument (add spaces if needed)
        int num = 87123;
        System.out.printf("%20d", num); // prints:                87123
        String name = "Jan";
        System.out.printf("%10s", name); // prints:       Jan

        // flags are adding additional features:
        // '-' - result aligned to the left side
        // '+' - result will always have sign: + or -
        double positiveNumber = 123.456789;
        System.out.printf("%+.2f%n", positiveNumber); //+123.46

        //' ' - positive numbers will be displayed with additional space at front
        //'0' - numbers will be displayed with additional zeros if width is bigger
        //',' - big numbers will have additional separators
        //'(' - negative numbers will be inside brackets
    }
}
