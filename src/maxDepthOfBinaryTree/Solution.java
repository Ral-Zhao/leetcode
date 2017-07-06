package maxDepthOfBinaryTree;

public class Solution
{
	public int maxDepth(TreeNode root) 
	{
		if (null == root)
		{
			return 0;
		}
		else
		{
			int n = 1;
			int m = 1;
			if (null != root.left || null != root.right)
			{
				 
				n = n + maxDepth(root.left);
				m = m + maxDepth(root.right);
				
				
			}
			
			if(n > m)
			{
				return n;
			}
			else
			{
				return m;
			}
		}
    }
}
