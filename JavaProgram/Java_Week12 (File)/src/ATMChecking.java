import java.io.*;
import java.util.*;

public class ATMChecking extends ATMData{
    
    private int money;

    public ATMChecking(String accountNumber, String password, int money) {
        super(accountNumber, password);
        this.money = money;
    }
    public boolean checkBookBank() throws IOException{
        Scanner read = new Scanner(new File("TextFile/ATMBookBank.txt"));
        while(read.hasNext()){
            String account_num = read.next();
            String account_pass = read.next();
            int balance = Integer.parseInt(read.next());

            if(account_num == super.getID() && account_pass == super.getPass() && balance == this.money){
                read.close();
                return true;
            }
        }
        read.close();
        return false;
    }
    public void show() throws IOException{
        if(checkBookBank() == true){
            Scanner read = new Scanner(new File("TextFile/ATMBookBank.txt"));
            while(read.hasNext()){
                int thousand,fivehundred,hundred,change;
                read.next();
                read.next();
                int balance = Integer.parseInt(read.next());
                //8400
                thousand = this.money/1000; //8
                change   = this.money%1000; //400
                fivehundred  = change/500; //0
                change   = change%500; //400
                hundred  = change/100; //4
                System.out.println("You drawing money for " + this.money + ", get\n" + 
                                        "\t1000 = " + thousand +
                                        "\t500 = " + fivehundred +
                                        "\t100 = " + hundred + 
                                    "\nYour Balance is " + (balance - this.money) + "Baht.");
            }
        }else{
            System.err.println("\nSorry, your id or password is wrong, or your amount not enough.");
        }
    }
}
