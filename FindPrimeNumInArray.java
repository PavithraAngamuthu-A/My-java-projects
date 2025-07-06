/*Write a program to find out and display prime numbers from the given list of integers. The program will accept input in two lines. First-line contains a number indicating the total number of integers in the list and the second line contains integers separated by spaces.
Example 1
Input: 5
       4 6 9 3 7
Output:  3 7
Example 2
Input:  10
        8 10 3 12 7 15 11 2 17 26
Output:  3 7 11 2 17*/
import java.util.*;
public class FindPrimeNumInArray {
    public static boolean prime(int n){
        int i,j,count=0;
        for(i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
       return count==2?true:false;
    }
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int i,j;
        int n=s1.nextInt();
        int []a=new int[n];
        for(i=0;i<n;i++){
            a[i]=s1.nextInt();
        }
        for(i=0;i<n;i++){
            if(prime(a[i])){
                System.out.print(a[i] + " ");
            }
        }
    }
}
