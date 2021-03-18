package Opdrachten.Exceptions;

import java.util.Scanner;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Car();
        Scanner scanner = new Scanner(System.in);
        String merk = scanner.next();

        try {
            car.setAutomerk(merk);
        }catch (Exception exception){
            System.out.println(exception.getMessage());
            exception.printStackTrace();
        }
    }
}
