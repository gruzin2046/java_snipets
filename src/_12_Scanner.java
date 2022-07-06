import java.util.Scanner;
import java.util.Locale;

class _12_Scanner {
    public static void main(String[] args) {
        //create scanner object
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age");
        //save entered age using .nextInt() method.
        // we can find same methods for double, short, etc.
        int userAge = scanner.nextInt();

        System.out.println("Enter your name");
        //save entered name using .next() method
        String userName = scanner.next();

        System.out.println("Enter your last name");
        String userLastName = scanner.next();

        System.out.println("hi " + userName + " " + userLastName + ", you're " + userAge + " year's old.");

        /*
        if we want to save decimal numbers using for example .nextDouble() we can face problem with separators:
         2.4 (dot is used in USA), 2,5 (coma is used in Europe)
        It might cause error: InputMismatchException
        We can handle it by setting local country using .useLocale():
        */
        scanner.useLocale(Locale.GERMANY);
        scanner.useLocale(Locale.US);

        // we can also close stream System.in using .close() method
        scanner.close();
    }
}


