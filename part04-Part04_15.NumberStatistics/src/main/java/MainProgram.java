
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!

        Statistics object1 = new Statistics();
        Statistics object2 = new Statistics();
        Statistics object3 = new Statistics();

        System.out.println("Enter numbers");
        while (true) {
            int userNumb = scanner.nextInt();
            if (userNumb == -1) {
                break;
            }else{
                object1.addNumber(userNumb);
            }
            if (userNumb % 2 == 0) {
                object2.addNumber(userNumb);
            }else{
                object3.addNumber(userNumb);
            }
        }
        System.out.println("Sum: " + object1.sum());
        System.out.println("Sum of even numbers:" + object2.sum());
        System.out.println("Sum of odd numbers: " + object3.sum());
        
    }
}
