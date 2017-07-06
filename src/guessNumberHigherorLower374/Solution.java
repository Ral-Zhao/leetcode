package guessNumberHigherorLower374;

public class Solution extends GuessGame
{
	public Solution(int value)
	{
		super(value);
	}
	
	public int guessNumber(int n) {
		int min = 1;
        int max = n;
	
		int mid = 0;
        while(min <= max)
        {
        	mid = min + (max-min) / 2;
        	if(guess(mid) == 0)
        	{
        		break;
        	}
        	else if(guess(mid) == 1)
        	{
        		min = mid+1;
        	}
        	else
        	{
        		max = mid-1;
        	}
        	
        	
        }
        
		
        return mid;
        
    }
}
