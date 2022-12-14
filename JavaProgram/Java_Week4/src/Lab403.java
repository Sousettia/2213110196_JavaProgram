import java.util.Scanner;

public class Lab403 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Message : ");
        String message = scan.nextLine();
        System.out.println(((message.toLowerCase().indexOf("nichi") >= 0)?"Nichi is a sentence":message));
    }
}
