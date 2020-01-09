package minimumTimeDifference539;

import java.util.ArrayList;
import java.util.List;

public class Test
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		List<String> list = new ArrayList<>();
		list.add("14:49");
		list.add("09:56");
//		list.add("03:55");
		list.add("01:02");
		System.out.println(s.findMinDifference(list));
	}
}
