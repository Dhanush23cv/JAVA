// Base class
class Transport {
    // Method to be overridden by subclasses
    void move() {
        System.out.println("The transport is moving.");
    }

    // Additional method to show type of transport
    void type() {
        System.out.println("This is a generic transport.");
    }
}

// Subclass Bus
class Bus extends Transport {
    // Overriding the move method
    @Override
    void move() {
        System.out.println("The bus is moving on the road.");
    }

    // Overriding the type method
    @Override
    void type() {
        System.out.println("This is a bus.");
    }
}

// Subclass Train
class Train extends Transport {
    // Overriding the move method
    @Override
    void move() {
        System.out.println("The train is moving on the tracks.");
    }

    // Overriding the type method
    @Override
    void type() {
        System.out.println("This is a train.");
    }
}

// Subclass Airplane
class Airplane extends Transport {
    // Overriding the move method
    @Override
    void move() {
        System.out.println("The airplane is flying in the sky.");
    }

    // Overriding the type method
    @Override
    void type() {
        System.out.println("This is an airplane.");
    }
}

// Main class to test the functionality
public class transport {
    public static void main(String[] args) {
        // Creating objects of each subclass
        Transport myBus = new Bus();
        Transport myTrain = new Train();
        Transport myAirplane = new Airplane();

        // Calling methods on each object
        myBus.type();
        myBus.move();

        myTrain.type();
        myTrain.move();

        myAirplane.type();
        myAirplane.move();
    }
}
