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

    public static int indexOfSmallestFrom(int[] array, int startIndex){
        int smallestIndex = startIndex;
        int minimumValue = array[startIndex];
        for (int i = startIndex + 1; i < array.length; i++) {
            if (minimumValue > array[i]) {
                minimumValue = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2){
        int helper = array[index1];
        array[index1] = array[index2];
        array[index2] = helper;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int index1 = i;
            int index2 = indexOfSmallestFrom(array, i);
            swap(array, index1, index2);
        }
    }
}
