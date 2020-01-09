package balancedBinaryTree110;

public class Solution
{
	public boolean isBalanced(TreeNode root) 
	{
		if(root == null)
		{
			return true;
		}
		int i = Math.abs(deepth(root.left) - deepth(root.right));
		if(i > 1)
		{
			return false;
		}
		
		return isBalanced(root.left) && isBalanced(root.right);
		
    }
	
	public int deepth(TreeNode root)
	{
		if(root == null)
		{
			return 0;
		}
		int i = 1 + Math.max(deepth(root.left), deepth(root.right));
		return i;
	}
	
}
