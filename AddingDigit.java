 /*adding a digit to all the digits of a number eg digit=4, number = 2875, o/p= 612119*/
import java.util.*;
public class A66AddingDigit {
    public static void main(String[] args) {
        Scanner s1= new Scanner(System.in);
        int num=s1.nextInt();
        int d=s1.nextInt();
        List<Integer>n = new ArrayList<>();
        while(num!=0){
            int rev=0;
            rev=d+num%10;
            num/=10;
            n.add(rev);
        }
        Collections.reverse(n);
        for(Integer integer:n){
            System.out.print(integer);
        }
    }
}
