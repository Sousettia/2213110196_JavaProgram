import java.util.Scanner;
public class Lab505 
{
    static String Student_ID,Subject_ID;
    public static void main(String[] args) 
    {
        inputStudent();
    }
    public static void inputStudent() 
    {
        Scanner scan = new Scanner(System.in);
        do{
            System.out.print("Input Student ID : ");
            Student_ID = scan.nextLine();
            System.out.print("Input Subject ID : ");
            Subject_ID = scan.nextLine();
        }while(!isLength(Student_ID,Subject_ID));
        displayData(isITStudent(Student_ID),isITSubject(Subject_ID));
    }
    public static boolean isLength(String Student_ID_isLength,String Subject_ID_isLength) 
    {
        if(Student_ID.length() == 10 && Subject_ID.length() == 7) return true;
        return false;
    }
    public static boolean isITStudent(String Student_ID_isITStudent)
    {
        if(Student_ID_isITStudent.substring(0, 6).equals("211311")) return true;
        System.out.println(Student_ID_isITStudent);
        /* 
        if (Student_ID_isITStudent.charAt(2) == '1' && Student_ID_isITStudent.substring(3, 6) == "311"){
            return true;
        }
        */
        return false;
    }
    public static boolean isITSubject(String Subject_ID_isITSubject)
    {
        //if((Subject_ID.substring(0, 2) == "21" ) && Subject_ID.charAt(4) == '1') return true;
        if (Subject_ID_isITSubject.charAt(4) == '1' && Subject_ID_isITSubject.substring(0, 2).equals("21")) return true;
        return false;
    }
    public static void displayData(boolean Student_ID_Boolean,boolean Subject_ID_Boolean) 
    {
        System.out.println(String.valueOf(Student_ID_Boolean) + String.valueOf(Subject_ID_Boolean));
        System.out.print("Student ID : " + Student_ID + ((Student_ID_Boolean) ? " " : " is not ") + "1st year student in IT\n"
				                         + ((Subject_ID_Boolean) ? "Enroll " : "not enroll ") + "in course for Year 1");
    }
}
