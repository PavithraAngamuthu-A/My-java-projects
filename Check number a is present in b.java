/*Check if a number ‘a’ is present in another number ‘b.
 input a=234;b=123456
 output=yes //234 is present in b*/
import java.util.*;
import static java.lang.System.exit;
public class A70AisPresentB {
    public static int check(int  n,int[]a1){

        int i=0;
        while(n!=0){
            a1[i++]=n%10;
            n/=10;
        }
        return i;
    }
    public static void main(String[] args) {
        Scanner s1= new Scanner(System.in);
        int i,j,count = 1,ans=0;
        //int a=426,b=74286;
        int a=s1.nextInt();
        int b=s1.nextInt();
        int []a1=new int[10];
        int []b1=new int[10];
        int l1=check(a,a1);
        int l2=check(b,b1);
        for(i=0;i<=l2-l1;i++){
            count=1;
            for(j=0;j<l1;j++){
                if(b1[i+j]!=a1[j]){
                    count=0;break;
                }
            }
            if(count==1){
                System.out.println("Yes.A is present in B");return;
            }
        }
        System.out.println("No,A is not present in B");
    }
}
