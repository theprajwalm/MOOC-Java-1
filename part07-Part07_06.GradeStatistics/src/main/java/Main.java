
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.

        //Part 1
        PointAverage example = new PointAverage();
        example.takingInput();

        //Part 1
        System.out.println("Point average (all): " + example.getAverage());

        //Part 2
        System.out.println("Point average (passing) : " + example.pointsAveragePassing());

        //Part 3
        System.out.println("Pass percentage: " + example.passPercentage());
    }
}
