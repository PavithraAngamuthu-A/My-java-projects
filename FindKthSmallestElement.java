/*Given an array arr[] and an integer k where k is smaller than the size of the array, your task is to find the kth smallest element in the given array.

Follow up: Don't solve it using the inbuilt sort function.

Examples :

Input: arr[] = [7, 10, 4, 3, 20, 15], k = 3
Output: 7
Explanation: 3rd smallest element in the given array is 7.

Input: arr[] = [2, 3, 1, 20, 15], k = 4
Output: 15
Explanation: 4th smallest element in the given array is 15.*/

import java.util.*;
public class FindKthSmallestElement {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int i,j;
        int n=s1.nextInt();
        int k= s1.nextInt();
        int []a =new int[n];
        for(i=0;i<n;i++){
            a[i]=s1.nextInt();
        }
        for(i=0;i<n;i++) {
            for (j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    a[i] = a[i] + a[j] - (a[j] = a[i]);
                }
            }
        }
        System.out.println(a[(k-1)]);
    }
}
