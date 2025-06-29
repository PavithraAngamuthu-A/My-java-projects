/* Print the following pattern
   1  
  3 2
 6 5 4
10 9 8 7
10 9 8 7 
 6 5 4 
  3 2 
   1*/

import java.util.*;
public class DiamondNum {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int i, j, count = 1, add = 2, ans,k=0;
        int a = s1.nextInt();
        for(i=1;i<=a;i++){
            for(j=1;j<=a-i;j++){
                System.out.print(" ");
            }
            k=count;
            ans=count;
            for(j=1;j<=i;j++){
                System.out.print(ans + " ");
                ans--;
            }
            System.out.println();
           count+=add;
           add++;
        }
         add=a;
        for(i=a;i>=1;i--){
            for(j=i;j<a;j++){
                System.out.print(" ");
            }
            ans=k;
            for(j=1;j<=i;j++){
                System.out.print(ans + " ");
                ans--;
            }
            System.out.println();
            k-=add;
            add--;
        }
    }
}


