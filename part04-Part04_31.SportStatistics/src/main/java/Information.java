import java.util.ArrayList;

public class Information {
    private ArrayList<Statistics> list;

    ReadingFile hello = new ReadingFile();
    
    public Information(){
        this.list = hello.getList();
    }
    public int getGames(String team){
        int games = 0;
        for (Statistics statistics : list) {
            if (team.equals(statistics.getHomeTeam()) || (team.equals(statistics.getVisitingTeam()))) {
                games++;
            }
        }
        return games;
    }
}
