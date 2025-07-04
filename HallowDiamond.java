/*input = 5
output =
**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********
*/
import java.util.*;
public class HallowDiamond {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int i,j;
        int n=s1.nextInt();

        for(i=1;i<=n*2;i++){
            for(j=1;j<=n*2;j++){
                if( i+j<=n+1 || i-j<=-n || i+j>=n*3+1 || i-j>=n ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
