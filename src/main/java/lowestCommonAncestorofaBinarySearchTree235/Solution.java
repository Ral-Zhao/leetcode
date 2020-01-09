package lowestCommonAncestorofaBinarySearchTree235;

public class Solution
{
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) 
	{
		if(root == null)
		{
			return null;
		}
		if(root == p || root == q)
		{
			return root;
		}
		boolean left = isAncestor(root.left,p) || isAncestor(root.left,q);
		boolean right = isAncestor(root.right,p) || isAncestor(root.right,q);
		
		if(left == false)
		{
			return lowestCommonAncestor(root.right,p,q);
		}
		else if(right == false)
		{
			return lowestCommonAncestor(root.left,p,q);
		}
		else
		{
			return root;
		}
	
    }
	
	public boolean isAncestor(TreeNode root, TreeNode p)
	{
		if (root == null)
		{
			return false;
		}
		if(root.left == p || root.right == p || root == p)
		{
			return true;
		}
		return (isAncestor(root.left,p) || isAncestor(root.right,p));
	}
}
