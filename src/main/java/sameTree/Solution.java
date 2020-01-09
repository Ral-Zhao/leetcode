package sameTree;

public class Solution
{
	public boolean isSameTree(TreeNode p, TreeNode q) 
	{
		if (null == p && null == q)
		{
			return true;
		}
		else if(null != p && null != q)
		{
			if (p.val == q.val && isSameTree(p.left, q.left) && isSameTree(q.right, p.right))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}
}
