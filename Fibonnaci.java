import java.util.*;
public class A76Fibonnaci {
    public static int[] fibo(int n){
        int a=0,b=1,i,c;
        int k[]=new int[n];
        for(i=0;i<n;i++){
            if(i==0)
                k[i]=0;
            else if(i==1){
                k[i]=i;
            }
            else {
                c = a + b;
                k[i] = c;
                a = b;
                b = c;
            }
        }
        return k;

    }
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int i,j,max=0,p;
        int n=s1.nextInt();
        int []a=new int[n];
        for(i=0;i<n;i++){
            a[i]=s1.nextInt();
        }
        for(i=0;i<n;i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        int []k = fibo(max);
        for(i=0;i<n;i++){
            for(j=0;j<k.length;j++){
                if(a[i]==k[j]){
                    System.out.print(a[i] + " ");break;
                }
            }
        }
    }
}
