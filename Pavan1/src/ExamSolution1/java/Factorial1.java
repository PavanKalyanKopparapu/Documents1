package ExamSolution1.java;
import java.util.Scanner;

public class Factorial1 {
    public static void main(String[] args) {
        int n, mul;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Integer");
        n = sc.nextInt();
        Factorial obj = new Factorial();
        mul = obj.fact(n);
        System.out.println("Factorial of :" + mul);
    }
    int fact(int x) {
        if (x > 1) {
            return (x * fact(x - 1));
        }
        return 1;
    }

}
