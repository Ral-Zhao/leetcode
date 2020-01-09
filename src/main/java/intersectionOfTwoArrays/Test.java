package intersectionOfTwoArrays;

public class Test
{
	public static void main(String[] args)
	{
		int[] s1 = new int[]{1, 2, 2, 3};
		int[] s2 = new int[]{2, 2, 3};
		
		Solution s = new Solution();
		int[] s3 =s.intersection(s1,s2);
		
		for(int i=0;i<s3.length;++i)
		{
			System.out.println(s3[i]);
		}
		
	}
}
