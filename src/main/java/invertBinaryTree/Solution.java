package invertBinaryTree;

public class Solution
{
	public TreeNode invertTree(TreeNode root) 
	{
		if (null == root)
		{
			return null;
		}
		else
		{
			if (null != root.left || null != root.right)
			{
				 TreeNode temp = null;
				 temp = root.left;
				 root.left = root.right;
				 root.right = temp;
				
				 invertTree(root.left);
				 invertTree(root.right);
				
			}
			
			return root;
		}
    }
}
