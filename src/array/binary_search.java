package array;
import java.util.*;

public class binary_search {
	public static void main(String[] args)
	{
		Scanner h=new Scanner(System.in);
		int a[]= {2,3,4,5,7,8,9	};
		int start=0,last=7;
		int mid=(start+last)/2;
		int n=h.nextInt();
		int temp=0;
		for(int i=0;start<last;i++ )
		{
			if(a[mid]==n)
			{
				temp=1;
				System.out.println("found");
				break;
			}
			else if(n<a[mid])
			{
				last=mid;
			}
			else {
				start=mid;
			     }
			mid=(start+last)/2;
		 }
		if(temp==0)
		{
			System.out.println("not found");
		}
			
		}

}
