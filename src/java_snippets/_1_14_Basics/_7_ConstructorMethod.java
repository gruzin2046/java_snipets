package java_snippets._1_14_Basics;

public class _7_ConstructorMethod {
    int num1;
    int num2;

    //constructor method
    _7_ConstructorMethod(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // add and print numbers method (not-static method)
    int addAndPrintTwoNumbers() {
        return num1 + num2;
    }

    public static void main(String[] args) {
        // create object
        _7_ConstructorMethod myNumbers = new _7_ConstructorMethod(8, 8);
        // call add(...) method on object
        int sum = myNumbers.addAndPrintTwoNumbers();
        System.out.println(sum);
    }
}
