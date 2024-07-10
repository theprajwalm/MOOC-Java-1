import java.util.ArrayList;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};

    }

    public static int smallest(int[] array){
        int smallestValue = array[0];
        for (int i : array) {
            if (i < smallestValue) {
                smallestValue = i;
            }
        }
        return smallestValue;
    }

    public static int indexOfSmallest(int[] array){
        int smallestValue = smallest(array);
        int index = 0;
        
        for (int i : array) {
            if (smallestValue == i) {
                break;
                
            }else{
                index += 1;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex){
        int minimum = table[startIndex];
        int index = startIndex;
        for (int i = startIndex; i < table.length - 1; i++) {
            if (table[i] < minimum) {
                minimum = table[i];
                index++;
            }
        }
        return index;
    }

}
