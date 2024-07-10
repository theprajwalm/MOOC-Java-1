
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
        
    }

        public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit){
            int index = 0;
            int size = numbers.size();
            System.out.println("The numbers in the range [" + lowerLimit + ", " + upperLimit + "]");
            while (index < size) {
                if (numbers.get(index)<=upperLimit && lowerLimit <=numbers.get(index)) {
                    System.out.println();
                }
                index++;
            }
            
        }
}
