package java_snippets._41_Files_operations.Serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


class ObjectWriter {
    public static void main(String[] args) {
        // define file name
        String fileName = "objectOutputStreamFile.obj";
        // define path to file
        String path = "C:\\Users\\aluniewi\\IdeaProjects\\Java_start_snipets" +
                "\\src\\java_snippets\\_41_Files_operations\\Serializable\\" + fileName;
        Person p1 = new Person("Jan", "Kowalski");

        try (
                // try with recourses - initiate FileOutputStream and ObjectOutputStream
                var fs = new FileOutputStream(path);
                var os = new ObjectOutputStream(fs)
        ) {
            // save object to file
            os.writeObject(p1);
            System.out.println("Object save to file");

        } catch (IOException e) {
            System.err.println("error while saving file: " + fileName);
            e.printStackTrace();
        }
    }
}

