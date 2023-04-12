package ExamSolution1.java;

import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long A = in.nextLong();
        Long n;
        n = null;
        Long num = n/s.length();
        long ans = 0;
        for(int i = 0;i <s.length();i++){
            if(s.charAt(i) == 'a'){
                ans += num;
                int rem = 0;
                if(i< rem)
                    ans++;
            }
        }
        System.out.println(ans);



    }
}
