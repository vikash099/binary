package array;
import java.util.*;

public class Q1 {
	public static void main(String[] args)
	{
		Scanner h = new Scanner(System.in);
		int[] a= {5,4,3,2,7,9};
		int n=h.nextInt();
		System.out.println(Search(a,n));

}
	public static int Search (int[] a,int n)
	{
		int i=0;
		int temp=-1;
		while(i<6)
		{
			if(a[i]==n)
			{
				System.out.println("found");
				temp=0;
				return i;
				
			}
			i++;
		}
		
		return -1;
		
		
	}
}

