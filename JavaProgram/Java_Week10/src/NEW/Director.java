public class Director {
    private String name;
    private String email;
    private char gender;

    public Director(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getGenderName() {
        if(gender == 'm'){
            return "Male";
        }else if(gender == 'f'){
            return "Female";
        }else{
            return "";
        }
    }   
    @Override
    public String toString(){
        return getName() + " (" + getEmail() + ";" + getGenderName() + ")";
    }
}
