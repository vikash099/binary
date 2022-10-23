import java.util.*;
public class arraysumtwo {
    public static void main (String args[]) 
    {
        Scanner h= new Scanner(System.in);
        int n=h.nextInt();
        int[] a=new int [n]; 
        int num1=0,num2=0;
        for (int i=0;i<n;i++)
        {
          a[i]=h.nextInt();
          num1=(num1*10)+a[i];
        }
        
        int m=h.nextInt();
        int[] b=new int [m]; 
        for (int i=0;i<m;i++)
        {
          b[i]=h.nextInt();
          num2=(num2*10)+b[i];
        }
        int sum=num1+num2;
        int temp=sum;
        int t=0;
        while(temp>0)
        {
            t++;
            temp=temp/10;
        }
        int[] c=new int [t];
        for(int i=t-1;i>=0;i--)
        {
            c[i]=sum%10;
            sum=sum/10;
        }
        for(int i=0;i<t;i++)
        {
            System.out.print(c[i]+", ");
        }
        System.out.print("END");



    }
}