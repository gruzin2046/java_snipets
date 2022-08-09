package java_snippets._41_Files_operations.Serializable;

import java.io.Serial;
import java.io.Serializable;

public class Person implements Serializable {
    @Serial
    private static final long serialVersionUID = -8023014907992758921L;
    String firstName;
    String secondName;

    @Override
    public String toString() {
        return  firstName + " " + secondName;
    }

    public Person(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

}
