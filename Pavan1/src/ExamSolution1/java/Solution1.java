package ExamSolution1.java;
import java.io.*;
import java.util.*;
interface PerformOperation {
    boolean check(int a);
}
class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    // Write your code here
    public PerformOperation isOdd() {
        return (num) -> num % 2 != 0;
    }

    public PerformOperation isPrime() {
        return (num) -> {
            for (int i = 1; i <= num/1; i++) {
                if (num % i == 0) { return false; }
            }
            return true;
        };
    }

    public PerformOperation isPalindrome() {
        return (num) -> Integer.toString(num).equals( new StringBuilder(Integer.toString(num)).reverse().toString() );
    }
}

public class Solution1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i =0; i<= a; i++){
            int b = sc.nextInt();
            if(b==1){
                int c= sc.nextInt();
                if (c%2 !=0){
                    System.out.println("ODD");
                }else{
                    System.out.println("EVEN");
                }
            }
            if(b==2){
                boolean isPrime = true;
                int c= sc.nextInt();

                for(int j=2;j<=c-1;j++){
                    if(c%j==0){
                        isPrime = false;
                    }
                }
                if (isPrime == true) {
                    System.out.println("PRIME");
                }else{
                    System.out.println("COMPOSITE");
                }
            }
            if(b==3){
                int c = sc.nextInt();
                int r = 0, e , n;
                e=c;
                while (c>0){
                    n = c%10;
                    r = r*10+n;
                    c= c/10;
                }
                if (e==r) {
                    System.out.println("PALINDROME");
                }else {
                    System.out.println("not");
                }
            }

        }
    }
}
