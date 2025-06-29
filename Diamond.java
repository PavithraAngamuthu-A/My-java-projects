/*Diamond pattern : for given input size -> Here 3
  *
 ***
*****
 ***
  *  */
import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int i,j;
        int a = s1.nextInt();
        int p = a * 2;
        for (i = 0; i < p-1; i++) {
            for (j = 0; j < p-1; j++) {
                if (!(i + j <= a -2 || j - i>=a || i + j >= p+a-2 || i - j >= a)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
