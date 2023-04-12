package ExamsPractise;
import java.util.Scanner;
public class Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first binary number:");
        Scanner scn = new Scanner(System.in );
        String first = scn.nextLine();
        System.out.println("Enter the second binary number:");
        String second = scn.nextLine();
        int c = Integer.parseInt(first, 2);
        int d = Integer.parseInt(second,2);
        int e = c + d;
        System.out.println("addition of two binary numbers:-" + Integer.toBinaryString(e));
    }
}









