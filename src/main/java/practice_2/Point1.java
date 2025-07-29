package practice_2;

public class Point1 {
    private int x;
    private int y;

    public Point1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int newX) {
        this.x = newX;
    }

    public void printCoordinates() {
        System.out.println("X is: " + x + " Y is: " + y);
    }
}
