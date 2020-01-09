package combinationSumIII216;

import java.util.List;

public class Test
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		List<List<Integer>> list = s.combinationSum3(3,9);
		for(List<Integer> l : list)
		{
			for(int i : l)
			{
				System.out.print(i + ",");
			}
			System.out.println();
		}
	}
}
