
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        while (true) {
            System.out.println("Give a number:");
            String userNum = scanner.nextLine();
            if (userNum.equals("0")) {
                break;
            }else{
                counter += 1;
            }
        }
        System.out.println("Number of numbers: " + counter);
    }
}
