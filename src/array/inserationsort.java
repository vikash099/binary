package array;

public class inserationsort {
	public static void main(String[] args)
	{
		int[] arr= {5,3,2,8,9};
		insertion(arr,5);
		int i;
		for(i=0;i<5;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static void insertion(int[] arr,int n)
	{
		int i,j,temp;
		for(i=1;i<n;i++)
		{
			temp=arr[i];
			j=i-1;
			while(j>=0 && arr[j]>temp)
			{
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=temp;
			
		}
	}

}
