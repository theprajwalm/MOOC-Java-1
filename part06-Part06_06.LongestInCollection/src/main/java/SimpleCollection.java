
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String longest(){
        if (this.elements.isEmpty()) {
            return null;
        }else{
            int longestStringValue = this.elements.get(0).length();
            String longestString = this.elements.get(0);
            for (int i = 0; i < this.elements.size(); i++) {
                if(longestStringValue < this.elements.get(i).length()){
                    longestString = this.elements.get(i);
                    longestStringValue = this.elements.get(i).length();
                }
            }
            return longestString;
        }
    }
    
}
