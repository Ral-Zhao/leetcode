package pathSumII113;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution
{
	public List<List<Integer>> pathSum(TreeNode root, int sum) 
	{
		List<List<Integer>> list = new ArrayList<>();
		if(root == null)
			return list;
		int cur = 0;
		TreeNode temp = root;
		Stack<TreeNode> stack = new Stack<>();
		Stack<Integer> stack2 = new Stack<>();
		List<TreeNode> visit = new ArrayList<>();
		while(temp != null)
		{
			stack.push(temp);
			stack2.push(temp.val);
			cur += temp.val;
			temp = temp.left;
		}
		
		while(!stack.isEmpty())
		{
			temp = stack.peek();
			if(temp.right == null)
			{
				
				if(temp.left == null && cur == sum)
				{
					List<Integer> temps = new ArrayList<>();
					temps.addAll(stack2);
					list.add(temps);
				}
				cur = cur - stack2.pop();
				stack.pop();
			}
			else if(temp.right != null)
			{
				if(visit.contains(temp.right))
				{
					stack.pop();
					cur -= stack2.pop();
					continue;
				}
				temp = temp.right;
				visit.add(temp);
				while(temp != null)
				{
					stack.push(temp);
					stack2.push(temp.val);
					cur += temp.val;
					temp = temp.left;
				}
			}
		}
		return list;
    }
}
