package binaryTreePaths257;

import java.util.ArrayList;
import java.util.List;

public class Solution
{
	private List<Integer> list = new ArrayList<>();
	private List<String> list2 = new ArrayList<>();
	public List<String> binaryTreePaths(TreeNode root) 
	{
		path(root);
		return list2;
    }
	
	public void path(TreeNode root)
	{
		if(root == null)
		{
			return;
		}
		
		if(root.left == null && root.right == null)
		{
			String str = "";
			for(Integer num : list)
			{
				str = str + num + "->";
			}
			str = str + root.val + "";
			list2.add(str);
			return;
		}
		else
		{
			list.add(root.val);
		}
		
		path(root.left);
		path(root.right);
		list.remove(list.size()-1);
	}
}
