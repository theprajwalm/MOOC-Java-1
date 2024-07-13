import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadingFile {

    private ArrayList<Statistics> list = new ArrayList<>();

    public void reading(String file){

        try (Scanner readingFile = new Scanner(Paths.get(file))){
            while (readingFile.hasNextLine()) {
                String row = readingFile.nextLine();
                String[] parts = row.split(",");
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homeTeamPoints = Integer.valueOf(parts[2]);
                int visitngTeamPoints = Integer.valueOf(parts[3]);
                
                this.list.add(new Statistics(homeTeam, visitingTeam, homeTeamPoints, visitngTeamPoints));
            }
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }

    public ArrayList<Statistics> getList(){
        return this.list;
    }

}
