package readfiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) {

        Path myPath = Path.of ("input.txt");    //Newer style, can convert to File with .toFile()


        try (Scanner fileScanner = new Scanner (myPath)) {

            while (fileScanner.hasNextLine ()) {
                String s = fileScanner.nextLine ();
                System.out.println (s);
            }

        } catch (IOException e) {
            System.out.println ("Can't read from file");
        }
        try {
            List <String> allLines = Files.readAllLines (myPath);
        } catch (IOException e) {
            System.out.println ("");
        }
    }
}

