import javax.swing.*;

public class Example1 {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog(null, "Input Full name");
		int birthYear = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Full name"));

		while (birthYear < 1980 || birthYear > 2018) {
			birthYear = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Birth year"));
		}

		int gender = JOptionPane.showConfirmDialog(null, "Are you Female", "Gender", JOptionPane.YES_NO_OPTION);
		JOptionPane.showMessageDialog(null, "Full name : " + name + "\nBirth Year : " + birthYear + "\nYou are "
				+ ((gender == 0) ? "Female" : "Male"));
	}

}
