public class TestStudent {
    public static void main(String[] args) {
        //Test constructor and toString()
        Student Jirapat = new Student("Jirapat Anantasirijinda","Salaya");
        System.out.println(Jirapat);//toString()

        //Test Setters and Getters
        Jirapat.setAddress("25 Pattanakarn");
        System.out.println(Jirapat);//toString()
        System.out.println(Jirapat.getName());
        System.out.println(Jirapat.getAddress());

        //Test addCourseGrade(),printGrades(), and getAverageGrade()
        Jirapat.addCoursesGrade("INT107", 80); // :)
        Jirapat.addCoursesGrade("INT108", 85); // :)
        Jirapat.addCoursesGrade("MSC202", 60);
        Jirapat.printGrade();

        System.out.printf("The average grade is %.2f%n" , Jirapat.getAverageGrade());

    }
}
