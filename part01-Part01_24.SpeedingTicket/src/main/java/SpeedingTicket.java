
import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here. 
        int input = scanner.nextInt();
        System.out.println("Given Speed:");
        if (input > 120) {
            System.out.println("Speeding ticket!");
        }
    }
}
