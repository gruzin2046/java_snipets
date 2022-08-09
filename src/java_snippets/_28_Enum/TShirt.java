package java_snippets._28_Enum;

public class TShirt {
    private final Size size;
    private final String name;

    public Size getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public TShirt(String name, Size size) {
        this.name = name;
        this.size = size;
    }


}
