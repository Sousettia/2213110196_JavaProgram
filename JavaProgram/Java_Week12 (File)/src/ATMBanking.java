import java.io.*;
import java.util.*;

public class ATMBanking {
    public static void main(String[] args) {
        boolean loopResult;
        String accountNumber;
        Scanner console = new Scanner(System.in);
        //#region accountinput
        System.out.print("Enter account number  : ");
        accountNumber = console.next();

        String[] data = accountNumber.split("-");
        int[] digitformat = {1,3,3,2,1};
        boolean[] check = new boolean[5];
        boolean numcheck = true;
        for(int i = 0; i < data.length ; i++){
            try {  
                Integer.parseInt(data[i]);  
                numcheck = true;
            } catch(NumberFormatException e){  
                numcheck = false;  
            } 
            if(data[i].length() == digitformat[i] && numcheck){
                check[i] = true;
            }else{
                check[i] = false;
            }
        }//end of for
        if(check[0]&&check[1]&&check[2]&&check[3]&&check[4]){
            loopResult = false;
        }else{
            loopResult = true;
        }
        while(loopResult){
            System.out.print("Input wrong type, Enter account number  : ");
            accountNumber = console.next();

            data = accountNumber.split("-");
            check = new boolean[5];
            for(int i = 0; i < data.length ; i++){
                try {  
                    Integer.parseInt(data[i]);  
                    numcheck = true;
                } catch(NumberFormatException e){  
                    numcheck = false;  
                }  
                if(data[i].length() == digitformat[i]){
                    check[i] = true;
                }else{
                    check[i] = false;
                }
            }
            if(check[0]&&check[1]&&check[2]&&check[3]&&check[4]){
                loopResult = false;
            }else{
                loopResult = true;
            }
        }
        //#endregion
        System.out.print("Enter password : ");
        String password = console.next();
    }
}
