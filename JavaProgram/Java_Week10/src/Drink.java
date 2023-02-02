public class Drink extends Coffee {
    private int type;
    private char size;

    public Drink() {
        this.type = 0;
        this.size = ' ';
    }
    public Drink(int type, char size) {
        this.type = type;
        this.size = size;
    }
    public String getTypeName(){
        switch(type){
            case 1:
                return "Hot";
            case 2:
                return "Cold";
            default:
                return "";
        }
    }
    public int getTypePrice(){
        switch(type){
            case 1:
                return 10;
            case 2:
                return 20;
            default:
                return 0;
        }
    }
    public String getSizeName(){
        switch(size){
            case 'S':
                return "Small";
            case 'M':
                return "Medium";
            case 'L':
                return "Large";
            default:
                return "";
        }
    }
    public String getSizeName(){
        switch(size){
            case 'S':
                return 15;
            case 'M':
                return 20;
            case 'L':
                return 25;
            default:
                return 0;
        }
    }
}
