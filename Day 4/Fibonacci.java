import java.util.*;
public class Fibonacci {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the nth term");
        int n=sc.nextInt();
        int a=0,b=1;
        System.out.print(a+" "+b+" ");
        int next;
        for (int i =2; i <=n; i++) {
            next=a+b;
            a=b;
            b=next;
            System.out.print(next+" ");
            
        }



    }
}
