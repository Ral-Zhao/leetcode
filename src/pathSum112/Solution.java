package pathSum112;

public class Solution
{
	public boolean hasPathSum(TreeNode root, int sum)
	{
		if(root == null)
		{
			return false;
		}
		if(root.left == null && root.right == null)
		{
			if(root.val == sum)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		boolean flag1 = hasPathSum(root.left, sum-root.val);
		boolean flag2 = hasPathSum(root.right,sum-root.val);
		
		if(flag1 == false && flag2 == false)
		{
			return false;
		}
		else
		{
			return true;
		}
    }
}
