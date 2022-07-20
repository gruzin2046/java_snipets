import java.util.InputMismatchException;
import java.util.Scanner;

//list of exceptions https://docs.oracle.com/javase/7/docs/api/java/lang/RuntimeException.html

class Test {
    public static void main(String[] args) {
        //initiate scanner, int array, and error boolean
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[2];
        boolean error = true;

        // do while loop wrapper is doing everything from the start in case of error
        do {
            // try block with code which can throw the Exception
            try {
                System.out.println("Podaj 1 liczbę: ");
                numbers[0] = sc.nextInt();
                System.out.println("Podaj 2 liczbę: ");
                numbers[1] = sc.nextInt();

                System.out.println("Którą wartość wyświetlić (1 lub 2)? ");
                System.out.println("Liczba:" + numbers[sc.nextInt() - 1]);
                error = false;
            // first catch in case of InputMismatchException (in case of input else than int)
            } catch (InputMismatchException ex) {
                System.out.println("Nie podałeś liczby całkowitej, spróbuj jeszcze raz: ");
            // sec catch in case ArrayIndexOutOfBoundsException (in case of different elem than from arr)
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Miało być 1 lub 2, zacznijmy od nowa: ");
            // block finally will always be executed, even if there is no catch
            } finally {
                // clean scanner from previous input
                sc.nextLine();
            }
        } while (error);
        sc.close();
    }
}