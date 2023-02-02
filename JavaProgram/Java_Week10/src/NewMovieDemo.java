import java.util.Scanner;

public class NewMovieDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input movie id   : ");
        String id = scan.nextLine();
        System.out.print("Input movie name : ");
        String name = scan.nextLine();

        System.out.println();
        System.out.print("Input director name   : ");
        String dir_name = scan.nextLine();
        System.out.print("Input director e-mail : ");
        String dir_email = scan.nextLine();
        System.out.print("Input director gender : ");
        char dir_gender = scan.next().toLowerCase().charAt(0);
        while(dir_gender != 'm' && dir_gender != 'f'){
            System.out.print("Input director gender, again : ");
            dir_gender = scan.next().toLowerCase().charAt(0);
        }
        
        System.out.println();
        System.out.print("Input movie theater no.  :");
        int theaterNo = scan.nextInt();
        while(theaterNo < 1 || theaterNo > 15){
            System.out.print("Please input 1 - 15 only :");
            theaterNo = scan.nextInt();
        }
        scan.close();
        System.out.println();
        NewTheater theater = new NewTheater(id,name, new NewDirector(dir_name, dir_email, dir_gender),theaterNo);
        System.out.println(theater);
    }
}
