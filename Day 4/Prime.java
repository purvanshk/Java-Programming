import java.util.*;
public class Prime {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number ");
        int n=sc.nextInt();
        int count=0;
        if(n<2)
        System.out.println("its not a prime number ");
        else
        {for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            count++;
        }}
        if(count>2)
        System.out.println("its a prime number ");
        else 
        System.out.println("its not a prime number ");

    }
}