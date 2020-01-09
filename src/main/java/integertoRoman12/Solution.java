package integertoRoman12;

public class Solution
{
	public String intToRoman(int num) 
	{
		String[][] arr = new String[][]
		{
			{"I","II","III","IV","V","VI","VII","VIII","IX"},
			{"X","XX","XXX","XL","L","LX","LXX","LXXX","XC"},
			{"C","CC","CCC","CD","D","DC","DCC","DCCC","CM"},
			{"M","MM","MMM",}
		};
		StringBuffer str = new StringBuffer();
		int fac = 1000;
		int index = 3;
		int mod = 1;
		int sub = num;
		while(mod != 0)
		{
			mod = num % fac;
			sub = num / fac;
			if(sub == 0)
			{
				fac /= 10;
				index -= 1;
				continue;
			}
			fac /= 10;
			str.append(arr[index][sub-1]);
			index -= 1;
			num = mod;
			
		}
		
		return str.toString();
    }
}
