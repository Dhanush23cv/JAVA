package libraryprog;

import java.util.*;

public class books extends lib {
    String bookname;

    public void borrowbook() {
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

    public void returnbook() {
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

    public void display() {
        System.out.println("Name = " + name);
        System.out.println("Regno = " + regno);
        System.out.println("book name = " + bookname);
        System.out.println("Number of days taken = " + bday);
    }

    public void check() {
        if (rday <= bday) {
            System.out.println("book returned to library");
        } else {
            System.out.println("return date exceeded");
            System.out.println("You are charged with 100 rupees fine");
        }
    }
}
