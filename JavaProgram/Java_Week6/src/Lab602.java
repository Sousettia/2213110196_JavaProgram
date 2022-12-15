import java.util.*;
import java.text.*;

public class Lab602 
{
    static DecimalFormat df = new DecimalFormat("0.00");
    static Scanner scan = new Scanner(System.in);
    static double sum = 0;
    static double average = 0;
    public static void main(String[] args) 
    {
        double[] inputScore = new double[5];
        for(int i = 0; i < inputScore.length;i++)
        {
            System.out.print("Input score of student " + (i+1) + " : ");  
            inputScore[i] = scan.nextDouble();
            sum += inputScore[i];
        }  
        System.out.println();
        average = sum / inputScore.length;
        System.out.println("Average of " + inputScore.length + " student is " + df.format(average));
        for(int i = 0; i < inputScore.length;i++)
        {
            if(inputScore[i] > average) System.out.println("> Student " + (i+1) + " (" + df.format(inputScore[i]) + ")" );
        }
    }
}
