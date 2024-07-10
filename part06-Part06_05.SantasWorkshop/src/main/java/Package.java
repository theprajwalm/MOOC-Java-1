import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> list;

    public Package(){
        this.list = new ArrayList<>();
    }


    public void addGift(Gift gift){
        this.list.add(gift);
    }

    public int totalWeight(){
        int totalWeight = 0;
        for (int i = 0; i < list.size(); i++) {
            Gift element = list.get(i);
            totalWeight += element.getWeight();
        }
        return totalWeight;
    }
}
