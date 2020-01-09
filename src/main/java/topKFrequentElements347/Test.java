package topKFrequentElements347;

import java.util.List;

public class Test
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		int[] arr = new int[]{1,2,1,2,1,3,3,4,4,4,5,6,7};
		List<Integer> list = s.topKFrequent(arr,4);
		for(Integer num : list)
		{
			System.out.println(num);
		}
	}
}
