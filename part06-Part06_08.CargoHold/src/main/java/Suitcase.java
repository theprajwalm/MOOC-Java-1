import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maximumWeight;

    //constructor
    public Suitcase(int maximumWeight){
        this.items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public void addItem(Item item){
        
        if (this.totalWeight() + item.getWeight()  <= this.maximumWeight) {
            this.items.add(item);
        }
    }

    public String toString(){
        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        }else if (this.suitcaseItems() == 1) {
            return "1 item (" + this.totalWeight() + " kg)"; 
        }
        return this.suitcaseItems() + " items (" + this.totalWeight() + "kg)";
    }

    public void printItems(){
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public int suitcaseItems(){
        int numberOfItems = 0;
        for (Item item : items) {
            numberOfItems += 1;
        }
        return numberOfItems;
    }

    public String suitcaseItemsList(){
        String itemList = "";
        for (Item item : items) {
            itemList += item.toString() + "\n";
        }
        return itemList;
    }

    public int totalWeight(){
        int totalWeight = 0;
        for (Item item : items) {
            totalWeight += item.getWeight(); 
        }
        return totalWeight;
    }

    public Item heaviestItem(){
        if (items.isEmpty()) {
            return null;
        }else{
            int heaviestWeight = items.get(0).getWeight();
            Item heaviesItem = items.get(0);
            for (Item item : items) {
                if (heaviestWeight < item.getWeight()) {
                    heaviestWeight = item.getWeight();
                }
                if (heaviestWeight == item.getWeight()) {
                    heaviesItem = item;
                }
            }
            return heaviesItem;    
        }
    }    
}