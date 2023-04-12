import java.util.Scanner;

public class Practical2 {
    public static void main(String[] args) {
        int a[] = {1,2,3,1,4,5};
        int string = 7;
        for(int i = 0; i<a.length-1;i++){
            if(a[i]!= a[i+1]){
                int temp = a[i];
                System.out.println("Enter string");
                Scanner sc =new Scanner(System.in);
                String s =sc.nextLine();
                for(int j = 0; j <= a.length-1; j++){
                    if(temp == a[j]){
                        string++;
                    }
                }
                System.out.println("string"+string+" ");
            }
        }

        }


    }

