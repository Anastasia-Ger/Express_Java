package practice_2;

public class Car {
    String brand;
    int year;

    public Car(String newBrand, int newYear) {
        this.brand = newBrand;
        this.year = newYear;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public void setBrand(String newBrand) {
        brand = newBrand;
    }

    public void setYear(int newYear) {
        year = newYear;
    }

    public void printBrand() {
        System.out.println("Brand is: " + brand);
    }

    public void printYear() {
        System.out.println("Year is: " + year);
    }
}
