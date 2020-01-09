package findAllNumbersDisappearedinanArray448;

import java.util.List;

public class Test
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		int[] arr = new int[]{4,3,2,7,8,2,3,1};
		List<Integer> list = s.findDisappearedNumbers(arr);
		for(int e : list)
		{
			System.out.println(e);
		}
	}
}
