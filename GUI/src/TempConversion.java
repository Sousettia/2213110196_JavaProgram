import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TempConversion extends JFrame{
    //Components
    private JLabel lblcelsius,lblfahrenheit;
    private JTextField tfCelcius,tfFahrenheit;

    private static final int WIDTH = 500;
    private static final int HEIGHT = 100;
    private static final double FTOC = 5.0/9.0;
    private static final double CTOF = 9.0/5.0;
    private static final int OFFSET = 32;

    public TempConversion(){

        Container c = getContentPane();
        c.setLayout(new GridLayout(1,4));

        lblcelsius = new JLabel("Temp in celcius : ",SwingConstants.RIGHT);
        lblfahrenheit = new JLabel("Temp in fahrenheit : ",SwingConstants.RIGHT);

        tfCelcius = new JTextField(10);
        tfFahrenheit = new JTextField(10);
        c.add(lblcelsius);
        c.add(tfCelcius);
        c.add(lblfahrenheit);
        c.add(tfFahrenheit);

        //create objects to call class
        CelsHandler celsiusHandler = new CelsHandler();
        tfCelcius.addActionListener(celsiusHandler);

        FrhHandler fahrenheitHandler = new FrhHandler();
        tfFahrenheit.addActionListener(fahrenheitHandler);

        setTitle("Temperature Conversion");
        setSize(WIDTH,HEIGHT);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private class CelsHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            double celsius,fahrenheit;
            celsius = Double.parseDouble(tfCelcius.getText());
            fahrenheit = celsius * CTOF + OFFSET;
            tfFahrenheit.setText(String.format("%.2f",fahrenheit));
        }
    }
    private class FrhHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            double celsius,fahrenheit;
            fahrenheit = Double.parseDouble(tfFahrenheit.getText());
            celsius = (fahrenheit - OFFSET) * FTOC;
            tfCelcius.setText(String.format("%.2f",celsius));
        }
    }
    public static void main(String[] args) 
    {
        TempConversion tempConv = new TempConversion();
    }
}
