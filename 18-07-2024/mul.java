import java.util.Scanner;

class MultiplicationTable {
    private int number;
    private int limit;
    public MultiplicationTable(int number, int limit) {
        this.number = number;
        this.limit = limit;
    }

    public void printTable() {
        for (int i = 1; i <= limit; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}

public class mul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number for the multiplication table: ");
        int number = scanner.nextInt();
        System.out.println("Enter the limit:");
        int lim = scanner.nextInt();

        MultiplicationTable table = new MultiplicationTable(number,lim);

        table.printTable();

        scanner.close();
    }
}
