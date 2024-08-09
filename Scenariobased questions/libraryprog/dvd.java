package libraryprog;

import java.util.*;

public class dvd extends lib {
    String dvdname;

    public void borrowdvd() {
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

    public void returndvd() {
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

    public void display() {
        System.out.println("Name = " + name);
        System.out.println("Regno = " + regno);
        System.out.println("dvd name = " + dvdname);
        System.out.println("Number of days taken = " + bday);
    }

    public void check() {
        if (rday <= bday) {
            System.out.println("dvd returned to library");
        } else {
            System.out.println("return date exceeded");
            System.out.println("You are charged with 100 rupees fine");
        }
    }
}
