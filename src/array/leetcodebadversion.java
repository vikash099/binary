package array;


/* The isBadVersion API is defined in the parent class VersionControl.
boolean isBadVersion(int version); */

public class leetcodebadversion {
public int firstBadVersion(int n){
  int start=1;
  int last=n;
  int mid;
  int ans=0;
  
  
  for(int i=1;start<=last;i++ )
  {
      mid=(last-start)/2+start;
      if(isBadVersion(mid)==true)
      {
          ans=mid;
          last=mid-1;
      }
      else
      {
          start=mid+1;
      }
      
  }
  return ans;
  
}
}
