import java.text.DecimalFormat;
import java.util.Scanner;

public class SalespersonSalary {
	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("#,###,###.00");
		Scanner scan = new Scanner(System.in);
		final double COMMISSION_RATE = 0.15;
		final int SENTINEL = -1; // Terminating value for input
		int sales;
		// Salary to be computed
		do {
			System.out.print("Enter sales in dollars (or -1 to end):");
			sales = scan.nextInt(); // Input gross sales
			if (sales == SENTINEL) {
				System.out.println("bye");
			} else {
				double salary = 1000 + (sales * COMMISSION_RATE);
				System.out.println("Salary is : $" + df.format(salary));
			}
		} while (sales != SENTINEL);
	}
}
