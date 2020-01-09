package reverseInteger7;

public class Solution
{
	 public int reverse(int x)
	 {
		 
		 long result = 0;
		 int sub = x / 10;
		 int mod = x % 10;
		 while(sub != 0)
		 {
			
			 result = result * 10 + mod;
			 mod = sub % 10;
			 sub = sub / 10;
			
			 
		 }
		 result = result * 10 + mod;
		 
		 if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
		 {
			 return 0;
		 }
		 else
		 {
			 return (int)result;
		 }
	 }
}
