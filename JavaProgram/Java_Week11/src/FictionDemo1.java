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
        boolean namecheck = false;
        boolean emailcheck = false;
        while(book.checkFormatName() == false){
            System.out.print("Input author name, again ([name] [surname])  : ");
            authorName = scan.nextLine();
            book.setAuthorName(authorName);
        }
        namecheck = true;
        while(book.checkEmail() == false){
            System.out.print("Input author email, again (endswith @hotmail.com or @windowslive.com) : ");
            authorEmail = scan.nextLine();
            book.setEmail(authorEmail);
        }
        emailcheck = true;
        System.out.println(book);
        
    }
}
