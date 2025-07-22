package practice_2;

public class Circle {
    float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float newRadius) {
        this.radius = newRadius;
    }

    public void calculateArea() {
        System.out.println("Area of the circle is: " + (float) Math.PI * (radius * radius));
    }

    public void calculateCircumference() {
        System.out.println("Circumference of the circle is: " + 2 * (float) Math.PI * radius);
    }
}
