package practice_1;

public class MathOperations {
    public int add (int x, int y) {
        return x + y;
    }
    public int substract (int x, int y) {
        return x - y;
    }
    public int multiply (int x, int y) {
        return x * y;
    }
    public double devide (int x, int y) {
        return (double) x / y;
    }
    public int findMax (int a, int b) {
        return Math.max(a,b);
    }
    public int difference (int x, int y) {
        return Math.abs(x - y);
    }
    public int squareArea (int side) {
        return side * side;
    }
    public int squarePerimeter (int side) {
        return side * 4;
    }
    public double convertSecondsToMinutes (int seconds) {
        return (double) seconds / 60.0;
    }
    public double averageSpeed (double distanse, double time) {
        double speed = 0.0;
        if (time != 0) {
            speed = distanse / time;
        } return speed;
    }
    public double findHypotenuse (double a, double b) {
        return Math.sqrt(a*a + b*b);
    }
    public double circleCircumference (double radius) {
        return 2 * Math.PI * radius;
    }
    public double calculatePersentage (double total, double part){
        return (part / total) * 100;
    }
    public double celciusToFahrenheit (double c) {
        return c * 9/5 + 32;
    }
    public double fahrenheitToCelcius (double f) {
        return (f - 32) * 5/9;
    }
}

