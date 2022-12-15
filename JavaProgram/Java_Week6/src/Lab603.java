import java.util.*;

public class Lab603 
{
    static Scanner scan = new Scanner(System.in);
    static int[] number = {78, 36, 58, 41, 25, 92, 75};
    public static void main(String[] args) 
    {
        System.out.print("Input Index of array : ");
        int inputIndex = scan.nextInt();
        while(inputIndex < 0 || inputIndex > number.length - 1)
        {
            System.out.print("Input Index of array, again : ");
            inputIndex = scan.nextInt();
        }
        System.out.println();
        System.out.println("Value in current index is " + number[inputIndex]);
        if(inputIndex == 6)  System.out.println("Sorry, " + inputIndex + " is the last index in array.");
        else System.out.println("Value in next    index is " + number[inputIndex+1]);
    }
}
