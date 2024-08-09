import java.util.*;
class student
{
    int marks;
    double total;
    double aggregate;
}
class grade extends student{
    int p;
    int c;
    int m;
    int phy;
    int che;
    int prof;

    void getdata()
    {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the marks in python");
        p = inp.nextInt();
        System.out.println("Enter the marks in c programmin: ");
        c = inp.nextInt();
        System.out.println("Enter the marks in mathematics: ");
        m = inp.nextInt();
        System.out.println("Enter the marks in physics: ");
        phy = inp.nextInt();
        System.out.println("Enter the marks in chemistry: ");
        che = inp.nextInt();
        System.out.println("Enter the marks in profession Ethics: ");
        prof = inp.nextInt();
    }

    void gettotal()
    {
        total = (p+c+m+phy+che+prof);
        System.out.println("Total = "+total);
    }
    void getaggre()
    {
        aggregate = (total/600)*100;
        String s = String.format("%.2f",aggregate);
        System.out.println("Aggregate = "+s);
    }
    void getclass()
    {
        if(aggregate>75)
        {
            System.out.println("Class = Distinction");
        }
        else if(aggregate>=60 && aggregate<75)
        {
            System.out.println("Class = First Division");
        }
        else if(aggregate>=50 && aggregate<60)
        {
            System.out.println("Class = Second Division");
        }
        else if(aggregate>=40 && aggregate<50)
        {
            System.out.println("Class = Third Division");
        }
        else
        {
            System.out.println("Class = FAIL");
        }
    }
}
public class mark {
    public static void main(String[] args)
    {
        grade g = new grade();
        g.getdata();
        g.gettotal();
        g.getaggre();
        g.getclass();
    }
    
}
