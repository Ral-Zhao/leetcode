package findAllDuplicatesinanArray442;

import java.util.List;

public class Test
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		int[] nums = new int[]{4,3,2,7,8,1,2,3};
		List<Integer> list = s.findDuplicates(nums);
		for(int e : list)
		{
			System.out.println(e);
		}
	}
}
