// Person.java
class Person {
    private String name;
    private int age;
    private String address;

    // Constructor
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Method to display information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}

// Student.java
class Student extends Person {
    private String studentID;
    private String major;

    // Constructor
    public Student(String name, int age, String address, String studentID, String major) {
        super(name, age, address);
        this.studentID = studentID;
        this.major = major;
    }

    // Getters
    public String getStudentID() {
        return studentID;
    }

    public String getMajor() {
        return major;
    }

    // Setters
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentID);
        System.out.println("Major: " + major);
    }
}

// Teacher.java
class Teacher extends Person {
    private String employeeID;
    private String subject;

    // Constructor
    public Teacher(String name, int age, String address, String employeeID, String subject) {
        super(name, age, address);
        this.employeeID = employeeID;
        this.subject = subject;
    }

    // Getters
    public String getEmployeeID() {
        return employeeID;
    }

    public String getSubject() {
        return subject;
    }

    // Setters
    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Subject: " + subject);
    }
}

// Staff.java
class Staff extends Person {
    private String department;
    private String role;

    // Constructor
    public Staff(String name, int age, String address, String department, String role) {
        super(name, age, address);
        this.department = department;
        this.role = role;
    }

    // Getters
    public String getDepartment() {
        return department;
    }

    public String getRole() {
        return role;
    }

    // Setters
    public void setDepartment(String department) {
        this.department = department;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
        System.out.println("Role: " + role);
    }
}

// Main.java
public class persondetails {
    public static void main(String[] args) {
        // Creating and displaying a Student
        Student student = new Student("Alice Johnson", 20, "123 Maple St", "S12345", "Computer Science");
        System.out.println("Student Information:");
        student.displayInfo();

        System.out.println("\n");

        // Creating and displaying a Teacher
        Teacher teacher = new Teacher("Dr. John Smith", 45, "456 Oak St", "T67890", "Mathematics");
        System.out.println("Teacher Information:");
        teacher.displayInfo();

        System.out.println("\n");

        // Creating and displaying a Staff member
        Staff staff = new Staff("Jane Doe", 35, "789 Pine St", "Administration", "Office Manager");
        System.out.println("Staff Information:");
        staff.displayInfo();
    }
}
