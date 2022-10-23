package array;
import java.util.*;

import java.util.Scanner;

public class rotateopti {
	public static void main(String[]args)
	{    int[] arr= {5,3,2,8,9,1};
	Scanner h=new Scanner(System.in);
	int l=5;
	int n=2;
	     
		 rotate(arr,4,l);
		 rotate(arr,0,3);
		 rotate(arr,0,l);
		 
//		 rotate(arr,0,2);
//		 rotate(arr,l-2,l);
		 
//		 rotate(arr,0,n);
//		 rotate(arr,l-r,l);
		 
		 int i;
		 for(i=0;i<=l;i++)
			{
				System.out.print(arr[i]+"\t");
			}
	}
	public static void rotate(int []a,int r,int l)
	{
		int temp,i=0;

		while(r<=(r+l)/2)
		{
			temp=a[r];
			a[r]=a[l-r];
			a[l-r]=temp;
			r++;
		}
	}

}
