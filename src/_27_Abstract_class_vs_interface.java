public class _27_Abstract_class_vs_interface {
    //*******  DIFFERENCES  *******

    // 1. a_c contains both abstract and regular methods
    //    i_ contains only abstract methods (except 'default' modifier, from Java 8)

    // 2. a_c can have attributes, (like 'private String name')
    //    i_ can't have attributes - it's stateless

    // 3. class can extend only one a_c
    //    class can implement many interfaces

    //*******  SIMILARITIES  *******

    // 1. both are type of contract
    // 2. both can't be instanced
    // 3. both should have abstract methods (without the body)
    // 4. both can have static methods (from Java 9)
}
