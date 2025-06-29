/*Input : {5, 11, 10, 20, 9, 16, 23}
Output : 20 16 10 9 5 11 23
Number of distinct factors:
For 20 = 6, 16 = 5, 10 = 4, 9 = 3
and for 5, 11, 23 = 2 (same number of factors
therefore sorted in increasing order of index)*/


import java.util.*;
public class SortPrimeMiniFactor {
    public static int count(int n){
        int i,j,flag=1;
        for(i=1;i<n/2;i++){
            if(n%i==0) {
                flag++;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int i, j;
        int n = s1.nextInt();
        int[] a = new int[n];
        for(i=0;i<n;i++){
            a[i]=s1.nextInt();
        }
        for (i = 0; i < n; i++) {
            for (j = i+1; j < n; j++) {
                if (count(a[i]) <count(a[j])) {
                    a[i] = a[i] + a[j] - (a[j] = a[i]);
                }
            }
        }
       for(i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}
