package binaryTreeZigzagLevelOrderTraversal103;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Solution
{
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) 
	{
		List<List<Integer>> list = new ArrayList<>();
		if(root == null)
		{
			return list;
		}
		
		Queue<TreeNode> que = new ArrayDeque<>();
		que.add(root);
		boolean flag = true;
		while(!que.isEmpty())
		{
			
			int size = que.size();
			List<Integer> list2 = new ArrayList<>();
			for(int i=0;i<size;++i)
			{
				TreeNode temp = que.poll();
				if(flag)
				{
					list2.add(temp.val);
				}
				else
				{
					list2.add(0,temp.val);
				}
				if(temp.left != null)
					que.add(temp.left);
				if(temp.right != null)
					que.add(temp.right);
			}
			if(flag)
				flag = false;
			else
				flag = true;
			list.add(list2);
			
		}
		return list;
    }
}
