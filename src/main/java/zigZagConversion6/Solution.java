package zigZagConversion6;

public class Solution
{
	public String convert(String s, int numRows) 
	{
        if(s.length() <= numRows || numRows == 1)
        {
        	return s;
        }
        
        String result = "";
        for(int i=0;i<numRows;++i)
        {
        	for(int j=i;j<s.length();j=j+2*(numRows-1))
        	{
        		int temp = j+2*(numRows-1)-2*i;
        		if(j % (numRows-1) == 0)
        		{
        			result += s.substring(j,j+1);
        			continue;
        		}
        		if(temp < s.length())
        		{
        			result += s.substring(j,j+1);
        			result += s.substring(temp,temp+1);
        		}
        		else
        		{
        			result += s.substring(j,j+1);
        		}
        		
        	}
        	
        	
        	
        	
        }
        
        
        
        return result;
        
        
        
    }
}
