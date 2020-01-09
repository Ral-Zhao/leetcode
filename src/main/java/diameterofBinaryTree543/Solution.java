package diameterofBinaryTree543;

public class Solution
{
	private int max = 0;
	public int diameterOfBinaryTree(TreeNode root) 
	{
		if(root == null)
		{
			return 0;
		}
		depth(root);
		return max;
    }
	private int depth(TreeNode root)
	{
		if(root == null)
		{
			return 0;
		}
		if(root.left == null && root.right == null)
		{
			return 1;
		}
		int left = 0;
		int right = 0;
		if(root.left != null)
		{
			left = depth(root.left);
		}
		if(root.right != null)
		{
			right = depth(root.right);
		}
		if(left + right > max)
		{
			max = left + right;
		}
		return Math.max(left,right)+1;
	}
}
