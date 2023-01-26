public class PersonalInfo {
    private person name;
    private Date bDay;
    private int personID;

    //Default Constructor
    public PersonalInfo() {
        name = new person();
        bDay = new Date();
        personID = 0;
    }
    public PersonalInfo(String first,String last,int month, int day, int year,int ID) {
        //intitialize the object name
        name = new person(first,last);
        //intitialize the object Date
        bDay = new Date(month,day,year);
        personID = ID;
    }
    public void setPersonalInfo(String first,String last,int month, int day, int year,int ID){
        name.setName(first, last);
        bDay.setDate(month, day, year);
        personID = ID;
    }
    public String toString(){
        return "Name: " + name.toString() +
                "\nDate of birth: " + bDay.toString() +
                "\nPersonal ID: " + personID;
    }
}
