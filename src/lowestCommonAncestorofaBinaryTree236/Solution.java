package lowestCommonAncestorofaBinaryTree236;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution
{
	 public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q)
	 {
		 if(root == null)
		 {
			 return null;
		 }
		 if(q == root || p == root)
		 {
			 return root;
		 }
	 	Stack<TreeNode> stack = new Stack<>();
		List<TreeNode> visit = new ArrayList<>();
		List<TreeNode> listP = new ArrayList<>();
		List<TreeNode> listQ = new ArrayList<>();
		TreeNode temp = root;
		while(temp != null)
		{
			stack.add(temp);
			temp = temp.left;
		}
		while(!stack.isEmpty())
		{
			TreeNode cur = stack.peek();

			if(cur.right != null)
			{
				if(visit.contains(cur.right))
				{
					
					if(cur == p)
					{
						listP.addAll(stack);
					}
					if(cur == q)
					{
						listQ.addAll(stack);
					}
					if(!listP.isEmpty() && !listQ.isEmpty())
						break;
					cur = stack.pop();
				}
				else
				{
					cur = cur.right;
					visit.add(cur);
					while(cur != null)
					{
						stack.push(cur);
						cur = cur.left;
					}
				}
				
			}
			else
			{
				
				if(cur == p)
				{
					listP.addAll(stack);
				}
				if(cur == q)
				{
					listQ.addAll(stack);
				}
				if(!listP.isEmpty() && !listQ.isEmpty())
					break;
				cur = stack.pop();
			}
			
		}
		TreeNode result = root;
		for(int i=listQ.size()-1;i>=0;--i)
		{
			if(listP.contains(listQ.get(i)))
			{
				result = listQ.get(i);
				break;
			}
		}
		return result;
	 }
}
