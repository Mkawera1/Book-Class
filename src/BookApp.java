import java.util.Scanner;

public class BookApp {
    public static void main(String[] args) {

    Book one = new Book("Got This","John Doe","Yellow Book",3.02,true);

            String tmp = one.displayText();
        System.out.println(tmp);

        System.out.println("Enter a number of books");
        Scanner sc = new Scanner(System.in);
        int numberOfBooks = sc.nextInt();
        double total = one.displayCost(numberOfBooks);
        System.out.println("Total is " + total);



    }
}
