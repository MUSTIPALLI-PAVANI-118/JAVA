import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
class FileExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter file name: ");
            String fileName = sc.nextLine();
            File file = new File(fileName);
            Scanner fileReader = new Scanner(file);
            String data = fileReader.nextLine();
            int number = Integer.parseInt(data);
            System.out.println("Number read from file = " + number);
            fileReader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("ERROR: File not found!");
        }
        catch (NumberFormatException e) {
            System.out.println("ERROR: Invalid file format! File must contain a valid integer.");
        }
        catch (Exception e) {
            System.out.println("ERROR: Something went wrong while reading the file.");
        }
        finally {
            System.out.println("FILE HANDLING COMPLETED.");
            sc.close();
        }
    }
}




