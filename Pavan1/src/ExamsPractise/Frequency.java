package ExamsPractise;

import java.io.OptionalDataException;

public class Frequency {
    public static void main(String[] args){
        int a[] = {1,2,3,1,4,5};
        int count = 0;
        for(int i = 0; i<a.length-1;i++){
            if(a[i]!= a[i+1]){
                int temp = a[i];
                System.out.println("Number:"+temp+"is occured");
                for(int j = 0; j <= a.length-1; j++){
                    if(temp == a[j]){
                        count++;
                    }
                }
                    System.out.println("count"+count+" ");
                }
        }
    }
}
