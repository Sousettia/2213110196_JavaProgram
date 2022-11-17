import javax.swing.*;
import java.text.*;

public class Example2 
{
	static final float BUFFETPRICE = 299;
	public static void main(String[] args) 
	{
		DecimalFormat df = new DecimalFormat("#,###.00");
		int numberofcustomer = 5;
		float totalprice = BUFFETPRICE * numberofcustomer;
		System.out.println("Buffet of " + numberofcustomer + " customers is " + df.format(totalprice));
		float servicecharge = totalprice + (totalprice*3/100);
		System.out.println("Add Service Charge 3% is " + df.format(servicecharge));
		JOptionPane.showMessageDialog(null, 
				"Buffet price of " + df.format(numberofcustomer) + " "  +
				"Costomers is "    + df.format(totalprice)       + "\n" +
				"Add Service Charge is " + df.format(servicecharge));
	}
}
