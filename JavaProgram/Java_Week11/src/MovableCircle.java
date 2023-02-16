public class MovableCircle extends MovablePoint {

    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed,int radius) {
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        super.moveUp();
    }

    @Override
    public void moveDown() {
        super.moveDown();
    }

    @Override
    public void moveLeft() {
        super.moveLeft();
    }
    @Override
    public void moveRight() {
        super.moveRight();
    }
    @Override
    public String toString(){
        return "Circle center " + center + ",radius = " + radius;
    }
}
