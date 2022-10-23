package array;

public class maxsumofsubarr {
	public static void main(String[] args)
	{
		int a[]= {1,6,-5,-7,4,-2,11};
		int largest=Integer.MIN_VALUE;
		for(int i=0;i<7;i++)
		{
			int sum=0;
			for(int j=i;j<7;j++)
			{
				sum=sum+a[j];
				if(sum>largest)
				{
					largest=sum;
				}
			}
			
		}
		System.out.println(largest);
	}

}
