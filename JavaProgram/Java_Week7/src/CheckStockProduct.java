import java.util.Scanner;

public class CheckStockProduct 
{
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.print("How many product list in stock : ");
        int productlist_count = scan.nextInt();
        Product[] productList = new Product[productlist_count];
        System.out.println();
        for(int i = 0; i < productList.length;i++)
        {
            productList[i] = new Product();
            System.out.print("Input product Id    : ");
            productList[i].setId(scan.next());
            System.out.print("Input product Unit  : ");
            productList[i].setUnit(scan.nextInt());
            System.out.println();
        }
        header("LOW");
        for(Product LIST : productList) 
        {
            if(LIST.getUnit() < 5) LIST.output();
        }
        header("NORMAL");
        for(Product LIST : productList) 
        {
            if(LIST.getUnit() >= 5 && LIST.getUnit() <= 50) LIST.output();
        }
        header("HIGH");
        for(Product LIST : productList) 
        {
            if(LIST.getUnit() > 50) LIST.output();
        }

    }
    public static void header(String message) 
    {
        System.out.println("------------------------");
        System.out.println("List of product in \'" + message + "\' status.");
        System.out.println("------------------------");
    }
}
