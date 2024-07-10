
import java.util.ArrayList;

public class RemoveLast {
    public static void removeLast(ArrayList<String> strings){
        int size = strings.size();
        if (size == 0) {
        }else{
        strings.remove(size - 1);
        }
    }

    public static void main(String[] args) {
        // Try your method in here
    }

}
