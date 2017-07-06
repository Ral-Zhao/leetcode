package kthSmallestElementinaBST230;

import java.util.Stack;

public class Solution
{
//	private int sum = 0;
	private int result = 0;
	public int kthSmallest(TreeNode root, int k) 
	{
        if(root == null)
        {
        	return 0;
        }
        
        
        Stack<TreeNode> stack = new Stack<>();
        
        TreeNode temp = root;
        while(temp != null)
        {
        	stack.add(temp);
        	temp = temp.left;
        }
        while(!stack.isEmpty())
        {
        	TreeNode curr = stack.pop();
        	k -= 1;
        	if(k == 0)
        	{
        		result = curr.val;
        		break;
        	}
        	
        	if(curr.right != null)
        	{
        		curr = curr.right;
        		while(curr != null)
        		{
        			stack.add(curr);
        			curr = curr.left;
        		}
        	}
        	
        }
//        order(root,k);
        return result;
    }
//	private void order(TreeNode root,int k)
//	{
//		if(root.left == null && root.right == null)
//		{
//			sum += 1;
//			if(sum == k)
//			{
//				result = root.val;
//			}
//			return;
//		}
//		if(root.left != null)
//		{
//			order(root.left,k);
//		}
//		sum += 1;
//		if(sum == k)
//		{
//			result = root.val;
//			return;
//		}
//		if(root.right != null)
//		{
//			order(root.right,k);
//		}
//	}
}
