package sumofLeftLeaves404;

public class Solution
{
	private int sum=0;
	public int sumOfLeftLeaves(TreeNode root) 
	{
		if(root == null)
		{
			return 0;
		}
		help(root);
		return sum;
    }
	private void help(TreeNode root)
	{
		if(root.left==null && root.right==null)
		{
			return;
		}
		if(root.left != null)
		{
			TreeNode left = root.left;
			if(left.left==null && left.right==null)
			{
				sum += left.val;
			}
			else
			{
				help(left);
			}
		}
		if(root.right != null)
		{
			
			help(root.right);
			
		}
		
	}
}
