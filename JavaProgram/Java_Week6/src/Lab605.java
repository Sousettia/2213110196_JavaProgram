import java.util.Scanner;

import javax.swing.JOptionPane;

public class Lab605 
{
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) 
    {
        int[] number = new int[5];    
        for(int i = 0; i < number.length ; i++)
        {
            //System.out.print("");
            number[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Input number " + (i+1) + " :"));
        }
        showEven(number);
        showOdd(number);
    }
    public static void showEven(int[] nums) 
    {
        String numberlist = "";
        for(int _nums : nums)
        {
            if(_nums % 2 == 0)
            {
                numberlist += _nums;
                numberlist += " ";
            }
        }
        JOptionPane.showMessageDialog(null,"List of even number:\n"+numberlist);
    }
    public static void showOdd(int[] nums) 
    {
        String numberlist = "";
        for(int _nums : nums)
        {
            if(_nums % 2 != 0)
            {
                numberlist += _nums;
                numberlist += " ";
            }
        }
        JOptionPane.showMessageDialog(null,"List of odd number:\n"+numberlist);
    }
}
