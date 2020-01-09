package guessNumberHigherorLower374;

public class GuessGame
{
	private int value;
	
	public GuessGame(int value)
	{
		this.value = value;
	}
	
	public int guess(int num)
	{
		if(num > value)
		{
			return -1;
		}
		else if(num < value)
		{
			return 1;
		}
		else
		{
			return 0;
		}
		
	}
}
