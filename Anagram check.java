import java.util.*;
public class Anagram {
    public static char[] toLower(String a) {
        char[] res = new char[a.length()];
        int i, j;
        for (i = 0; i < a.length(); i++) {
            char b = a.charAt(i);
            if ('A' <= b && b <= 'Z') {
                res[i] = (char) (b + 32);
            } else {
                res[i] = b;
            }
        }
        return res;
    }
    public static char[] sort(char[] a) {
        int i, j;
        for (i = 0; i < a.length; i++) {
            for (j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    a[i] = (char) (a[i] + a[j] - (a[j] = a[i]));
                }
            }
        }
        return a;
    }
    public static boolean isEquals(char[] a, char[] b) {
        int i,j;
        if(a.length!=b.length){
            return false;
        }
        for(i=0;i<a.length;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int i, k;
        int n = s1.nextInt();
        String[] a = new String[n];
        for (k = 0; k < n; k++) {
            a[k] = s1.next();
        }
        String b = s1.next();
        char[] sortB = (sort(toLower(b)));
        System.out.println("Output: ");
        int found=0;
        for (i = 0; i < n; i++) {
            String str = a[i];
            char[] sorted = (sort(toLower(str)));
            if (isEquals(sortB,sorted)) {
                found=1;
                System.out.println(a[i]);
            }
        }
        if(found==0){
            System.out.println("No match");
        }
    }
}


