import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Lab302 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,###.#");
		double weight = Double.parseDouble(JOptionPane.showInputDialog(null, "Input Weight: "));
		double height = Double.parseDouble(JOptionPane.showInputDialog(null, "Input Height: "));

		double bmi = weight / Math.pow((height / 100), 2);

		JOptionPane.showMessageDialog(null,
				"BMI = " + df.format(bmi) + "\nYou're "
						+ ((bmi < 18.5) ? "Underweight"
								: (bmi <= 24.9) ? "Normal-weight" : (bmi <= 29.9) ? "Overweight" : "Obesity"),
				"BMI", JOptionPane.WARNING_MESSAGE);
	}
}