package array2D;
import java.util.*;
public class first {
	public static void main(String[] args)
	{
		Scanner h=new Scanner(System.in);
		int n=h.nextInt();
		int m=h.nextInt();
		int [][] a=new int[n][m];
		for (int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++) {
				a[i][j]=h.nextInt();
			}
		}
		int k=0;
		for(int i=0;i<a[0].length;i++)
		{
			if(i%2==0)
				k=0;
			else
				k=a.length-1;
			while(k>=0&&k<=a.length-1)
			{
				System.out.print(a[k][i]);
				if(i%2==0)
					k++;
				else
					k--;
			}
			
		}
	}

}
