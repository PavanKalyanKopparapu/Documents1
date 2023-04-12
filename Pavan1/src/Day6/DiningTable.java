package Day6;

import javax.swing.*;
import java.util.Scanner;

public class DiningTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of person:");
        int i = sc.nextInt();
        int SpoonAndPerson = 2 * i;
        int arr[] = new int[SpoonAndPerson];
        for (int m = 0; m < SpoonAndPerson; m++) {
            if (m % 2 == 0) {
                arr[m] = 8;
            } else {
                arr[m] = 1;
            }
        }
        System.out.println(("--> Diningtable<--"));
        for (int k : arr) {
            System.out.println(k + " ");
        }
        System.out.println();
        System.out.println();
        if (true) {
            for (int m = 0; m < SpoonAndPerson; m++) {
                if ((m == 0) && (arr[m] == 8))
                    System.out.println("person" + ((m / 2) + 1) + "takeforkofbothside.");
                arr[arr.length - 1] = 0;
                arr[m + 1] = 0;
                arr[m + 1] = 9;
                for (int k : arr) {
                    System.out.print(k + " ");
                }
                System.out.println();
                System.out.println();
            }
            int m = 0;
            if(( m != 0) && (arr[m] == 8)) {
                if (arr[m - 1] == 1 && arr[m + 1] == 1) {
                    //      System.out.println("for person"+(m/2)+1)+"fork is avialble:");
                    //        System.out.println("person"+((m/2)+1)+"takeforkofbothside.");
                    arr[m - 1] = 0;
                    arr[m + 1] = 0;
                    arr[m] = 9;
                } else {
                    System.out.println("Nowforkisnotavilable for" + ((m / 2) + 1));
                    System.out.println("person" + (m / 2) + "Release Resources.");
                    if (arr[m] == 8) {
                        arr[m + 1] = 1;
                        arr[m - 1] = 1;

                    }
                }
                for (int k : arr) {
                    System.out.println(k + "");
                }
                System.out.println();
                System.out.println();
            }
        }
        System.out.println(("--> Diningtable<--"));
        for (int k : arr) {
            System.out.print(k + " ");
        }
        System.out.println(" ");
        System.out.println(" ");
    }
}

