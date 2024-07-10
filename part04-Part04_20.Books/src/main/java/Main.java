import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> data = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            int pages = Integer.valueOf(scanner.nextLine());
            int publishedYear = Integer.valueOf(scanner.nextLine());
            data.add(new Book(title, pages, publishedYear));
        }


        System.out.println("What information will be printed? ");
        String userInput = scanner.nextLine();
        if (userInput.equals("everything")) {
            for (Book book : data) {
                System.out.println(book.toString());
            }
        }
        if (userInput.equals("name")) {
            for (Book book : data) {
                System.out.println(book.name());
            }
        }
        scanner.close();

    }
}
