package array;

public class call_by_value {
	public static void main(String[]args)
	{
		int [] arr = {10,20,30,40,50};
		int [] other= {100,200,300,400,500};
		Swap(arr,other);
	}
	public static void Swap(int[] arr,int[] other)
	{
		int [] temp=arr;
		arr= other;
		other=temp;
	}

}
