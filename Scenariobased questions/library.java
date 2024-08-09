import libraryprog.*;
import java.util.*;

public class library {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        mag m = new mag();
        dvd d = new dvd();
        books b = new books();
        int ch;
        int ch1;

        do {
            System.out.println("Choose among the following options:\n1.Borrow\n2.Return\n3.exit");
            ch = s.nextInt();

            switch (ch) {
                case 1:
                    do {
                        System.out.println("What do you want to borrow?\n1.Book\n2.DVD\n3.Magazine\n4.exit");
                        ch1 = s.nextInt();

                        switch (ch1) {
                            case 1:
                                b.borrowbook();
                                b.display();
                                break;

                            case 2:
                                d.borrowdvd();
                                d.display();
                                break;

                            case 3:
                                m.borrowmag();
                                m.display();
                                break;

                            case 4:
                                System.out.println("exiting....");
                                break;
                        }
                    } while (ch1 != 4);
                    break;

                case 2:
                    do {
                        System.out.println("What do you want to return?\n1.Book\n2.DVD\n3.Magazine\n4.exit");
                        ch1 = s.nextInt();

                        switch (ch1) {
                            case 1:
                                b.returnbook();
                                b.check();
                                break;

                            case 2:
                                d.returndvd();
                                d.check();
                                break;

                            case 3:
                                m.returnmag();
                                m.check();
                                break;

                            case 4:
                                System.out.println("exiting....");
                                break;
                        }
                    } while (ch1 != 4);
                    break;

                case 3:
                    System.out.println("exiting.....");
                    break;
            }
        } while (ch != 3);
        s.close();
    }
}
