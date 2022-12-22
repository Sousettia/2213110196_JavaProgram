import java.text.DecimalFormat;
import java.util.Scanner;

public class StockProduct 
{
    public static void main(String[] args) 
    {
        double sum = 0;
        DecimalFormat df = new DecimalFormat("#,###.00");
        Scanner scan = new Scanner(System.in);
        Product[] productList = new Product[4];
        
        for(int i = 0; i < productList.length;i++)
        {
            productList[i] = new Product();
            System.out.print("Input product Id    : ");
            productList[i].setId(scan.next());
            System.out.print("Input product Unit  : ");
            productList[i].setUnit(scan.nextInt());
            while(!(productList[i].getUnit() > 0))
            {
                System.out.print("Input product Unit, again  : ");
                productList[i].setUnit(scan.nextInt());
            }
            System.out.print("Input product Price : ");
            productList[i].setPrice(scan.nextDouble());
            while(!(productList[i].getPrice() > 0))
            {
                System.out.print("Input product Price, again : ");
                productList[i].setPrice(scan.nextDouble());
            }
            System.out.println();   
            sum += productList[i].calculate();
        }
        System.out.println("------------------------------------------");
        for(Product LIST : productList)
        {
            System.out.println("Product ID : " + LIST.getId() + ", Total price = " + df.format(LIST.calculate()) + " baht.");
        }
        System.out.println("------------------------------------------");
        System.out.println("Total price of all products is " + df.format(sum) + "baht.");
    }
}
