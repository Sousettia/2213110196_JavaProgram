public class Video {
    private String title;
    private boolean checkOut = false;
    private double averageRating;
    private int ratingSum = 0;
    private int ratingCount = 0;

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return this.title;
    }
    public void addRating(int rate){
        ratingSum += rate;
        ratingCount += 1;
        averageRating = ratingSum/ratingCount;
    }
    public double getRating() {
        return averageRating;
    }
    public void checkOut(){
        checkOut = true;
    }
    public void returnToStore(){
        checkOut = false;
    }
    public Boolean isCheckedOut(){
        return checkOut;
    }
}
