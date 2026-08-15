import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileStatistics {

    public static void main(String[] args) {

        Path filePath = Path.of("sample.txt");

        try {
            String content = Files.readString(filePath);

            int characters = content.length();
            int words = content.trim().isEmpty()
                    ? 0
                    : content.trim().split("\\s+").length;

            long lines = content.lines().count();

            System.out.println("File Statistics");
            System.out.println("----------------");
            System.out.println("Characters: " + characters);
            System.out.println("Words: " + words);
            System.out.println("Lines: " + lines);

        } catch (IOException e) {
            System.out.println("Unable to read file: " + e.getMessage());
        }
    }
}
