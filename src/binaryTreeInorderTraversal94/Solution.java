package binaryTreeInorderTraversal94;

import java.util.ArrayList;
import java.util.List;

public class Solution
{
	private List<Integer> list = new ArrayList<>();
	public List<Integer> inorderTraversal(TreeNode root) 
	{
		traverse(root);
		return list;
    }
	
	public void traverse(TreeNode root)
	{
		if(root == null)
		{
			return;
		}
		if(root.left != null)
			traverse(root.left);
		
			list.add(root.val);
		
		if(root.right != null)
			traverse(root.right);
		
	}
}
