import java.util.Scanner;

public class BookDemo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input author name  : ");
        String name = scan.nextLine();
        System.out.print("Input author email : ");
        String email = scan.nextLine();

        Author1 Lee = new Author1(name,email);
        System.out.println(Lee);
        System.out.println();

        System.out.print("Input book title : ");
        String title = scan.nextLine();
        System.out.print("Input book page  : ");
        int page = scan.nextInt();
        scan.close();
        
        Book1 book = new Book1(title,Lee,page);
        System.out.println();
        System.out.println(book);
    }
}
