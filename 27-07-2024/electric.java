import java.util.Scanner;

class elec {
    String consumerno;
    String consumername;
    int pmr;
    int cmr;

    void getdata() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the consumer no: ");
        consumerno = s.nextLine();
        System.out.println("Enter the consumer name: ");
        consumername = s.nextLine();
        System.out.println("Enter the previous month reading: ");
        pmr = s.nextInt();
        System.out.println("Enter the current month reading: ");
        cmr = s.nextInt();

        s.close();
    }

    void computebill() {
        double bill = 0;

        if (cmr <= 100) {
            bill = cmr * 1;
        } else if (cmr <= 200) {
            bill = cmr * 2.50;
        } else if (cmr <= 500) {
            bill = cmr * 4;
        } else {
            bill = cmr * 6;
        }

        System.out.println("Bill for the current month = " + bill);
    }

    void display() {
        System.out.println("Consumer no = " + consumerno);
        System.out.println("Consumer name = " + consumername);
        System.out.println("Previous month reading = " + pmr);
        System.out.println("Current month reading = " + cmr);
    }
}

public class electric {
    public static void main(String[] args) {
        elec obj = new elec();
        obj.getdata();
        obj.display();
        obj.computebill();
    }
}
