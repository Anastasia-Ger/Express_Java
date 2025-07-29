package practice_2;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int newWidth) {
        width = newWidth;
    }
    public void setHeight(int newHeight) {height = newHeight;}
    public void calculateArea() {
        System.out.println("Area of the rectangle is: " + width * height);
    }
}
