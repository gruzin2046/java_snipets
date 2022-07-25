package _1_14_Basics;

public class _4_Operators {
    public static void main(String[] args) {
        int x = 4;
        int y = 10;
        // we can assign outcome of comparison to boolean
        boolean outcome = y > x;
        System.out.println(outcome);

        // there is difference between increment/decrement before and after
        int weightNumber = 60;
        System.out.println(weightNumber); //Prints: 60
        //increment before print statement
        System.out.println(++weightNumber); //Prints: 61
        System.out.println(weightNumber); //Prints: 61
        int ageNumber = 60;
        System.out.println(ageNumber); //Prints: 60
        //increment after print statement
        System.out.println(ageNumber++); //Prints: 60
        System.out.println(ageNumber); //Prints: 61

        // logical not operator (!) can be used to negate or not equal comparison
        if (!true == false && true != false) {
            System.out.println("victory!!!");
        }
    }
}
