import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class FileReadHandler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter file name:");
        String fileName = sc.nextLine();

        try {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            Scanner fileScanner = new Scanner(file);

            System.out.println("File content:");
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                int num = Integer.parseInt(line);
                System.out.println(num);
            }

            fileScanner.close();
            fr.close();
        } catch (java.io.FileNotFoundException e) {
            System.out.println("File not found");
        } catch (NumberFormatException e) {
            System.out.println("Invalid file format");
        } catch (Exception e) {
            System.out.println("Error reading file");
        }

        sc.close();
    }
}

