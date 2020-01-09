package findLargestValueinEachTreeRow515;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Solution
{
	public List<Integer> largestValues(TreeNode root) 
	{
		List<Integer> list = new ArrayList<>();
		Queue<TreeNode> que = new ArrayDeque<>();
		if(root == null)
		{
			return list;
		}
		que.add(root);
		while(!que.isEmpty())
		{
			int size = que.size();
			for (int i=0;i<size;++i)
			{
				
				TreeNode temp = que.poll();
				if(i == 0)
				{
					list.add(temp.val);
				}
				if(temp.val > list.get(list.size()-1))
				{
					list.set(list.size()-1,temp.val);
				}
				if(temp.left != null)
				{
					que.add(temp.left);
				}
				if(temp.right != null)
				{
					que.add(temp.right);
				}
			}
			
			
		}
		return list;
    }
}
