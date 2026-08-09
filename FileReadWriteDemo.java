import java.io.*;

public class FileReadWriteDemo {
    public static void main(String[] args) {
        String fileName = "sample.txt";

        // Writing to a file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Hello, this is a sample file.\n");
            writer.write("Java makes file handling straightforward.\n");
            writer.write("This is the third line.\n");
            System.out.println("Data written to " + fileName);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Reading from the file
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            int lineNumber = 1;
            System.out.println("\nReading contents of " + fileName + ":");
            while ((line = reader.readLine()) != null) {
                System.out.println(lineNumber + ": " + line);
                lineNumber++;
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
