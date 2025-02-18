import java.util.ArrayList;

public class Stack{
    private ArrayList<String> list;

    public Stack(){
        this.list = new ArrayList<>();
    }

    public boolean isEmpty(){
        if (this.list.isEmpty()) {
            return true;
        }
        return false;
    }

    public void add(String value){
        this.list.add(value);
    }

    public ArrayList<String> values(){
        return this.list;
    }

    public String take(){
        String lastValue = this.list.get(this.list.size() - 1);
        this.list.remove(lastValue);
        return lastValue;
    }
}