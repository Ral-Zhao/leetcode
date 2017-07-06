package mostFrequentSubtreeSum508;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution
{
	private List<Integer> list = new ArrayList<>();
	public int[] findFrequentTreeSum(TreeNode root) 
	{
		
		if(root == null)
		{
			return new int[]{};
		}
		
		search(root);
		
		Map<Integer,Integer> map = new HashMap<>();
		
		int max = 0;
		for(int i=0;i<list.size();++i)
		{
			int temp = list.get(i);
			if(map.get(temp) != null)
			{
				map.put(temp,map.get(temp)+1);
			}
			else
			{
				map.put(temp,1);
			}
			if(map.get(temp) > max)
			{
				max = map.get(temp);
			}
		}
		list = new ArrayList<>();
		Set<Integer> set = map.keySet();
		for(int e : set)
		{
			if(map.get(e) == max)
			{
				list.add(e);
			}
		}
		int[] result = new int[list.size()];

		for(int i=0;i<list.size();++i)
		{
			result[i] = list.get(i);
		}
		return result;
    }
	
	public int search(TreeNode root)
	{
		if(root.left == null && root.right == null)
		{
			list.add(root.val);
			return root.val;
		}
		int sum = root.val;
		if(root.left != null)
		{
			 sum += search(root.left);
		}
		if(root.right != null)
		{
			sum += search(root.right);
		}
		list.add(sum);
		return sum;
		
		
	}
	
	
}
