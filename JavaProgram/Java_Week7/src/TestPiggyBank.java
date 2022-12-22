import java.util.Scanner;
public class TestPiggyBank 
{
    static PiggyBank pb = new PiggyBank();
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) 
    {
        sizeOfPiggyBank();
    }
    public static void sizeOfPiggyBank() 
    {
        System.out.println("Money Total : " + pb.getTotal());
        System.out.print("Please define size of PiggyBank: ");
        pb.setPiggyBank(scan.nextInt());
        System.out.println("Size of your PiggyBank: " + pb.getPiggtBank());
        selectionMenu();
    }
    public static void selectionMenu() 
    {
        int select;
        do{
            menu();
            System.out.print("Please Select Menu[1-5] : ");
            select = scan.nextInt();
            switch(select){
                case 1:
                    System.out.print("Insert 1 Baht Money: ");
                    pb.addOne(scan.nextInt());
                    break;
                case 2:
                    System.out.print("Insert 2 Baht Money: ");
                    pb.addTwo(scan.nextInt());
                    break;
                case 3:
                    System.out.print("Insert 5 Baht Money: ");
                    pb.addFive(scan.nextInt());
                    break;
                case 4:
                    System.out.print("Insert 10 Baht Money: ");
                    pb.addTen(scan.nextInt());
                    break;
                case 5:
                    System.out.print("Bye Bye");
                    break;
            }
            System.out.println("Money Total : " + pb.getTotal());
        }while(select != 5);
    }
    public static void menu()
    {
        System.out.println("\n====================");
        System.out.println(" Menu of PiggyBank");
        System.out.println("====================");
        System.out.println("[1] one bath.");
        System.out.println("[2] two bath.");
        System.out.println("[3] five bath.");
        System.out.println("[4] ten bath.");
        System.out.println("[5] Exit");
        System.out.println("====================");
    }
} 