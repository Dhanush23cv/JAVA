import java.util.Scanner;

class SumOfNum {
    public void sumOf(int num) {
        int sum = 0;
        if (num == 0) {
            System.out.println(0);
        } else {
            for (int i = 1; i <= num; i++) {
                sum += i;
            }
            System.out.println(sum);
        }
    }
}

public class sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scan.nextInt();
        SumOfNum obj = new SumOfNum();
        obj.sumOf(n);
        scan.close();
    }
}
