
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int userInput = scanner.nextInt();
            if (userInput == -1) {
                break;
            }else{
                list.add(userInput);
            }
        }

        double sum = 0;
        for (Integer index : list) {
            sum += index;
        }
        System.out.println("Average: " + (sum/list.size()));
    }
}
