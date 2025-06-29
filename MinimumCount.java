/*Given a number N. find the minimum count of numbers in which N can be represented as a sum of numbers x1, x2, … xn. where xi is number whose digits are 0s and 1s.
example 1)  i/p :  N = 33
o/p : count = 3.     33( 11 + 11 + 11 )
some other possibilities of 33 is (11 + 11 + 10 + 1),   (11 + 10 + 10 + 1 + 1 ), (10 + 10 + 10 + 1 + 1 + 1)*/

import java.util.*;
public class MinimumCount {
    public static void main(String[]args){
        Scanner s1=new Scanner(System.in);
        int n=s1.nextInt();

        while (n!=0){
            int temp=n,m=0,p=1,rem=0;
            while(temp!=0){
                rem=temp%10;
                temp/=10;
                if(rem!=0){
                    m=m+p;
                }
                p=p*10;

            }
            System.out.println(m);
            n=n-m;
        }

    }
}
