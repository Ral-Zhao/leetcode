package nimGame;

public class Solution
{
	  public boolean canWinNim(int n) 
	  {
		  
//		  boolean b = false;
		  
		  
//		  for(int i=1;i<=3;++i)
//		  {
//			  if (canWinNim(n-i) == false)
//			  {
//				  
//				  b = true;
//				  break;
//			  }
//			  
//		  }
//		  
//		  return b;
		  
		  if(n <= 3)
		  {
			  return true;
		  }
		  
		  if (n % 4 ==0)
		  {
			  return false; 
		  }
		  else
		  {
			  return true;
		  }
		  
	  }
}
