package pathSumIII437;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Solution
{
	private int count = 0;
	public int pathSum(TreeNode root, int sum) 
	{
		if(root == null)
		{
			return 0;
		}
		Queue<TreeNode> que = new ArrayDeque<>();
		que.add(root);
		while(!que.isEmpty())
		{
			TreeNode node = que.poll();
			Stack<TreeNode> stack = new Stack<>();
			List<TreeNode> visit = new ArrayList<>();
			int sums = 0;
			TreeNode temp = node;
			while(temp != null)
			{
				stack.push(temp);
				sums += temp.val;
				
				temp = temp.left;
			}
			while(!stack.isEmpty())
			{
				TreeNode cur = stack.peek();

				if(cur.right != null)
				{
					if(visit.contains(cur.right))
					{
						cur = stack.pop();
						if(sums == sum)
						{
							count += 1;
						}
						sums = sums - cur.val;
					}
					else
					{
						cur = cur.right;
						visit.add(cur);
						while(cur != null)
						{
							stack.push(cur);
							sums += cur.val;
							cur = cur.left;
							
						}
					}
					
				}
				else
				{
					cur = stack.pop();
					if(sums == sum)
					{
						count += 1;
					}
					sums = sums - cur.val;
				}
				
			}
			if(node.left != null)
			{
				que.add(node.left);
			}
			if(node.right != null)
			{
				que.add(node.right);
			}
			
		}
		
		
        return count;
    }
}
