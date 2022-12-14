import java.util.Scanner;
public class Lab504 
{
    public static void main(String[] args) 
	{
        Scanner scan = new Scanner(System.in);
        System.out.print("Please Enter Your Name, Seperated by a space.\n:");
        String FullName = scan.nextLine();
        String firstName = FullName.substring(0,FullName.indexOf(' '));
        System.out.println(abbreviatName(FullName) + firstName);
    }
    public static String abbreviatName(String fullname) 
    {
        String temp = "";
        for(int i = 0; i < fullname.length() ;i++)
        {
            if(fullname.charAt(i) == ' ')
            {
                temp += (fullname.charAt(i + 1) + ".").toUpperCase();
            }
        }
        return temp;
    }
}
