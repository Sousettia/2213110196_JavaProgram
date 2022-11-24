import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Lab301 {

	static final int pricePerPerson = 299;

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("#,###.00");
		int numberofCustomer = Integer.parseInt(JOptionPane.showInputDialog(null, "How many customer per bill"));
		double totalPrice = numberofCustomer * pricePerPerson;

		int memberCard;
		do {
			memberCard = JOptionPane.showConfirmDialog(null,
					"Total Price is " + df.format(totalPrice) + " baht." + "\nDo you have a member card?");

			if (memberCard == 0) {
				totalPrice = totalPrice * 90 / 100;
				JOptionPane.showMessageDialog(null, "Amount to be paid is " + totalPrice + " baht.");
			} else if (memberCard == 1) {
				JOptionPane.showMessageDialog(null, "Amount to be paid is " + totalPrice + " baht.");
			}
		} while (memberCard == 2);
	}
}
