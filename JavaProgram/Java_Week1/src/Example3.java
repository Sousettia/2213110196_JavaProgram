//import java.util.*;
import java.text.*;
import javax.swing.*;

public class Example3 
{
	public static void main(String[] args) 
	{
		/*
		DecimalFormat df = new DecimalFormat("#,###.00");
		Scanner scan = new Scanner(System.in);
		System.out.print("Input product name   : ");
		String ProductName = scan.nextLine();
		System.out.print("Input product unit   : ");
		int ProductUnit = scan.nextInt();
		System.out.print("Input price per unit : ");
		float PricePerUnit = scan.nextFloat();
		System.out.println();
		float TotalPrice = ProductUnit * PricePerUnit;
		System.out.println("Total Price is " + df.format(TotalPrice) + " Baht.");
		System.out.println("Add VAT 7%  is " + df.format(TotalPrice+(TotalPrice*7/100)) + " Baht.");
		*/
		DecimalFormat df = new DecimalFormat("#,###.00");
		String ProductName = JOptionPane.showInputDialog("Input product name   : ");
		int ProductUnit = Integer.parseInt(JOptionPane.showInputDialog("Input product unit  : "));
		float PricePerUnit = Float.parseFloat(JOptionPane.showInputDialog("Input price per unit   : "));
		
		float TotalPrice = ProductUnit * PricePerUnit;
		System.out.println("Total Price is " + df.format(TotalPrice) + " Baht.");
		System.out.println("Add VAT 7%  is " + df.format(TotalPrice+(TotalPrice*7/100)) + " Baht.");
		JOptionPane.showMessageDialog(null,
				"Total Price is " + df.format(TotalPrice) + " Baht." + "\n" + 
				"Add VAT 7%  is " + df.format(TotalPrice+(TotalPrice*7/100)) + " Baht.");
	}
}
