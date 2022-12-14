import javax.swing.*;
public class Lab502 
{
    static String email;
	public static void main(String[] args) 
    {
		inputEmail();
	}
	public static void inputEmail() 
    {
		String answer = "";
		do 
        {
			email = JOptionPane.showInputDialog("Input your e-mail");
			checkEmailError(email);
			answer = JOptionPane.showInputDialog("Countinue[y||Y to continue]");
		} while (answer.equalsIgnoreCase("y"));
	}
	public static void checkEmailError(String checkemail) 
    {
		while (checkemail.startsWith("@") || checkemail.contains(" ")) 
        {
			checkemail = JOptionPane.showInputDialog("Input your e-mail, again :");
		}
		checkemail = checkemail.toLowerCase();
		boolean checkEmail = checkemail.endsWith("@gmail.com") || checkemail.endsWith("@hotmail.com");
		JOptionPane.showMessageDialog(null,
				(checkEmail) ? "Your e-mail is " + checkemail : "Your e-mail is not hotmai or gmail dot com ");
	}
}
