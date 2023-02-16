public class MovablePoint implements Movable{

    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        this.y = y + ySpeed;
    }

    @Override
    public void moveDown() {
        this.y = y - ySpeed;
    }

    @Override
    public void moveLeft() {
        this.x = x - xSpeed;
    }

    @Override
    public void moveRight() {
        this.x = x + xSpeed;
    }

    @Override
    public String toString(){
        return "Point at (" + this.x + "," + this.y + ")";
    }
    
}
