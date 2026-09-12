import java.util.*;
public class div1{
    public static void isdivisible(int n ,int m){
        int i=0;
        int sum=0;
        for(i=n;i<m;i++){
            if((i%3==0)&&(i%5==0)){
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the starting point:");
        int n=sc.nextInt();
        System.out.println("enter the ending point:");
        int m=sc.nextInt();
         isdivisible(n,m);
    }
}