import java.util.*;
public class SecondFreq {

    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int i,j,k,count=0,max=0,secMax=0,ch=0,ch2=0;
        int n=s1.nextInt();
        int []a=new int[n];
        for(i=0;i<n;i++){
            a[i]=s1.nextInt();
        }
        for(i=0;i<n;i++){
            count=1;
            for(j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    count++;
                    for(k=j;k<n-1;k++){
                        a[k]=a[k+1];
                    }
                    j--;n--;
                }
            }
            if(max<count){
               secMax=max; ch2=ch; max=count;ch=a[i];
            }
            else if(secMax<count&&count!=max){
                secMax=count;ch2=a[i];
            }
        }
        System.out.println("The 2nd frequently occurring number is "+ ch2);
    }

}