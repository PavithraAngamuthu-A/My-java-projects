/*INPUT = 11
2 3 2 4 5 12 2 3 3 3 12
OUTPUT = 3 3 3 3 2 2 2 12 12 4 5 */
import java.util.*;

public class SortAnArrayByFrequency {
    public static int count(int k,int []a,int n){
        int i,j,flag=0;
        for(i=0;i<n;i++){
            if(k==a[i]){
                flag++;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int i,j,k;
        int n=s1.nextInt();
        int []a=new int[n];
        for(i=0;i<n;i++){
            a[i]=s1.nextInt();
        }
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(a[i]>a[j]){
                        a[i]=a[i]+a[j]-(a[j]=a[i]);
                }
            }
        }
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(count(a[i],a,n)<count(a[j],a,n)){
                    a[i]=a[i]+a[j]-(a[j]=a[i]);
                }
            }
        }
        for(i=0;i<n;i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}
