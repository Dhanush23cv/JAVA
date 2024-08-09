import java.util.*;

class Product {
    String productId;
    String name;
    double price;
    int quantityInStock;
    int amount;
}

class Electronics extends Product {
    int warranty = 5;

    void getdata() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the product ID: ");
        productId = s.nextLine();
        System.out.println("Enter the name of the product: ");
        name = s.nextLine();
        System.out.println("Enter the price of the product: ");
        price = s.nextDouble();
        System.out.println("Enter the quantity in stock: ");
        quantityInStock = s.nextInt();
    }

    void display() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Stock Quantity: " + quantityInStock);
        System.out.println("Warranty: " + warranty + " years");
    }

    void update() {
        if (amount <= quantityInStock) {
            quantityInStock -= amount;
            System.out.println("Purchase successful! Stock updated.");
        } else {
            System.out.println("Insufficient stock....");
        }
    }
}

class Clothing extends Product {
    int size;

    void getdata() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the product ID: ");
        productId = s.nextLine();
        System.out.println("Enter the name of the product: ");
        name = s.nextLine();
        System.out.println("Enter the price of the product: ");
        price = s.nextDouble();
        System.out.println("Enter the quantity in stock: ");
        quantityInStock = s.nextInt();
        System.out.println("Enter the size: ");
        size = s.nextInt();
    }

    void display() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Stock Quantity: " + quantityInStock);
        System.out.println("Size: " + size);
    }

    void update() {
        if (amount <= quantityInStock) {
            quantityInStock -= amount;
            System.out.println("Purchase successful! Stock updated.");
        } else {
            System.out.println("Insufficient stock....");
        }
    }
}

class Grocery extends Product {
    String expirationDate;

    void getdata() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the product ID: ");
        productId = s.nextLine();
        System.out.println("Enter the name of the product: ");
        name = s.nextLine();
        System.out.println("Enter the price of the product: ");
        price = s.nextDouble();
        System.out.println("Enter the quantity in stock: ");
        quantityInStock = s.nextInt();
        System.out.println("Enter the expiration date (dd/mm/yyyy): ");
        s.nextLine(); // Consume newline left-over
        expirationDate = s.nextLine();
    }

    void display() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Stock Quantity: " + quantityInStock);
        System.out.println("Expiration Date: " + expirationDate);
    }

    void update() {
        if (amount <= quantityInStock) {
            quantityInStock -= amount;
            System.out.println("Purchase successful! Stock updated.");
        } else {
            System.out.println("Insufficient stock....");
        }
    }
}

public class ecommerce {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Electronics e = new Electronics();
        Clothing c = new Clothing();
        Grocery g = new Grocery();

        while (true) {
            System.out.println("-----Welcome to My E-Commerce site-----");
            System.out.println("Choose your category:\n1. Electronics\n2. Clothing\n3. Grocery\n4. Exit");
            int ch = inp.nextInt();

            switch (ch) {
                case 1:
                    e.getdata();
                    System.out.println("Enter amount to purchase: ");
                    e.amount = inp.nextInt();
                    e.update();
                    e.display();
                    break;
                case 2:
                    c.getdata();
                    System.out.println("Enter amount to purchase: ");
                    c.amount = inp.nextInt();
                    c.update();
                    c.display();
                    break;
                case 3:
                    g.getdata();
                    System.out.println("Enter amount to purchase: ");
                    g.amount = inp.nextInt();
                    g.update();
                    g.display();
                    break;
                case 4:
                    System.out.println("Thank you for visiting! Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
