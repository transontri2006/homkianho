
package lec8;

public class car {

    private String model;
    private int year;
    public car(String model, int year) {
        this.model = model;
        this.year = year;
    }
    public void displayDetails() {
        System.out.println("Car Model: " + model + ", Year: " + year);
    }
    public static void main(String[] args) {
        car myCar = new car("Lamborghini", 2020);
        myCar.displayDetails();
    }
}


        

