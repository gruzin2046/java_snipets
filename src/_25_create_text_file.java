import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;

public class _25_create_text_file {
    public static void main(String[] args) throws IOException {

        // let's create path directory
        String home = System.getProperty("user.home");
        String desktop = System.getProperty("user.home") + "\\Desktop";
        String tmp = System.getProperty("java.io.tmpdir");
        System.out.println(home); // prints: C:\Users\aluniewi
        System.out.println(desktop); // prints: C:\Users\aluniewi\Desktop
        System.out.println(tmp); // prints: C:\Users\aluniewi\AppData\Local\Temp\

        // create empty file using:
        Files.createFile(
                Path.of(home, "Desktop", "file.txt"));
        // create empty file, same directory:
        Files.createFile(
                Path.of(desktop,  "file2.txt"));
        // create file with string in it:
        Path p3 = Files.writeString(
                Path.of(home, "Desktop", "stringFile.txt"),
                "hello you",
                StandardCharsets.UTF_8,
                StandardOpenOption.CREATE
        );
    }

}
