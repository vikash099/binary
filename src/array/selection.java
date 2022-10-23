package array;

public class selection {
	public static void main(String[] args)
	{
		int[] arr= {5,3,2,8,9};
		selecSort(arr,5);
		int i;
		for(i=0;i<5;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static void selecSort(int [] arr,int n)
	{
		int i,j,temp,small;
		int pos;
		for(i=0;i<n;i++)
		{
			pos=i;
			small=arr[i];
			for(j=i;j<n-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					small=arr[j+1];
					pos=j+1;
				}
			}
			temp=arr[i];
			arr[i]=small;
			arr[pos]=temp;
		}
	}

}
