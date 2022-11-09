package java_snippets._20_43_Adv_Topics;
// In Java, it is also possible to nest classes (a class within a class).
// The purpose of nested classes is to group classes that belong together,
// which makes your code more readable and maintainable.


class OuterClass {
    int x = 10;
    boolean isAwesome = false;

    // inner class can be private (visible only inside outer class)
    // as well as public, default and protected.
    // inner class can be also abstract and final
    class InnerClass {
        int y = 5;
        boolean isAwesome = false;

        // accessing fields from inner level we can use "this" key word:
        void setAwesomeToTrue() {
            // field of the inner class
            this.isAwesome = true;
            // field of the outer class
            OuterClass.this.isAwesome = true;
        }
    }

    public static void main(String[] args) {

        // To access the inner class, create an object of the outer class,
        OuterClass myOuter = new OuterClass();

        // and then create an object of the inner class:
        OuterClass.InnerClass myInner = myOuter.new InnerClass();

        // now we can use both inner and outer class methods and properties.
        System.out.println(myInner.y + myOuter.x);

    }


}