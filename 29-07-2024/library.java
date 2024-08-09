import java.util.*;

class lib {
    String regno;
    String name;
    int bday;
    int rday;
}

class mag extends lib {
    private String magname;

    void borrowmag() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Tell me your regno: ");
        regno = inp.nextLine();
        System.out.println("Tell me ur name");
        name = inp.nextLine();
        System.out.println("Tell me the magazine name: ");
        magname = inp.nextLine();
        System.out.println("Tell me number of days u want the magazine: ");
        bday = inp.nextInt();
    }

    void returnmag() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Tell me your regno: ");
        regno = inp.nextLine();
        System.out.println("Tell me ur name");
        name = inp.nextLine();
        System.out.println("Tell me the magazine name: ");
        magname = inp.nextLine();
        System.out.println("Tell me the nunber of days since you taken the magazine: ");
        rday = inp.nextInt();
    }

    void display() {
        System.out.println("Name = " + name);
        System.out.println("Regno = " + regno);
        System.out.println("Magazine name = " + magname);
        System.out.println("Number of days taken = " + bday);

    }

    void check() {
        if (rday <= bday) {
            System.out.println("magazine returned to library");
        } else {
            System.out.println("return date exceeded");
            System.out.println("You are charged with 100 rupees fine");
        }
    }

}

class dvd extends lib {
    private String dvdname;

    void borrowdvd() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Tell me your regno: ");
        regno = inp.nextLine();
        System.out.println("Tell me ur name");
        name = inp.nextLine();
        System.out.println("Tell me the dvd name: ");
        dvdname = inp.nextLine();
        System.out.println("Tell me number of days u want the dvd: ");
        bday = inp.nextInt();
    }

    void returndvd() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Tell me your regno: ");
        regno = inp.nextLine();
        System.out.println("Tell me ur name");
        name = inp.nextLine();
        System.out.println("Tell me the dvd name: ");
        dvdname = inp.nextLine();
        System.out.println("Tell me the nunber of days since you taken the dvd: ");
        rday = inp.nextInt();
    }

    void display() {
        System.out.println("Name = " + name);
        System.out.println("Regno = " + regno);
        System.out.println("dvd name = " + dvdname);
        System.out.println("Number of days taken = " + bday);
    }

    void check() {
        if (rday <= bday) {
            System.out.println("dvd returned to library");
        } else {
            System.out.println("return date exceeded");
            System.out.println("You are charged with 100 rupees fine");
        }
    }
}

class books extends lib {
    private String bookname;

    void borrowbook() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Tell me your regno: ");
        regno = inp.nextLine();
        System.out.println("Tell me ur name");
        name = inp.nextLine();
        System.out.println("Tell me the book name: ");
        bookname = inp.nextLine();
        System.out.println("Tell me number of days u want the book: ");
        bday = inp.nextInt();
    }

    void returnbook() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Tell me your regno: ");
        regno = inp.nextLine();
        System.out.println("Tell me ur name");
        name = inp.nextLine();
        System.out.println("Tell me the book name: ");
        bookname = inp.nextLine();
        System.out.println("Tell me the nunber of days since you taken the book: ");
        rday = inp.nextInt();
    }

    void display() {
        System.out.println("Name = " + name);
        System.out.println("Regno = " + regno);
        System.out.println("book name = " + bookname);
        System.out.println("Number of days taken = " + bday);
    }

    void check() {
        if (rday <= bday) {
            System.out.println("book returned to library");
        } else {
            System.out.println("return date exceeded");
            System.out.println("You are charged with 100 rupees fine");
        }
    }
}

public class library {
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        mag m = new mag();
        dvd d = new dvd();
        books b = new books();
        int ch;
        int ch1;

        do 
        {

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
