
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        while(true){
            String numb = scanner.nextLine();
            if (numb.equals("end")) {
                break;
            }else{
                int intNumb = Integer.parseInt(numb);
                System.out.println(intNumb * intNumb * intNumb);
            }
        }

    }
}
