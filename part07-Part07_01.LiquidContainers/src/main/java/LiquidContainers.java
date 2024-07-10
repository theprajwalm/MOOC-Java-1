
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer = 0;


        while (true) {
            System.out.print("First: " + firstContainer + "/100 \n" + 
                            "Second: " + secondContainer + "/100\n");

            String input = scan.nextLine();

            //quit
            if (input.equals("quit")) {
                break;
            }

            //breaking the command into two halfs
            String[] parts = input.split(" ");
            String command = parts[0];
            int value = Integer.valueOf(parts[1]);

            //adding
            if (command.equals("add")) {
                if (value >= 0) {
                    if (firstContainer + value >= 100) {
                        firstContainer = 100;
                    }else{
                        firstContainer +=value;
                    }
                }
            }
            
            //moving
            if (command.equals("move")) {
                if (firstContainer > 0) {
                    if (value > 0) {
                        if (firstContainer - value >= 0) {
                            
                            firstContainer -= value;
                            
                            if(secondContainer + value > 100 ){
                                secondContainer = 100;
                            }else{
                                secondContainer += value;
                            }
                        }else{
                            secondContainer = firstContainer;
                            firstContainer = 0;
                        }
                    }
                }
            }

            //removing
            if (command.equals("remove")) {
                if(secondContainer != 0){
                    if (secondContainer - value < 0) {
                        secondContainer = 0;
                    }else{
                        secondContainer -= value;
                    }
                }
            }
        }
    }

}
