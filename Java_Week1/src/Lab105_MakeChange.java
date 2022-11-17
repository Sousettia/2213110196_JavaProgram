import java.util.*;
public class Lab105_MakeChange 
{
	static final int HALFDOLLAR = 50;
	static final int QUARTER = 25;
	static final int DIME = 10;
	static final int NICKEL = 5;
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the change in cents: ");
		int change_input = scan.nextInt();
		System.out.println();
		System.out.println("The change you entered is  " + change_input);
		
		int change = change_input / HALFDOLLAR ;
		System.out.println("The number of half dollars to be returned is " + change);
		    change = change_input % HALFDOLLAR ;
		System.out.println("The number of quarters to be returned is "     + change / QUARTER);
			change = change % QUARTER ;
		System.out.println("The number of dimes to be returned is "        + change / DIME);
			change = change % DIME ;
		System.out.println("The number of nickels to be returned is "      + change / NICKEL);
			change = change % NICKEL ;
		System.out.println("The number of pennies to be returned is "      + change);

	}
}
