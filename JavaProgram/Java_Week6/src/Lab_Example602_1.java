import javax.swing.JOptionPane;

public class Lab_Example602_1 
{
    static int[] validValues = { 101, 108, 201, 213, 266, 304, 311, 409, 411, 412 };
    static double[] price = { 0.89, 1.23, 3.50, 0.69, 5.79, 3.19, 0.99, 0.89, 1.26, 8.00 };
    static int itemOrder;
    static double itemPrice;
    public static void main(String[] args) 
    {
        InputItem();
    }
    public static void InputItem()
    {
        itemOrder = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter item number to order"));
        System.out.println((checkitem(itemOrder))?("Item " + itemOrder + " is " + itemPrice):"Invalid Item");
    }
    public static boolean checkitem(int itemOrder_checkitem) 
    {
        itemPrice = 0;
        boolean validItem = false; 
        for(int i = 0; i < validValues.length;i++)
        {
            if(itemOrder_checkitem == validValues[i])
            {
                validItem = true;
                itemPrice = price[i];
            }
        }
        return validItem;
    }
    
}
