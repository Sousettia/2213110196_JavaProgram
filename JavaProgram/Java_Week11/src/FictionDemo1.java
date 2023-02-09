import java.util.Scanner;

public class FictionDemo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input book name : ");
        String bookname = scan.nextLine();
        System.out.print("Input published year: ");
        int publishYear = scan.nextInt();
        FictionBook book = new FictionBook(bookname, publishYear);

        System.out.print("Input author name  : ");
        scan.nextLine();
        String authorName = scan.nextLine();
        System.out.print("Input author email : ");
        String authorEmail = scan.nextLine();

        book.setAuthorName(authorName);
        book.setEmail(authorEmail);
        
    }
}
