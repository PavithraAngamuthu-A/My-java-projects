/*Evaluate the expression and sort and print the output. Getting the input is the tricky part
Input:
Number of input : 4
2*3
2^2^2
35
3*1
Output:
3*1
2*3
2^2^2
35*/
import java.util.*;
public class EvaluateTheExpression {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int i,j,sum=0,n=4;
        //int n= s1.nextInt();
        String[]str =new String[n];
        for(i=0;i<str.length;i++){
            str[i]=s1.nextLine();
        }
        int []a=new int[n];
        for(i=0;i<n;i++){
            sum=str[i].charAt(0)-48;
            for(j=1;j<str[i].length();j++){
                if(str[i].charAt(j)=='*'){
                    sum *=str[i].charAt(j+1)-48;
                    j+=1;
                }
                else if(str[i].charAt(j)=='^'){
                    sum=(int)Math.pow(sum,str[i].charAt(j+1)-'0');
                    j+=1;
                }
                else {
                   sum=sum*10;
                   sum+=str[i].charAt(j)-48;
                }
            }
            a[i]=sum;
        }
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    a[i]=a[i]+a[j]-(a[j]=a[i]);
                    String m=str[i];
                    str[i]=str[j];
                    str[j]=m;
                }
            }
        }
        for(i=0;i<str.length;i++){
            System.out.println(str[i] + " ");
        }
    }
}
