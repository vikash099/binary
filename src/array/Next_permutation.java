package array;
import java.util.*;
public class Next_permutation {
    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc-- > 0){


           int n=sc.nextInt();
           int arr[]=new int[n];
           for(int i = 0; i < arr.length; i++){
              arr[i] = sc.nextInt();
            }
        
           sol(arr);
           for(int i=0;i<arr.length;i++)
           {
               System.out.print(arr[i]+" ");
           }
            System.out.println();
        }
       
    }

    public static void sol(int [] arr){
    for(int i=arr.length-2;i>=0;i--)
    {
             if(arr[i]<arr[i+1])
        {    int res=search(arr,arr[i],i+1);
        if(res!=-1)
        {
            int temp=arr[i];
            arr[i]=arr[res];
            arr[res]=temp;
            reverse(arr,i+1,res);
        
              return ;
        }
}
    }
    reverse(arr,0,arr.length-1);
     return;
    }
    public static void reverse(int arr[],int strt,int end)
    {
        while(strt<end)
        {
            int temp=arr[strt];
            arr[strt]=arr[end];
            arr[end]=temp;
            strt++;
           end--;
        }
    }
    public static int search(int arr[],int val,int idx)
    {
        int diff=Integer.MAX_VALUE;
        int ans=-1;
        for(int i=idx;i<arr.length;i++)
        {
            if(arr[idx]>val)
            {
                int rem=arr[idx]-val;
                if(rem<diff)
                {
                    diff=rem;
                    ans=i;
                }
            }
        }
        return ans;
    }
}
		
	