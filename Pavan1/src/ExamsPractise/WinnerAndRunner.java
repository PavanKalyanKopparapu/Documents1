package ExamsPractise;
import java.util.Arrays;
import java.util.Collection;
import java .util.Collections;
public class WinnerAndRunner {
    public static void main(String[] args){
        Integer a[] = {30,40,90,60,70,90};
        Arrays.sort(a);
        Arrays.sort(a,Collections.reverseOrder());
        System.out.println(Arrays.toString(a));
        System.out.println("The winner is:-"+a[0]+"The Runnerup is:-"+a[1]);
    }
}
