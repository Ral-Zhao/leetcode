package validAnagram;

public class Test
{
	public static void main(String[] args) throws Exception
	{
		Solution s = new Solution();
		String str = "hello";
		String t = "leloh";
		
		System.out.println(s.isAnagram(str, t));
				
	}
}
