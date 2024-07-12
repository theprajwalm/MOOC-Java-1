
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        try (Scanner readFile = new Scanner(Paths.get(file))){
            int numbers = 0;
            
            while (readFile.hasNextLine()) {
                int number = Integer.valueOf(readFile.nextLine());
                if (number >= lowerBound && number <= upperBound) {
                    numbers += 1;
                }
            }
            System.out.println("Numbers: " + numbers);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        
    }

}