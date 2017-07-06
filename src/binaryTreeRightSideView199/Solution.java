package binaryTreeRightSideView199;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Solution
{
	public List<Integer> rightSideView(TreeNode root) 
	{
		List<Integer> list = new ArrayList<>();
		if(root == null)
		{
			return list;
		}
		
		Queue<TreeNode> que = new ArrayDeque<>();
		que.add(root);
		while(!que.isEmpty())
		{
			
			int size = que.size();
			for(int i=1;i<=size;++i)
			{
				TreeNode temp = que.poll();
				if(i == size)
				{
					list.add(temp.val);
				}
				if(temp.left != null)
					que.add(temp.left);
				if(temp.right != null)
					que.add(temp.right);
			}
		}
		
		return list;
    }
}
