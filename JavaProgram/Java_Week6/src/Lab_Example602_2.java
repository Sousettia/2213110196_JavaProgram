import javax.swing.*;
public class Lab_Example602_2 
{
    public static void main(String[] args) 
    {
        String[] deptName = {"Accounting","HR","Sales","Innovation"};
        String department_NAME = JOptionPane.showInputDialog(null,"Enter a department name");
        boolean check = false;
        for(int i = 0;i < deptName.length;i++)
        {
            if(department_NAME.equalsIgnoreCase(deptName[i])) check = true;
        }
        JOptionPane.showMessageDialog(null, (check)? department_NAME + " was found in the list" : department_NAME + " was not found in the list");
    }
}
