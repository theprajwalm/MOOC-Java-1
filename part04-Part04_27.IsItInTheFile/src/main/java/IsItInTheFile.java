
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

import javax.management.openmbean.ArrayType;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        ArrayList<String> string = new ArrayList<>(); 

        try (Scanner readingFile = new Scanner(Paths.get(file))){
            while (readingFile.hasNextLine()) {
                string.add(readingFile.nextLine());
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Reading the file " + file + " failed");
        }

        if (string.contains(searchedFor)) {
            System.out.println("Found!");
        }
        else{
            System.out.println("Not found.");
        }
    }
}