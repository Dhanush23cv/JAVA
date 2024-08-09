import java.util.*;
class Product 
{
    String productId;
    String name;
    String description;
    double price;
    int stock;

    Product(String productId, String name, String description, double price, int stock) 
    {
        this.productId = productId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
    }

    void updateStock(int quantity) 
    {
        this.stock += quantity;
        System.out.println("Updated stock = " + stock);
    }

    void getDetails() 
    {
        System.out.println("Product details: \n" +
                "Product ID: " + productId + "\n" +
                "Name: " + name + "\n" +
                "Description: " + description + "\n" +
                "Price: " + price + "\n" +
                "Stock: " + stock);
    }
}

class User 
{
    String userId;
    String name;
    String email;
    List<Order> orders;

    User(String userId, String name, String email)
    {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.orders = new ArrayList<>();
    }

    void addOrder(Order order) 
    {
        orders.add(order);
    }

    List<Order> getOrders() 
    {
        return orders;
    }
}

class Cart 
{
    User user;
    List<Product> products;

    Cart(User user) 
    {
        this.user = user;
        this.products = new ArrayList<>();
    }

    void addProduct(Product product) 
    {
        products.add(product);
    }

    void removeProduct(String productId) 
    {
        products.removeIf(product -> product.productId.equals(productId));
    }

    double getTotalPrice() 
    {
        double total = 0.0;
        for (Product product : products) 
        {
            total += product.price;
        }
        return total;
    }
}

class Order 
{
    String orderId;
    User user;
    List<Product> products;
    double totalPrice;
    String status;

    Order(String orderId, User user, List<Product> products) 
    {
        this.orderId = orderId;
        this.user = user;
        this.products = new ArrayList<>(products);
        this.totalPrice = calculateTotalPrice();
        this.status = "Pending";
    }

    double calculateTotalPrice() 
    {
        double total = 0.0;
        for (Product product : products) 
        {
            total += product.price;
        }
        return total;
    }

    void updateStatus(String status) 
    {
        this.status = status;
    }

    void getDetails() 
    {
        System.out.println("Order details: \n" +
                "Order ID: " + orderId + "\n" +
                "User: " + user.name + "\n" +
                "Products: " + products.size() + "\n" +
                "Total Price: " + totalPrice + "\n" +
                "Status: " + status);
    }
}

public class ecommerce 
{
    public static void main(String[] args) 
    { 
        Product product1 = new Product("P001", "Laptop", "High performance laptop", 1200.00, 10);
        User user1 = new User("U001", "John Doe", "john@example.com");
        Cart cart = new Cart(user1);
        cart.addProduct(product1);
        System.out.println("Total cart price: $" + cart.getTotalPrice());
        Order order = new Order("O001", user1, cart.products);
        user1.addOrder(order);
        order.getDetails();
        order.updateStatus("Shipped");
        System.out.println("Updated Order Status: " + order.status);

        for (Order o : user1.getOrders()) 
        {
            o.getDetails();
        }
        product1.updateStock(-1); 
        product1.getDetails();
    }
}
