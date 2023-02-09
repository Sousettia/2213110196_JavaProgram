public class FictionBook implements Author,Book{

    private String author_name;
    private String email;
    private String title;
    private int publicYear;

    public FictionBook(String title, int publicYear) {
        this.title = title;
        this.publicYear = publicYear;
    }

    public void setAuthorName(String name){
        author_name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public boolean checkFormatName(){
        String defaultFormat = getFirstName()+" "+getLastName();
        if(author_name.toUpperCase().trim().equals(defaultFormat)){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public int totalPulicYear() {
        return 2023 - publicYear;
    }

    @Override
    public String getLastName() {
        int idx = author_name.lastIndexOf(' ');
        if (idx == -1){
            return null;
        }
        return author_name.substring(idx + 1).toUpperCase();
    }

    @Override
    public String getFirstName() {
        int idx = author_name.lastIndexOf(' ');
        if (idx == -1){
            return null;
        }
        return author_name.substring(0, idx).toUpperCase();
    }

    @Override
    public boolean checkEmail() {
        if(this.email.endsWith("@hotmail.com") || this.email.endsWith("@windowslive.com")){
            return true;
        }
        else{
            return false;
        }
    }
    
    public String toString(){
        return getTitle() + " write by " + getLastName().charAt(0) + "." + getFirstName() + " (" + this.email + ")"+
                "\nPublished for " + totalPulicYear() + " years.";
    }
}
