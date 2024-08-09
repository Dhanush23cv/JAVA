import java.util.Scanner;

class Vehicle {
    String licenseno;
    String ownername;
}

class Car extends Vehicle {
    String colour;
    String model;
    int year;
    int seats;
    int mileage;

    void getData() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the license number: ");
        licenseno = inp.nextLine();
        System.out.println("Enter the owner name: ");
        ownername = inp.nextLine();
        System.out.println("Enter the colour of the car: ");
        colour = inp.nextLine();
        System.out.println("Enter the model of the car: ");
        model = inp.nextLine();
        System.out.println("Enter the purchase year: ");
        year = inp.nextInt();
        System.out.println("Enter the number of seats: ");
        seats = inp.nextInt();
        System.out.println("Enter the mileage: ");
        mileage = inp.nextInt();

    }

    void display() {
        System.out.println("License number = " + licenseno);
        System.out.println("Owner name = " + ownername);
        System.out.println("Colour = " + colour);
        System.out.println("Model = " + model);
        System.out.println("Year = " + year);
        System.out.println("Seats = " + seats);
        System.out.println("Mileage = " + mileage);
    }
}

class Truck extends Car {
    
}

class Motorcycle extends Car {
    
}

public class v {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String ch;

        do {
            System.out.println("Choose among\n 1. Car\n 2. Truck\n 3. Motorcycle\n 4. Exit");
            ch = s.nextLine();

            switch (ch) {
                case "1":
                    Car carObj = new Car();
                    System.out.println("Enter the details of the car: ");
                    carObj.getData();
                    System.out.println("Details of the car are: ");
                    carObj.display();
                    break;

                case "2":
                    Truck truckObj = new Truck();
                    System.out.println("Enter the details of the truck: ");
                    truckObj.getData();
                    System.out.println("Details of the truck are: ");
                    truckObj.display();
                    break;

                case "3":
                    Motorcycle motorcycleObj = new Motorcycle();
                    System.out.println("Enter the details of the motorcycle: ");
                    motorcycleObj.getData();
                    System.out.println("Details of the motorcycle are: ");
                    motorcycleObj.display();
                    break;

                case "4":
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (!ch.equals("4"));

        s.close();
    }
}
