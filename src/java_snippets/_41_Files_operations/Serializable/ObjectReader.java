package java_snippets._41_Files_operations.Serializable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

class ObjectReader {
    public static void main(String[] args) {
        // define file name
        String fileName = "objectOutputStreamFile.obj";
        // define path to file
        String path = "C:\\Users\\aluniewi\\IdeaProjects\\Java_start_snipets" +
                "\\src\\java_snippets\\_41_Files_operations\\Serializable\\" + fileName;
        // initiate empty instance of Person
        Person p1 = null;
        try (
                // try with recourses - initiate FileInputStream and ObjectInputStream
                var fis = new FileInputStream(path);
                var ois = new ObjectInputStream(fis);
        ) {
            // call readObject() on ois instance, cast to Person
            p1 = (Person) ois.readObject();
        } catch (ClassNotFoundException | IOException e) {
            System.err.println("Cannot read file");
            e.printStackTrace();
        }

        // print data if present
        if (p1 != null) {
            System.out.println("Data from file: " + p1.firstName + " " + p1.secondName);
        }
    }
}