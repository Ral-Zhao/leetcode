package firstBadVersion278;

public class VersionControl
{
	public int[] arr = new int[]{0,0,0,0};
	
	public boolean isBadVersion(int n)
	{
		if(arr[n-1] == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
