package array;

public class rotatearray {
	public void rotate(int[] arr, int k) {
        int i=0;
        while(i<k)
        {
            for(int j=1;j<arr.length;j++)
            {
                int temp=arr[j];
                arr[j]=arr[0];
                arr[0]=temp;
            }
            i++;
        }
            
        }

}
