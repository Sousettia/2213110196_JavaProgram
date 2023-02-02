public class Product1 {
    private int unit;

    public int getUnit() {
        return unit;
    }
    public void setUnit(int unit) {
        this.unit = unit;
    }
    public int getTotalPrice(){
        return getUnit() * 100;
    }
    public String toString(){
        return "You buy " + getUnit() + " units (" + getTotalPrice() + ").";
    }
}
