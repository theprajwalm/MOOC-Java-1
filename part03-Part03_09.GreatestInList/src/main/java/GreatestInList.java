
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        
        System.out.println("");

        // implement finding the greatest number in the list here
        int greatestNumber = list.get(0);
        int size = list.size();
        int counter = 1;

        while (counter < size) {
            if (greatestNumber < list.get(counter)) {
                greatestNumber = list.get(counter);
            }
            counter++;
        }

        System.out.println("The greatest number: " + greatestNumber);
    }
}
