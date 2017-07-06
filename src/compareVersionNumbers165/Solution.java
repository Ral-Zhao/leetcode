package compareVersionNumbers165;

public class Solution
{
	public int compareVersion(String version1, String version2) 
	{
		String[] ver1 = version1.split("[^0-9]");
		String[] ver2 = version2.split("[^0-9]");
		
		int min = Math.abs(ver1.length-ver2.length);
	
		if(ver1.length > ver2.length)
		{
			for(int i=0;i<min;++i)
			{
				version2 = version2 + ".0";
			}
			ver2 = version2.split("[^0-9]");
			
		}
		else
		{
			for(int i=0;i<min;++i)
			{
				version1 = version1 + ".0";
			
			}
			ver1 = version1.split("[^0-9]");
		}
		
		
		
		
		for(int i=0;i<ver1.length;++i)
		{
			int vers1 = Integer.parseInt(ver1[i]);
			int vers2 = Integer.parseInt(ver2[i]);
			
			if(vers1 > vers2)
			{
				return 1;
			}
			if(vers1 < vers2)
			{
				return -1;
			}
		}
		
		
			return 0;
		
		
		
    }
}
