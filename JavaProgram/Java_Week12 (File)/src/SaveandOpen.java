import java.io.*;
import java.util.Scanner;

public class SaveandOpen extends Employee{

    private String name;
    private String dept;

    public void insert() throws IOException{
        Scanner console = new Scanner(System.in);
        String answer;
        PrintStream ps = new PrintStream(new File("TextFile/Employee.txt"));
        do{
            super.Header();
            System.out.print("Enter name : ");
            name = console.next();
            System.out.print("Enter department : ");
            dept = console.next();
            //Write all data to File
            ps.println(name + "\t" + dept);
            System.out.print("Enter data again? : ");
            answer = console.next();
        }while(answer.equalsIgnoreCase("y"));
        console.close();
    }
    public void read() throws IOException{
        try (Scanner in = new Scanner(new File("TextFile/Employee.txt"))) {
            int i = 0;
            boolean check = false;
            super.Header();
            while(in.hasNext()){
                name = in.next();
                dept = in.next();
                if(dept.equalsIgnoreCase(super.getDept())){
                    i++;
                    System.out.println(i + ") " + name);
                    check = true;
                }
            }//end of while
            if(check){
                super.Header();
                System.out.print("\nEmployee in department " + super.getDept() + " is " + i + " person.");
            }else{
                System.out.print("\nSorry, no department:");
            }
        }catch(IOException ex){
            System.out.println("\nSorry, file not found...");
        }
    }
}
