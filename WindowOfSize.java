/*Given an array of numbers and a window of size k. Print the maximum of numbers inside the window for each step as the window moves from the beginning of the array.
  INPUT  :
  
  Enter the array size  :  8
  Enter the elements  :  1,3,5,2,1,8,6,9
  Enter the window size  :  3

  OUTPUT  :

  5 5 5 8 8 9*/

import java.util.*;
public class A89WindowOfSize {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int i,j,max=0;
        int n=s1.nextInt();
        int []a=new int[n];
        for(i=0;i<n;i++){
            a[i]=s1.nextInt();
        }
        int k=s1.nextInt();
        for(i=0;i<=n-k;i++){
            max=a[i];
            for(j=1;j<k;j++){
                if(max<a[i+j]){
                    max=a[i+j];
                }
            }
            System.out.println(max + " ");
        }
    }
}
