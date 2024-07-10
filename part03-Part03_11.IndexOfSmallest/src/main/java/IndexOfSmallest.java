
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int inputNum = scanner.nextInt();
            if (inputNum == 9999) {
                break;
            }else{
                list.add(inputNum);
            }
        }
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        int smallestNum = list.get(0);
        int index = 0;
        while (index < list.size()) {
            if(smallestNum > list.get(index)){
                smallestNum = list.get(index);
            }
            index++;
        }
        System.out.println("Smallest number: " + smallestNum);
        index = 0;
        while (index < list.size()) {
            if(smallestNum == list.get(index)){
                System.out.println("Found at index: " + index);
            }
            index++;
        }
    }
}
