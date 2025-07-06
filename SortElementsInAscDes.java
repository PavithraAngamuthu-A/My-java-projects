/*Write a program to sort the elements in odd positions in descending order and elements in ascending order
Eg 1: Input: 13,2 4,15,12,10,5
        Output: 13,2,12,10,5,15,4
Eg 2: Input: 1,2,3,4,5,6,7,8,9
        Output: 9,2,7,4,5,6,3,8,1 */

import java.util.*;
public class SortElementsInAscDes {
    public static void sort(int[]a,int n,int k){
        int i,j;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(a[i]>a[j] && k==1){
                    a[i]=a[i]+a[j]-(a[j]=a[i]);
                }
                else if(a[i]<a[j] && k==0){
                    a[i]=a[i]+a[j]-(a[j]=a[i]);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int i,j,k=0,p=0,m;
        int n=s1.nextInt();
        int []a=new int[n];
        for(i=0;i<n;i++){
            a[i]=s1.nextInt();
        }
        int []eve=new int[n/2];
        int []odd=new int[(n+1)/2];
        System.out.println(odd.length);
        for(i=0;i<n;i++){
            if((i+1) % 2==0){
                eve[k++]=a[i];
            }
            else{
                odd[p++]=a[i];
            }
        }
        sort(eve,k,1);
        sort(odd,p,0);

       for(i=0;i<=n/2;i++){
           if(i<p) {
               System.out.print(odd[i] + " ");
           }
           if(i<k) {
               System.out.print(eve[i] + " ");
           }
       }

    }
}
