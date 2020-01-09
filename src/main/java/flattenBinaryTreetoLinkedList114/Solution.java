package flattenBinaryTreetoLinkedList114;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution
{
	public void flatten(TreeNode root) 
	{
		if(root == null)
			return;
		if(root.left == null && root.right == null)
			return;
		Stack<TreeNode> stack = new Stack<>();
		List<TreeNode> list = new ArrayList<>();
		TreeNode temp = root;
		while(temp != null)
		{
			stack.push(temp);
			list.add(temp);
			temp = temp.left;
		}
		
		while(!stack.isEmpty())
		{
			temp = stack.pop();
			temp = temp.right;
			while(temp != null)
			{
				stack.push(temp);
				list.add(temp);
				temp = temp.left;
				
			}
		}
		for(int i=0;i<list.size()-1;++i)
		{
			temp = list.get(i);
			temp.left = null;
			temp.right = list.get(i+1);
		}
    }
}
