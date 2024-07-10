
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container firstContainer = new Container();
        Container secondContainer = new Container();


        while (true) {
            System.out.print("First: " + firstContainer + "\n" +  
                            "Second: " + secondContainer + "\n");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int value = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                firstContainer.add(value);
            }

            if (command.equals("remove")) {
                secondContainer.remove(value);

            }

            if (command.equals("move")) {
                if (firstContainer.contains() < value) {
                    secondContainer.add(firstContainer.contains());
                    firstContainer.setContainer(0);
                }else if(firstContainer.contains() == 0){
                    
                }else{
                    secondContainer.add(value);
                    firstContainer.remove(value);
                    
                }
            }
        }
    }

}
