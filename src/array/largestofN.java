package array;
import java.util.*;

public class largestofN {
	public static void main(String[]args)
	{
		Scanner h=new Scanner(System.in);
		int n=h.nextInt();
//		int x=(int) Math.sqrt(n);
//		System.out.println(x);
		int temp=1;
		int start=1;
		int last=n;
		int i;
		int mid=(start+last)/2;
		int ans=0;
		for( i=1;start<=last;i++)
		{
			mid=(start+last)/2;
			if((mid*mid)<=n)
			{
				ans=mid;
				start=mid+1;
			}
			else 
			{
				last=mid-1;
			}
			
			
		}
		
			System.out.println(ans);
		
		
	}

}
