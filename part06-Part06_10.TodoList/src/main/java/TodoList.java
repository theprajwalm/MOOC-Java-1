import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> taskList;
    
    //constructor
    public TodoList(){
        this.taskList = new ArrayList<>();
    }

    public void add(String task){
        taskList.add(task);
    }

    public void print(){
        int taskIndex = 1;
        for (String string : taskList) {
            System.out.println(taskIndex + ": " + string + "\n");
        }
    }

    public void remove(int number){
        
    }

    
}
