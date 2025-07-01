/*prime factor – sort the array based on the minimum factor they have.
Input: [15, 28, 20, 33]
Output: [28, 20, 15, 33]
Explanation:
Prime factors:

15 → [3, 5] → min = 3

28 → [2, 7] → min = 2

20 → [2, 5] → min = 2

33 → [3, 11] → min = 3

Sorted by smallest prime factor: [28, 20, 15, 33]*/


import java.util.*;
public class A65PrimeFactor {
    public static boolean prime(int n){
        int i,j,flag=0;
        for(i=1;i<=n;i++){
            if(n%i==0){
                flag++;
            }
        }
        return (flag==2)?true:false;
    }
    public static int count(int n){
        int i,j,flag=0;
        for(i=2;i<=n;i++){
            if(n%i==0 && prime(i)){
                flag=i;break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int i,j;
        int n=s1.nextInt();
        int []a=new int[n];
        for(i=0;i<n;i++){
            a[i]=s1.nextInt();
        }
        int p=2;
        for(i=1;i<=Integer.MAX_VALUE;i++){
            for(j=0;j<n;j++) {
                if (count(a[j]) == i) {
                    System.out.print(a[j] + " " );
                    for(int k=j;k<n-1;k++){
                        a[k]=a[k+1];
                    }
                    j--;n--;
                }
            }
        }
    }
}
