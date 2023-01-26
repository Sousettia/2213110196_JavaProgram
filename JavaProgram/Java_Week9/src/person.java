public class person { //can't name Person for some reason
    private String firstName;
    private String lastName;
    public person() {
        this(null,null);
    }
    public person(String first, String last) {
        setName(first, last);
    }
    public void setName(String first, String last){
        this.firstName = first;
        this.lastName = last;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String toString(){
        return getFirstName() + " " + getLastName();
    }
}
