public class NewTheater extends NewMovie {
    private int theaterNo;

    public NewTheater(String id, String name, NewDirector director, int theaterNo) {
        super(id, name, director);
        this.theaterNo = theaterNo;
    }
    public NewTheater() {
        super();
        this.theaterNo = 0;
    }
    public String getTheaterName(){
        if(theaterNo >= 1 && theaterNo <= 11){
            return "Basic Theater";
        }
        else if(theaterNo >= 12 && theaterNo <= 14){
            return "Sweet Theater";
        }
        else if(theaterNo == 15){
            return "Premium Theater";
        }
        else {
            return null;
        }
    }
    @Override
    public String toString() {
        return getTheaterName() + ": " + super.toString() ; 
    }
}
