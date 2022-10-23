package array;
import java.util.*;

public class maj_element {
	
	    public static void main (String args[]) 
	    {
	        Scanner h = new Scanner(System.in);
	        int size=h.nextInt();
	        int[] a=new int[size];
	        for(int i=0;i<size;i++)
	        {
	        	a[i]=h.nextInt();
	        }
	        sort(a,size);
	        float half= (float)size/2;
	        System.out.println("half"+half);
	        int element=a[0];
	        int count=0;
	        int lar=1;
	        int maj=a[0];
	        for(int i=0;i<size;i++)
	        {
	            if(element==a[i])
	            {    
	                count++;
	            }
	            else{
	                element=a[i];
	                count=0;
	                }
	            if(lar<count)
	            {
	                lar=count;
	               maj= a[i];
	            }    

	        }
	        if(half<lar)
	        {
	            System.out.println(maj);
	        }



	    }
	    public static void sort(int [] a,int size)
	    {
	        int i ,j,temp;
			for(i=0;i<size;i++)
			{
				for(j=0;j<size-i-1;j++)
				{
					if(a[j]>a[j+1])
					{
						temp=a[j+1];
						a[j+1]=a[j];
						a[j]=temp;
					}
				}
			}

	    }
	}


