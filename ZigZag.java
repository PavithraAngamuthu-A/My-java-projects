/* Given a matrix of 2D array of n rows and m coloumns. Print this matrix in ZIG-ZAG fashion as shown in figure.
 Example:
Input:
1 2 3
4 5 6
7 8 9
Output:
1 2 4 7 5 3 6 8 9*/
import java.util.*;
public class ZigZag {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int i,j,d;
        int n=s1.nextInt();
        int m=s1.nextInt();
        int [][]a=new int[n][m];
        for(i=0;i<n;i++){
            for(j=0;j<m;j++) {
                a[i][j] = s1.nextInt();
            }
        }
        for(d=0;d<n+m-1;d++){
            if(d%2==0){
                i=(d<n)?d:n-1;
                j=d-i;
                while(i>=0&&j<m){
                    System.out.print(a[i][j] + " ");
                    i--;j++;
                }
            }
            else {
                j = (d < m) ? d : m - 1;
                i = d - j;
                while (j >= 0 && i < n) {
                    System.out.println(a[i][j] + " ");
                    i++;
                    j--;
                }
            }
        }
    }
}


