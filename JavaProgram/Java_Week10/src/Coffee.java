public class Coffee extends Drink {
    private int typeCoffee;
    private char sizeCoffee;
    private Barista barista;
    
    
    public Coffee(int type, int typeCoffee) {
        super(type, ' ');
        this.typeCoffee = typeCoffee;
        this.sizeCoffee = ' ';
        this.barista = null;
    }

    public Coffee(int type,char sizeCoffee,int typeCoffee , Barista barista) {
        super(type,' ');
        this.typeCoffee = typeCoffee;
        this.sizeCoffee = sizeCoffee;
        this.barista = barista;
    }
    

    @Override
    public String getTypeName(){
        switch(typeCoffee){
            case 1:
                return "Americano";
            case 2:
                return "Espresso";
            case 3:
                return "Cappuccino";
            default:
                return "";
        }
    }

    @Override
    public int getTypePrice(){
        switch(typeCoffee){
            case 1:
                return 50;
            case 2:
                return 55;
            case 3:
                return 65;
            default:
                return 0;
        }
    }
    @Override
    public String getSizeName(){
        switch(sizeCoffee){
            case 'S':
                return "Short";
            case 'T':
                return "Tall";
            case 'G':
                return "Grande";
            case 'V':
                return "Venti";
            default:
                return "";
        }
    }
    @Override
    public int getSizePrice(){
        switch(sizeCoffee){
            case 'S':
                return 100;
            case 'T':
                return 150;
            case 'G':
                return 150;
            case 'V':
                return 25;
            default:
                return 0;
        }
    }
    public String toString(){
        return super.getTypeName() + " " + this.getTypeName() + " (" + this.getSizeName() + ") is " + getTotalPrice();
    }
}
