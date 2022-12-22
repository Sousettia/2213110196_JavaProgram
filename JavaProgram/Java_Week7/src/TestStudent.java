import java.util.Scanner;

public class TestStudent 
{
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) 
    {
        inputinformation();
    }
    public static void inputinformation()
    {
        System.out.print("How many Student in classroom : ");
        int studentcount = scan.nextInt();

        Student[] student = new Student[studentcount]; //assign array of object
        for(int i = 0; i < student.length; i++)
        {
            System.out.println("\nINPUT INFORMATION OF STUDENT " + (i+1));
            System.out.println("--------------------------------");
            student[i] = new Student(); //declare array objecy, call all of method in Student();
            System.out.print("Input student name  : ");
            student[i].setName(scan.next());
            System.out.print("Input student score : ");
            student[i].setScore(scan.nextInt());

            while(!student[i].checkScore())
            {
                System.out.print("Input student score, again : ");
                student[i].setScore(scan.nextInt());
            }
            System.out.println();
        }//end for
        System.out.println();
        System.out.println("LIST OF PASS STUDENT (>=50)");
        System.out.println("--------------------------------");
        for(Student STD : student)
        {
            if(STD.isPass()) System.out.println(">> " + STD.getName() + " get grade " + STD.findGrade(STD.getScore()));
        }
    }
}
