import java.awt.*;
import javax.swing.*;

public class TestGUI extends JFrame {
    
    private static final int WIDTH = 400;
    private static final int HEIGHT = 300;
    //Components
    private JLabel lblLength,lblWidth,lblArea,lblPerimeter;
    private JTextField txtLenght,txtWidth,txtArea,txtPerimeter;
    //Constructor
    public TestGUI() {
        setTitle("Area and Perimeter");
        setSize(WIDTH,HEIGHT);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Properties for Components
        lblLength = new JLabel("Enter ther lenght : ",SwingConstants.LEFT);
        lblWidth = new JLabel("Enter ther Width : ",SwingConstants.LEFT);
        lblArea = new JLabel("Area : ",SwingConstants.LEFT);
        lblPerimeter = new JLabel("Perimeter : ",SwingConstants.LEFT);
        //TextFields
        
        GridLayout L =new GridLayout(4,1);
        setLayout(L);
        add(lblLength);
        add(lblWidth);
        add(lblArea);
        add(lblPerimeter);
    }

    public static void main(String[] args) 
    {
        TestGUI prog = new TestGUI();
    }
}
