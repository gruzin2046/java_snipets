package java_snippets._1_14_Basics;

public class _10_Switch {
    public static void main(String[] args) {
        String day = "Friday";

        // inside switch statement put byte, short, int, char or String
        switch (day) {
            case "Monday":
                System.out.println("Today is Monday");
                break;
            case "Tuesday":
                System.out.println("Today is Tuesday");
                break;
            case "Wednesday":
                System.out.println("Today is Wednesday");
                break;
            case "Thursday":
                System.out.println("Today is Thursday");
                break;
            case "Friday":
                System.out.println("Today is Friday");
                break;
            case "Saturday":
                System.out.println("Today is Saturday");
                break;
            case "Sunday":
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("this in not a day");
        }

        // instead of casual switch we can use enhanced switch statement,
        // shorter, clearer, without break
        day = "Monday";

        switch (day) {
            case "Monday" -> System.out.println("Today is Monday");
            case "Tuesday" -> System.out.println("Today is Tuesday");
            case "Wednesday" -> System.out.println("Today is Wednesday");
            case "Thursday" -> System.out.println("Today is Thursday");
            case "Friday" -> System.out.println("Today is Friday");
            case "Saturday" -> System.out.println("Today is Saturday");
            case "Sunday" -> System.out.println("Today is Sunday");
            default -> System.out.println("this in not a day");
        }
    }
}
