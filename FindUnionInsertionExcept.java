/*Find the union intersection of two list and also find except (remove even elements from list1 and odd elements from list2) Input
List 1: 1,3,4,5,6,8,9
List 2: 1, 5,8,9,2
Union: 1, 3,4,5,6,8,9,2
Intersection: 1,5,8,9
Except: 1, 3, 5,9,8,2 */

import java.util.*;
public class FindUnionInsertionExcept {
    public static void Union(int n,int []c){
        int i,j,k,p=0;
        int[]d=new int[10];
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(c[i]==c[j]){
                    d[p++]=c[j];
                    for(k=j;k<n-1;k++){
                        c[k]=c[k+1];
                    }
                    n--;j--;
                }
            }
        }
        for(i=0;i<n;i++){
            System.out.print(c[i] + " ");
        }
        System.out.println();
        for(i=0;i<p;i++){
            System.out.print(d[i] + " ");
        }

    }
    public static void main(String[] args) {
        Scanner s1= new Scanner(System.in);
        int i,j,k=0;
        int n= s1.nextInt();
        int m=s1.nextInt();
        int []a=new int[n];
        int []b=new int[m];
        int []c=new int [n+m];
        for(i=0;i<n;i++){
            a[i]=s1.nextInt();
            c[k++]=a[i];
        }
        for(i=0;i<m;i++){
            b[i]=s1.nextInt();
            c[k++]=b[i];
        }
        Union(k,c);
        System.out.println();
        for(i=0;i<n;i++){
            if(a[i]%2!=0){
                System.out.print(a[i] + " ");
            }
        }
        for(i=0;i<m;i++){
            if(b[i]%2==0){
                System.out.print(b[i] + " ");
            }
        }
    }
}
