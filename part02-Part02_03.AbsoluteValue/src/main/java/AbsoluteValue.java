
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input < 0) {
            int result = input * -1;
            System.out.println(result);
        }else{
            System.out.println(input);
        }
    }
}
