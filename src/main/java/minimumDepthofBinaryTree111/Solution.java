package minimumDepthofBinaryTree111;

public class Solution
{
	public int minDepth(TreeNode root) {
		
		if(root == null)
		{
			return 0;
		}
		if(root.left == null && root.right == null)
		{
			return 1;
		}
		if(root.left == null)
		{
			return 1 + minDepth(root.right);
		}
		if(root.right == null)
		{
			return 1 + minDepth(root.left);
		}
		int i = 1 + minDepth(root.left);
		int j = 1 + minDepth(root.right);
		
		return i>j ? j : i;
		
		
		
    }
	
//	public int depth(TreeNode root)
//	{
//		if(root == null)
//		{
//			return 0;
//		}
//		if(root.left == null && root.right == null)
//		{
//			return 1;
//		}
//		if(root.left == null)
//		{
//			return 1 + depth(root.right);
//		}
//		if(root.right == null)
//		{
//			return 1 + depth(root.left);
//		}
//		int i = 1 + depth(root.left);
//		int j = 1 + depth(root.right);
//		
//		return i>j ? j : i;
//		
//	}
}
