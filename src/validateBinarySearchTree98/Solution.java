package validateBinarySearchTree98;

import java.util.Stack;


public class Solution
{
	public boolean isValidBST(TreeNode root) 
	{
		if(root == null)
		{
			return true;
		}
		Stack<TreeNode> stack = new Stack<>();
		TreeNode temp = root;
		while(temp != null)
		{
			stack.add(temp);
			temp = temp.left;
		}
		TreeNode pre = null;
		
		while(!stack.isEmpty())
		{
			temp = stack.pop();
			if(pre != null && temp.val < pre.val)
				return false;
			else
				pre = temp;
			if(temp.right != null)
			{
				temp = temp.right;
				while(temp != null)
				{
					stack.add(temp);
					temp = temp.left;
				}
			}
		}
		return true;
    }
}
