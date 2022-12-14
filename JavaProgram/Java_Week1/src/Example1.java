
public class Example1 
{
	public static void main(String[] args) 
	{
		String isbn = "IB2-6325-85-4-4";
		String title = "Basic Java Programming";
		int unit = 5;
		float price = 225.75f;
		System.out.println("Book ISBN  : " + isbn);
		System.out.println("Book Title : " + title);
		System.out.println("Book Unit  : " + unit);
		System.out.println("Book Price : " + price);
		float totalPrice = price*unit;
		System.out.println("Total pice is : " + totalPrice);
		float pricewithVAT = totalPrice+(totalPrice*(float)(7/100.0));
		System.out.println("Add VAT 7% is " + pricewithVAT);
	}
}
