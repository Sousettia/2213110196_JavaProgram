import java.text.*;
import javax.swing.*;

public class Lab106_MakeChange 
{
	public static void main(String[] args) 
	{
		DecimalFormat df = new DecimalFormat("#,###.00");
		String MovieName = JOptionPane.showInputDialog("Enter the movie name");
		int Adult_Price = Integer.parseInt(JOptionPane.showInputDialog("Enter the price of an adult ticket"));
		int Child_Price = Integer.parseInt(JOptionPane.showInputDialog("Enter the price of a child ticket"));
		int Adult_Sold = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of adult ticket sold"));
		int Child_Sold = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of child ticket sold"));
		int Donation = Integer.parseInt(JOptionPane.showInputDialog("Enter the percentage of the donation"));
		
		float GrossAmount = (Adult_Sold * Adult_Price) + (Child_Sold * Child_Price);
		float Donated_Amount = GrossAmount*7/100;
		System.out.println(Donated_Amount);
		float Net_Sale = GrossAmount - Donated_Amount;
		JOptionPane.showMessageDialog(null,
				"Movie Name: "             + MovieName                                 + "\n" + 
				"Number of Tickers Sold: " + (Adult_Sold+Child_Sold)                   + "\n" +
				"Gross Amount: $"          				   + df.format(GrossAmount)    + "\n" +
				"Percentage of the Gross Amount Donated: " + df.format(Donation)       + "%"  + "\n" +
				"Amount Donated: $"        				   + df.format(Donated_Amount) + "\n" +
				"Net Sale: $"              			       + df.format(Net_Sale),
				"Theater Sales Data", JOptionPane.INFORMATION_MESSAGE);
				
	}
}
