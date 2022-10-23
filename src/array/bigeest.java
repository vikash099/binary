package array;
//import java.util.*;
public class bigeest {
	public static void main(String[] args)
	{
	//	Scanner h = new Scanner(System.in);
		int[] a= {5,4,3,2,7,9};
//		int n=h.nextInt();
		System.out.println(Bigg(a));
		System.out.println(Min(a));

}
	
	public static int Bigg (int[] a)
	{
		int i=0;
		
		int temp= Integer.MIN_VALUE;
		while(i<5)
		{
			temp=Math.max(a[i+1], temp);
			i++;
		}
		return temp;
		
		
		
		
	}
	public static int Min (int[] a)
	{
		int i=0;
		
		int temp=a[i];
		while(i<5)
		{
			if(temp>a[i+1])
			{
				
				temp=a[i+1];
			}
			i++;
		}
		return temp;
		
		
		
		
	}
}


