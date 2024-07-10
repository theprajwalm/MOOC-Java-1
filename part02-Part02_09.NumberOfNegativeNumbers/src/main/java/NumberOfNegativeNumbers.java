
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int negativeCounter = 0;
        while (true) {
            System.out.println("Give a number:");
            int userInput = scanner.nextInt();
            if (userInput == 0) {
                break;
            }else if(userInput < 0){
                negativeCounter++;
            }
        }
        System.out.println("Number of negative numbers: " + negativeCounter);
    }
}
