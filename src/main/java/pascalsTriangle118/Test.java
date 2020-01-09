package pascalsTriangle118;

import java.util.List;

public class Test
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		List<List<Integer>> list = s.generate(5);
		for(List<Integer> list2 : list)
		{
			System.out.println("[");
			for(Integer list3 : list2)
			{
				System.out.println(list3);
			}
			System.out.println("]");
		}
	}
}
