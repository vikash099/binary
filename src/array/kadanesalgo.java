package array;

public class kadanesalgo {
	public static void main(String [] args)
	{
		int a[]= {1,6,-5,-7,4,-2,11};
		int ans=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<7;i++)
		{
			sum=sum+a[i];
			ans=Math.max(sum, ans);
			if(sum<0)
				sum=0;
		}
		System.out.println(ans);
		
	}

}
