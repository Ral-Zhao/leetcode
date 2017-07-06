package binaryTreePreorderTraversal144;

import java.util.ArrayList;
import java.util.List;

public class Solution
{
	List<Integer> list = new ArrayList<>();
	public List<Integer> preorderTraversal(TreeNode root) 
	{
		 traverse(root);
		 return list;
	}
	
	private void traverse(TreeNode root)
	{
		if(root != null)
		{
			list.add(root.val);
		}
		else
		{
			return;
		}
		if(root.left != null)
		{
			traverse(root.left);
		}
		if(root.right != null)
		{
			traverse(root.right);
		}
	}
}
