import java.util.Scanner;

public class Lab401 {

	public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);
    System.out.print("Full Name : ");
    String fullName = scan.nextLine();
    int space = fullName.indexOf(' ');
    if(fullName.indexOf(' ') == -1) System.out.println("Incorrect Name");
    else
    {
      String firstName = fullName.substring(0, space);
      String lastName = fullName.substring(space + 1);
      System.out.println("First Name : " + firstName.toUpperCase() + 
                      "\nLast Name  : " + lastName);
    }
	} //end of MAIN
}