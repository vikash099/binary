package array;
import java.util.*;
public class bubblesort {
	public static void main(String[] args)
	{
		Scanner h=new Scanner(System.in);
		System.out.println("enter the array size ");
		int n=5;
		int j;
//		int []a=new int[n];
		int [] arr= {2,4,1,7,8};
//		for( j=0;j<n;j++);
//		{
//			a[j]=h.nextInt();
//		}
		bubblesort(arr,n);
		int i;
		for(i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static void bubblesort(int[] arr,int n)
	{
		int i ,j,temp;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		
	}

}
