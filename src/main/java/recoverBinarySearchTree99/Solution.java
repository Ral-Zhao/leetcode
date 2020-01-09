package recoverBinarySearchTree99;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution
{
	 public void recoverTree(TreeNode root) 
	 {
	        if(root == null)
	        	return;
	        Stack<TreeNode> stack = new Stack<>();
	        List<TreeNode> list = new ArrayList<>();
	        TreeNode temp = root;
	        TreeNode first = null;
	        TreeNode second = null;
	        while(temp != null)
	        {
	        	stack.push(temp);
	        	temp = temp.left;
	        }
	        while(!stack.isEmpty())
	        {
	        	temp = stack.pop();
	        	list.add(temp);
	        	if(temp.right != null)
	        	{
	        		temp = temp.right;
	        		while(temp != null)
	        		{
	        			stack.push(temp);
	        			temp = temp.left;
	        		}
	        	}
	        }
	        for(int i=0;i<list.size()-1;++i)
	        {
	        	if(first==null && list.get(i).val > list.get(i+1).val)
	        	{
	        		first = list.get(i);
	        	}
	        	if(list.get(i+1).val < list.get(i).val)
	        	{
	        		second = list.get(i+1);
	        	}
	        }
	        int temps = first.val;
	        first.val = second.val;
	        second.val = temps;
	 }
}
