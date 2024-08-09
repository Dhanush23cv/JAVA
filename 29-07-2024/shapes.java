import java.util.*;

class shape {
    double radius;
    double length;
    double heigth;
    double breadth;
    double base;

    static double pi = 3.14;
}

class circle extends shape {
    void getdata() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        radius = inp.nextDouble();
    }

    void getarea() {
        double area = pi * (radius * radius);
        System.out.println("Area of the circle = " + area);
    }

    void getperimeter() {
        double perimeter = 2 * pi * radius;
        System.out.println("Perimeter of the circle = " + perimeter);
    }
}

class rectangle extends shape {
    void getdata() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        length = inp.nextDouble();
        System.out.println("Enter the breadth of the breadth: ");
        breadth = inp.nextDouble();
    }

    void getarea() {
        double area = length * breadth;
        System.out.println("Area of the rectangle = " + area);
    }

    void getperimeter() {
        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of the rectangle = " + perimeter);
    }
}

class triangle extends shape {
    double a;
    double b;
    double c;

    void getdata() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the base of the triangle: ");
        base = inp.nextDouble();
        System.out.println("Enter the heigth of the triangle: ");
        heigth = inp.nextDouble();
        System.out.println("Enter the sides of the triangle: ");
        a = inp.nextDouble();
        b = inp.nextDouble();
        c = inp.nextDouble();
    }

    void getarea() {
        double area = 0.5 * (base * heigth);
        System.out.println("Area of the triangle = " + area);
    }

    void getperimeter() {
        double perimeter = a + b + c;
        System.out.println("Perimeter of the triangle = " + perimeter);
    }
}

public class shapes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ch;

        do {
            System.out.println("Enter the choice/n1.circle/n2.rectangle/3.triangle/n4.exit");
            ch = s.nextInt();
            switch (ch) {
                case 1:
                    circle c = new circle();
                    c.getdata();
                    System.out.println("Choose among this/n1.area/2.perimeter/3.exit");
                    int ch1 = s.nextInt();
                    switch (ch1) {
                        case 1:
                            c.getarea();
                            break;

                        case 2:
                            c.getperimeter();
                            break;

                        case 3:
                            System.out.println("exiting.....");
                            break;
                    }
                    break;

                case 2:
                    rectangle r = new rectangle();
                    r.getdata();
                    System.out.println("Choose among this/n1.area/2.perimeter/3.exit");
                    int ch2 = s.nextInt();
                    switch (ch2) {
                        case 1:
                            r.getarea();
                            break;

                        case 2:
                            r.getperimeter();
                            break;

                        case 3:
                            System.out.println("exiting.....");
                            break;
                    }
                    break;

                case 3:
                    triangle t = new triangle();
                    t.getdata();
                    System.out.println("Choose among this/n1.area/2.perimeter/3.exit");
                    int ch3 = s.nextInt();
                    switch (ch3) {
                        case 1:
                            t.getarea();
                            break;

                        case 2:
                            t.getperimeter();
                            break;

                        case 3:
                            System.out.println("exiting.....");
                            break;
                    }
                    break;

                case 4:
                    System.out.println("exiting");
                    break;
            }
        } while (ch != 4);
    }
}
