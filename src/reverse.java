import java.util.*;
public class reverse {
	
	
	    public static void main(String args[])
	    {
	        Scanner h=new Scanner(System.in);
	        int n=h.nextInt();
	        int []a=new int[n];
	        for(int i=0;i<n;i++)
	        {
	        a[i]=h.nextInt();
	        }
	        for(int i=n-1;i>=0;i--)
	        {
	            System.out.print(a[i]+" ");
	        }

	    }
	}


