import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TextFileAnalyzer {

    public static void main(String[] args) {

        Path path = Path.of("data.txt");

        try {

            String content = Files.readString(path);

            int characters = content.length();

            int words = content.trim().isEmpty()
                    ? 0
                    : content.trim().split("\\s+").length;

            long lines = content.lines().count();

            System.out.println("===== FILE ANALYSIS =====");
            System.out.println("Lines      : " + lines);
            System.out.println("Words      : " + words);
            System.out.println("Characters : " + characters);

        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}
