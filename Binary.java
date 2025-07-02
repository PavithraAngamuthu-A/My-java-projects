/* Print pattern like this
Example:
Input: 1
Output: 0

Input: 2
Output: 
0 0
0 1
1 0
1 1

Input: 3
Output:
0 0 0
0 0 1
0 1 0
0 1 1
1 0 0
1 0 1
1 1 0
1 1 1*/

import java.util.*;
public class A77Binary {
    public static void main(String[] args) {
        Scanner s1= new Scanner(System.in);
        int i,totalnum=1,num=0,j,k;
        int n=s1.nextInt();
        for(i=0;i<n;i++){
            totalnum*=2;
        }
        int []b=new int[n];
        for(i=0;i<totalnum;i++){
            num=i;
            for(j=n-1;j>=0;j--){
                b[j]=num%2;
                num/=2;
            }
            for(k=0;k<n;k++){
                System.out.print(b[k] + " ");
            }
            System.out.println();
        }
    }
}
