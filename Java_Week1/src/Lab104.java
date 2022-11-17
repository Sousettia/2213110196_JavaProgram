import javax.swing.*;

public class Lab104 
{
	public static void main(String[] args) 
	{
		int TimeParking_minute_input = Integer.parseInt(JOptionPane.showInputDialog("Input Time Parking (minute) : "));
		
		int TimeParking_hour = TimeParking_minute_input / 60;
		int TimeParking_minute = TimeParking_minute_input % 60;
		
		float TotalParkingHourPrice = TimeParking_hour * 50;
		float TotalParkingMinutePrice = TimeParking_minute * 0.25f;
		float TotalPrice = TotalParkingHourPrice + TotalParkingMinutePrice;
		JOptionPane.showMessageDialog(null, "You parking " + TimeParking_hour   + " Hour " + 
															 TimeParking_minute + " Minute.\n" +
											"Amount to be paid is " + TotalPrice+ " baht.");
	}
}
