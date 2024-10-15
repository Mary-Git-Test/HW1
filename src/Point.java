
interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}


public class Point implements Movable {
    private int x;
    private int y;


    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }


    @Override
    public void moveUp() {
        y++;
    }

    @Override
    public void moveDown() {
        y--;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRight() {
        x++;
    }

    public static void main(String[] args) {
        Point point = new Point(0, 0);
        point.moveUp();
        point.moveRight();
        System.out.println("Point coordinates: (" + point.getX() + ", " + point.getY() + ")");
    }
}
