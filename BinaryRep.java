/*input 7 2 10 16 output 2 16 2 10 7*/
import java.util.*;
public class BinaryRep {
    public static int count(int n){
        int i,j,flag=0;
        while(n!=0){
            flag+=n%2;
            n/=2;
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int n=s1.nextInt();
        int []a=new int[n];
        int i,j,k;
        for(i=0;i<n;i++){
            a[i]=s1.nextInt();
        }
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(count(a[i])>count(a[j])){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(i=0;i<n;i++){
            System.out.println(a[i] + " ");
        }
    }
}
