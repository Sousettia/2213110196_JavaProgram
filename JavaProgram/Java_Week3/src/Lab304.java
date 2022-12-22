import java.util.Scanner;
public class Lab304 
{
    public static void main(String[] arg) 
    {
        Scanner scan = new Scanner(System.in);
        int curr_number, prev_num = 0;
        do
        {
            System.out.print("Input Number : ");
            curr_number = scan.nextInt();
            if(curr_number < prev_num && prev_num != 0) break;
            prev_num = curr_number;
        }while(true);
    }
}
