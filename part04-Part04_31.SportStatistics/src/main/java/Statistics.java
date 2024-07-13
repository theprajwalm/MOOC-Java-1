public class Statistics {

    private String homeTeam;
    private String visitngTeam;
    private int homeTeamPoints;
    private int visitngTeamPoints;

    public Statistics(String hometTeam, String visitingTeam, int homeTeamPoints, int visitngTeamPoints){
        this.homeTeam = hometTeam;
        this.visitngTeam = visitingTeam;
        this.homeTeamPoints = homeTeamPoints;
        this.visitngTeamPoints = visitngTeamPoints;
    }

    public String getHomeTeam(){
        return this.homeTeam;
    }

    public String getVisitingTeam(){
        return this.visitngTeam;
    }
}
