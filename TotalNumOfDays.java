/*Given two dates, find total number of days between them.

        Input: dt1 = {10, 2, 2014} dt2 = {10, 3, 2015}
Output: 393
dt1 represents “10-Feb-2014” and dt2 represents “10-Mar-2015” The difference is 365 + 28
Input: dt1 = {10, 2, 2000} dt2 = {10, 3, 2000}
Output: 29
Note that 2000 is a leap year
Input: dt1 = {10, 2, 2000} dt2 = {10, 2, 2000}
Output: 0
Both dates are same
Input: dt1 = {1, 2, 2000}; dt2 = {1, 2, 2004};
Output: 1461
Number of days is 365*4 + 1*/
public class TotalNumOfDays{
    static class Date{
        int d,m,y;
        public Date(int d,int m,int y){
            this.d=d;
            this.m=m;
            this.y=y;
        }
    }
    static int monthDays[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static int countLeapYear(Date d1){
        int y=d1.y;
        if(d1.m<=2)
            y--;
        return  y/4 - y/100 + y/400 ;
    }
    static int findDiff(Date d1) {
        int n1 = d1.d+d1.y*365;

        for (int i = 0; i < d1.m - 1; i++) {
            n1 += monthDays[i];
        }

        n1 += countLeapYear(d1);
        return n1;
    }
    static int printDifference(Date d2, Date d1) {
        return Math.abs(findDiff(d2) - findDiff(d1));
    }
    public static void main(String []args){
        Date d1=new Date(10,2,2000);
        Date d2=new Date(10,3,2000);
        System.out.println(printDifference(d2,d1));

    }
}