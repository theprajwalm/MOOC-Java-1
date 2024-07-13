import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("File: ");
        String file = scan.nextLine();

        System.out.println("Team: ");
        String team = scan.nextLine();

        Information infoObject = new Information();
        ReadingFile readObj = new ReadingFile();
        readObj.reading(file);

        System.out.println("Games: " + infoObject.getGames(team));
    }
}
