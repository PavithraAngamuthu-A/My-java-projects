/*Given two sorted arrays, merge them such that the elements are not repeated
Eg 1: Input:
        Array 1: 2,4,5,6,7,9,10,13
        Array 2: 2,3,4,5,6,7,8,9,11,15
       Output:
       Merged array: 2,3,4,5,6,7,8,9,10,11,13,15 */

import java.util.*;
public class MergeTwoArray {
    public static void main(String[] args) {
        Scanner s1= new Scanner(System.in);
        int i,j,k=0,len,p;
        int n=s1.nextInt();
        int []a=new int[n];
        int m =s1.nextInt();
        int[] c = new int[n+m];
        len=c.length;
        for(i=0;i<n;i++){
            a[i]=s1.nextInt();
            c[k++]=a[i];
        }
        int []b=new int[m];
        for(i=0;i<m;i++){
            b[i]=s1.nextInt();
            c[k++]=b[i];
        }

        for(i=0;i<len;i++){
            for(j=i+1;j<len;j++){
                if(c[i]==c[j]) {
                    for (p = j; p < len - 1; p++) {
                            c[p] = c[p + 1];
                    }
                    len--;j--;
                }
            }
        }
        for(i=0;i<len;i++) {
            for (j = i + 1; j < len; j++) {
                if (c[i] > c[j]) {
                    c[i] = c[i] + c[j] - (c[j] = c[i]);
                }
            }
        }
        for(i=0;i<len;i++){
            System.out.print(c[i] + " ");
        }

    }
}