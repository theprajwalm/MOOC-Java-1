
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();
        double squareRoot = Math.sqrt(input1 + input2);
        System.out.println(squareRoot);
    }
}
