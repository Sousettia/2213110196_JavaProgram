public class Student {
    //The private instance variables
    private String name;
    private String address;
    private int numCourses;//number of courses taken so far
    //The courses and grades for the courses are kept in 2 parallel arrays
    private String[] courses;
    private int[] grades; //valid range is [0,100]
    //Maximum number of courses taken by student
    private static final int MAX_COURSE = 30;

    /**Constructor a Student instance with the given input*/
    public Student(String name,String address){
        this.name = name;
        this.address = address;
        numCourses = 0;
        courses = new String[MAX_COURSE];
        grades = new int[MAX_COURSE];
    }
    //No setter for name as it is not designed to be changed
    public String getName() {
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getAddress() {
        return this.address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String toString(){
        return this.name + "(" + this.address + ")"; //getName() or getAddress()
    }
    //adds a course and a grade
    public void addCoursesGrade(String course,int grade){
        courses[numCourses] = course;
        grades[numCourses] = grade;
        ++numCourses;
    }
    /*prinnts all course and grades*/
    public void printGrade(){
        System.out.println(name);
        for(int i = 0; i < numCourses; i++){
            System.out.println(" " + courses[i] + ":" + grades[i]);
        }
        System.out.println();
    }
    /*computes the average grade */
    public double getAverageGrade(){
        int sum = 0;
        for(int _grades : grades){
            sum += _grades;
        }
        return (double)sum/numCourses;
    }
}
