import java.util.*;

class RawMaterial 
{
    String name;
    int quantity;
    int reorderLevel;

    RawMaterial(String name, int quantity, int reorderLevel) 
    {
        this.name = name;
        this.quantity = quantity;
        this.reorderLevel = reorderLevel;
    }

    void issue(int amount) 
    {
        if (amount <= quantity) 
        {
            quantity -= amount;
            System.out.println(amount + " units of " + name + " issued.");
        } 
        else 
        {
            System.out.println("Insufficient quantity of " + name + " to issue.");
        }
        checkReorderLevel();
        System.out.println("Remaining " + name + ": " + quantity);
    }

    void receive(int amount) 
    {
        quantity += amount;
        System.out.println(amount + " units of " + name + " received.");
        checkReorderLevel();
        System.out.println("Remaining " + name + ": " + quantity);
    }

    void checkReorderLevel() 
    {
        if (quantity <= reorderLevel) 
        {
            System.out.println("Warning: " + name + " has reached or fallen below the reorder level.");
        }
    }
}

class FinishedGood 
{
    String name;
    int quantity;

    FinishedGood(String name) 
    {
        this.name = name;
        this.quantity = 0;
    }

    void receive(int amount) 
    {
        quantity += amount;
        System.out.println(amount + " units of " + name + " finished goods received.");
    }

    void display() 
    {
        System.out.println("Finished Good: " + name + ", Quantity: " + quantity);
    }
}

public class InventoryManagementSystem 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        RawMaterial steel = new RawMaterial("Steel", 100, 20);
        RawMaterial plastic = new RawMaterial("Plastic", 200, 50);

        FinishedGood car = new FinishedGood("Car");

        System.out.println("Initial Raw Material Status:");
        System.out.println("Steel: " + steel.quantity);
        System.out.println("Plastic: " + plastic.quantity);

        while (true) 
        {
            System.out.println("\nChoose an action:");
            System.out.println("1. Issue Steel");
            System.out.println("2. Issue Plastic");
            System.out.println("3. Receive Steel");
            System.out.println("4. Receive Plastic");
            System.out.println("5. Receive Finished Goods (Car)");
            System.out.println("6. Display Finished Goods (Car)");
            System.out.println("7. Exit");

            int choice = scanner.nextInt();

            if (choice == 1) 
            {
                System.out.print("Enter amount to issue for Steel: ");
                int amount = scanner.nextInt();
                steel.issue(amount);
            } 
            else if (choice == 2) 
            {
                System.out.print("Enter amount to issue for Plastic: ");
                int amount = scanner.nextInt();
                plastic.issue(amount);
            } 
            else if (choice == 3) 
            {
                System.out.print("Enter amount to receive for Steel: ");
                int amount = scanner.nextInt();
                steel.receive(amount);
            } 
            else if (choice == 4) 
            {
                System.out.print("Enter amount to receive for Plastic: ");
                int amount = scanner.nextInt();
                plastic.receive(amount);
            } 
            else if (choice == 5) 
            {
                System.out.print("Enter amount of finished goods (Car) to receive: ");
                int amount = scanner.nextInt();
                car.receive(amount);
            } 
            else if (choice == 6) 
            {
                car.display();
            } 
            else if (choice == 7) 
            {
                break;
            } 
            else 
            {
                System.out.println("Invalid choice. Please try again.");
            }
            System.out.println("Remaining Steel: " + steel.quantity);
            System.out.println("Remaining Plastic: " + plastic.quantity);
        }

        scanner.close();
    }
}
