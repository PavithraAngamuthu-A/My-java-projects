/*Check if a number ‘a’ is present in another number ‘b.
 input a=234;b=123456
 output=yes //234 is present in b*/
import java.util.*;
public class CheckApresentB {
    public static int check(int a,int[]a1){
        int i=0;
        while(a!=0){
            a1[i++]=a%10;
            a=a/10;
        }return i;
    }
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int a = s1.nextInt();
        int b = s1.nextInt();
        int[] a1 = new int[10];
        int[] b1 = new int[10];
        int len1 = check(a, a1);
        int len2 = check(b, b1);
        int count = 0, ans = 0;
        for (int i = len1 - 1; i >= 0; i--) {
            for (int j = len2 - 1; j >= 0; j--) {
                if (a1[i] == b1[j] && a1[i + 1] == b1[j + 1] || i == len1 - 1) {
                    count++;
                    break;
                } else {
                    count = 0;
                }
            }
            if (count == 0) {
                ans = 0;
            } else {
                ans += count;
            }
        }
        if (ans == len1) {
            System.out.println("Yes,The number a is present in number b");
        } else {
            System.out.println("No,The number a is not present in number b");
        }
    }

}
