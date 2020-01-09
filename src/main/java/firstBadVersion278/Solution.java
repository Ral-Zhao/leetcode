package firstBadVersion278;

public class Solution extends VersionControl
{
	public int firstBadVersion(int n) 
	{
        int start = 1;
        int end = n;
        int mid = 1;
        while(end >= start)
        {
        	if(end == start)
        	{
        		return start;
        	}
        	mid = start + (end - start) / 2;
        	if(!isBadVersion(mid))
        	{
    			start = mid+1;
    			continue;
        	
        	}
        	else
        	{
    			end = mid;
    			continue;
        		
        	}
        	
        }
        
        return mid;
    }
}
