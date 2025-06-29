import java.util.Scanner;

public class CircularQueue {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int i,j,count=0,flag=0,end=0;
        int n = s1.nextInt();
        int[] a = new int[n];
        for (i = 0; i <n; i++) {
            a[i] = s1.nextInt();
        }
        int gap = s1.nextInt();
        i = 0;
        while (i < n) {
            for (j = i; j <n; j++) {
                if (a[j] != 0) {
                    count++;
                    if(flag==n-1){
                        System.out.println(a[j]);end=1;
                    }
                    if (count == gap + 1) {
                        a[j] = 0;
                        count = 0;
                        flag++;
                    }
                    if(end==1){
                        break;
                    }
                }
            }
            if(end==1){
                break;
            }
            i = 0;
        }
    }
}
