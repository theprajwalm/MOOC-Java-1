
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int userInput = scanner.nextInt();
            if (userInput == 0) {
                break;
            }else{
                sum += userInput;
            }
        }
        System.out.println("Sum of the numbers: " + sum);
    }
}
