
import java.util.ArrayList;

public class Sum {
    public static int sum(ArrayList<Integer> numbers){
        int counter = 0;
        int total = 0;
        while (counter < numbers.size()) {
            total += numbers.get(counter);
            counter++;
        }
        return total;
    }

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        System.out.println(sum(numbers));
    }

}
