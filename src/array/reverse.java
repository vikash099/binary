package array;

public class reverse {
	public static void main(String[] args)
	{
	//	Scanner h = new Scanner(System.in);
		int[] a= {5,4,3,2,7,9};
		int i=0;
		int temp;
		while(i<6/2)
		{
			temp=a[i];
			a[i]=a[5-i];
			a[5-i]=temp;
		}

}
}

