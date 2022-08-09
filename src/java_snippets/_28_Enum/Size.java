package java_snippets._28_Enum;

// create enum using enum key word
enum Size {
    // 1. create list of the enumerated type using constructor, there is no "new" operator
    SMALL("s"), MEDIUM("m"), LARGE("l");

    // 2. we can create fields
    private final String desc;

    // 3. we can define constructor methods with access to the field
    private Size(String description) {
        this.desc = description;
    }

    // 4. we can create methods like get field
    public String getDescription() {
        return desc;
    }

    public static void main(String[] args) {
        // 5. we can use enum f.e inside constructor
        TShirt greenT = new TShirt("greener", SMALL);

        // 6. we can compare enum using == operator (also equals())
        System.out.println(greenT.getSize() == MEDIUM); // prints: false

        // 7. we can access description directly
        System.out.println(SMALL.desc); // prints: s

        // 8. we can use getter on instance
        System.out.println(greenT.getSize().getDescription()); // prints: s
        System.out.println(greenT.getSize().desc); // prints: s

        //*********** Methods from enum class ***********

        // valueOf(String name) return Type.VALUE
        Size size1 = Size.valueOf("LARGE"); // return Size.LARGE
        // ordinal() return num, starting from 0
        int numMedium = Size.MEDIUM.ordinal(); // return 1
        // values() return array of all values stored in enum
        Size[] values = Size.values(); // SMALL, MEDIUM, LARGE
    }
}
