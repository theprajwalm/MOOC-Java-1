import java.util.Scanner;

public class TextUI {
     
    //constructor
    public TextUI(Scanner scanner, SimpleDictionary simpledictionary){

    }

    public void Start(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
        String command = scanner.nextLine();
        if (command.equals("end")) {
            System.out.println("Bye bye!");
            break;
        }else if (command.equals("add")) {
            break;
        }
        }else{
            System.out.println("Unknown command");
        }
        }
        
    }
}
