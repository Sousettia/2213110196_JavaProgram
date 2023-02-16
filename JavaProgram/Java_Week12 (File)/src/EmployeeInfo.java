import java.io.*;
import java.util.*;
public class EmployeeInfo {
    static Scanner console = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        String ans;
        System.out.print("Insert or Read data(from file)? : ");
        ans = console.next().toLowerCase();
        while(!ans.equals("insert") && !ans.equals("read")){
            System.out.print("Please text insert or read data? : ");
            ans = console.next().toLowerCase();
        }
        //create object to call SaveandOpen Class
        SaveandOpen file = new SaveandOpen();
        if(ans.equals("insert")){
            file.insert();
        }
        else{
            System.out.print("\nEnter dept : ");
            String department = console.next();
            file.setDept(department);
            file.read();
        }
    }
}
