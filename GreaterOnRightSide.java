/*Greater on right side
You are given an array Arr of size N. Replace every element with the next greatest element (greatest element on its right side) in the array. Also, since there is no element next to the last element, replace it with -1.
Input:
N = 6
Arr[] = {16, 17, 4, 3, 5, 2}
Output:
17 5 5 5 2 -1
Explanation: For 16 the greatest element 
on its right is 17. For 17 it's 5. 
For 4 it's 5. For 3 it's 5. For 5 it's 2. 
For 2 it's -1(no element to its right). 
So the answer is 17 5 5 5 2 -1*/

import java.util.*;
public class GreaterOnRightSide {

    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int i,j,max;
        int n=s1.nextInt();
        int []a=new int[n];
        for(i=0;i<n;i++){
            a[i]=s1.nextInt();
        }
        for(i=0;i<n;i++){
            max=-1;
            for(j=i+1;j<n;j++){
                if(a[j]>max){
                    max=a[j];
                }
            }
            System.out.print(max + " ");
        }
    }
}


