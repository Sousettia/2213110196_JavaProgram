import java.util.Scanner;
import java.util.function.IntUnaryOperator;

public class Lab404 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Text : ");
        String text = scan.nextLine().toLowerCase().replace(" ", "");
        
        int n = 0;
		for(int i = text.length() - 1 ; i >= 0 ; i--)
        {
            if(text.charAt(i) == text.charAt(n)) n++;
        }

        System.out.println((i == text.length())?"It is palindrome":"It is not palindrome");
    }
}
