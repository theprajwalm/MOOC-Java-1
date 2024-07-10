import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> holdList;
    private int maximumWeight;
    
    //constructor
    public Hold(int maximumWeight){
        this.maximumWeight = maximumWeight;
        this.holdList = new ArrayList<>();
    
    }

    public void addSuitcase(Suitcase suitcase){
        if (holdListSuitcasesWeight() + suitcase.totalWeight() <= maximumWeight){
            holdList.add(suitcase);
        }   
    }

    public int holdListSuitcasesWeight(){
        int totalWeight = 0;
        for (Suitcase suitcase : holdList) {
            totalWeight += suitcase.totalWeight();
        }
        return totalWeight;
    }

    public String toString(){
        int numberOfSuitcases = 0;
        int weightOfSuitcases = 0;
        for (Suitcase suitcase : holdList) {
            numberOfSuitcases += 1;
            weightOfSuitcases +=suitcase.totalWeight();
        }
        return numberOfSuitcases + " suitcases (" + weightOfSuitcases + "kg)";
    }
    public void printItems(){
        for (Suitcase suitcase : holdList) {
            System.out.println(suitcase.suitcaseItemsList());
    }
    }
}