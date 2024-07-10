
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            String vorName = scanner.nextLine();
            if (vorName.equals("")) {
                break;
            }
            
            String Nachname = scanner.nextLine();
            String identificationNumber = scanner.nextLine();
            System.out.println(vorName + " " + Nachname);
        }
    }
}