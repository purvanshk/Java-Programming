import java.util.*;
import java.math.*;

public class Armstrong {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp,rem,rev=0,p=0;
        String s=String.valueOf(n);
        String st=s;
        int len=st.length();
    //     temp=n;
    //     for (;temp != 0; temp /= 10) {
    //         p++;
    //    }
       temp=n;
        while(temp!=0)
        {
            rem=temp%10;
            rev+=Math.pow(rem,len);
            temp/=10;
        }
        if(n==rev)
        System.out.println("its a Arnstrong number ");
        else 
        System.out.println("its not a arnstrong number");

    }
}
