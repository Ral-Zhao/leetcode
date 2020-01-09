package countandSay38;

public class Solution
{
	 public String countAndSay(int n) 
	 {
		 String str = "1";
		 String result = "";
		 
		 while(n-1 != 0)
		 {
			 int sum = 0;
			 for(int i=0;i<str.length();++i)
			 {
				 sum += 1;
				 if(i == str.length()-1)
				 {
					 result = result + sum + str.substring(i,i+1);
				 }
				 else
				 {
					 if(i != str.length()-1 && str.charAt(i) != str.charAt(i+1))
					 {
						 result = result + sum + str.substring(i,i+1);
						 sum = 0;
					 }
				 }
				 
				 
			 }
			 str = result;
			 result = "";
			 n -= 1;
		 }
	      
		 return str;
	 }
}
