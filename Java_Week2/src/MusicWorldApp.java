import javax.swing.*;

public class MusicWorldApp {
	public static void main(String[] args) {
		String cdId = JOptionPane.showInputDialog(
				"This program calculations the total costs of a CD order\nPlease enter the ID of the CD");
		String cdTitle = JOptionPane.showInputDialog("Please enter the title of the CD");
		double cdPrice = Double
				.parseDouble(JOptionPane.showInputDialog("Please enter the price of the CD in U.S. dollars"));
		int cdQuantity = Integer.parseInt(JOptionPane.showInputDialog("Please enter the quantity to be purchased"));
		double cdSubtotal = cdPrice * cdQuantity;
		final double TAX_RATE = .0625;
		double cdTotal = cdSubtotal * (1 + TAX_RATE);
		JOptionPane.showMessageDialog(null,
				"CD ID: " + cdId + "\n" + "CD Title: " + cdTitle + "\n" + "CD Unit Price: $" + cdPrice + "\n"
						+ "CD Quantity: " + cdQuantity + "\n\n" + "Subtotal: $" + cdSubtotal + "\n" + "Tax rate: "
						+ TAX_RATE * 100 + "%\n" + "Total: $" + cdTotal + "\n\n" + "End of Program");
	}
}
