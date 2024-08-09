import java.util.*;

public class ATM1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the amount: ");
        int amt = s.nextInt();

        int ch;
        int n;

        do {
            System.out.println("select how u want to denominize ur amount: ");
            System.out.println("1. In 2000's\n2. In 500's\n3. In 100's\n4. In 200's\n5.Exit");
            ch = s.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Ur amount in 2000's");
                    System.out.println("Number of 2000 notes will have in ur amount = ");
                    n = amt / 2000;
                    System.out.println(n);
                    break;

                case 2:
                    System.out.println("Ur amount in 500's");
                    System.out.println("Number of 500 notes will have in ur amount = ");
                    n = amt / 500;
                    System.out.println(n);
                    break;

                case 3:
                    System.out.println("Ur amount in 100's");
                    System.out.println("Number of 100 notes will have in ur amount = ");
                    n = amt / 100;
                    System.out.println(n);
                    break;

                case 4:
                    System.out.println("Ur amount in 200's");
                    System.out.println("Number of 200 notes will have in ur amount = ");
                    n = amt / 200;
                    System.out.println(n);
                    break;

                case 5:
                    System.out.println("Exiting.....");
                    break;
            }
        } while (ch != 5);

        s.close();
    }

}
