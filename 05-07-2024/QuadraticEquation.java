import java.util.Scanner;
public class QuadraticEquation 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();
        double discriminant = b * b - 4 * a * c;
        System.out.println("The discriminant is: " + discriminant);
        if (discriminant > 0) 
        {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The equation has two distinct real roots: " + root1 + " and " + root2);
        } 
        else if (discriminant == 0) 
        {
            double root = -b / (2 * a);
            System.out.println("The equation has one real root: " + root);
        } 
        else 
        {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("The equation has two complex roots: " + realPart + " + " + imaginaryPart + "i and " + realPart + " - " + imaginaryPart + "i");
        }
        scanner.close();
    }
}
