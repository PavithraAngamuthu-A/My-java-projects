/*Given two arrays. Find its union.
  Input  : 

  Enter size of first array  :  6
  Enter the elements    :  1 2 3 4 5 3
  Enter size of second array  :  4
  Enter the elements    :  1 2 7 5

  OUTPUT  :

  1 2 3 4 5 7*/

import java.util.*;
public class A86Union {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int i, j;
        int n = s1.nextInt();
        int m = s1.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        int[] c = new int[n + m];
        for (i = 0; i < n; i++) {
            a[i] = s1.nextInt();
            c[i] = a[i];
        }
        for (i = 0; i < m; i++) {
            b[i] = s1.nextInt();
            c[n + i] = b[i];
        }
        Arrays.sort(c);

        int k, len;
        len = c.length;
        for (i = 0; i < len; i++) {
            for (j = i + 1; j < len; j++) {
                if (c[i] == c[j]) {
                    for (k = j; k < len - 1; k++) {
                        c[k] = c[k + 1];
                    }
                    j--;
                    len--;
                }
            }
        }
        for (i = 0; i < len; i++) {
            System.out.print(c[i] + " ");
        }

    }
}
