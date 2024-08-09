package libraryprog;

import java.util.Scanner;

public class mag extends lib {
    String magname;

    public void borrowmag() {
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

    public void returnmag() {
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

    public void display() {
        System.out.println("Name = " + name);
        System.out.println("Regno = " + regno);
        System.out.println("Magazine name = " + magname);
        System.out.println("Number of days taken = " + bday);

    }

    public void check() {
        if (rday <= bday) {
            System.out.println("magazine returned to library");
        } else {
            System.out.println("return date exceeded");
            System.out.println("You are charged with 100 rupees fine");
        }
    }

}
