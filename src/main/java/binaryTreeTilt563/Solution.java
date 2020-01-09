package binaryTreeTilt563;

public class Solution
{
	private int sum;
	public int findTilt(TreeNode root) 
	{
		traverse(root);
        return sum;
    }
	private void traverse(TreeNode root)
	{
		 if(root == null || (root.left == null && root.right == null))
	        return;
		 int left = tilt(root.left);
		 int right = tilt(root.right);
		 sum += Math.abs(left - right);
		 traverse(root.left);
		 traverse(root.right);
	}
	private int tilt(TreeNode root)
	{
		if(root == null)
			return 0;
		int result = root.val;
		 if(root.left == null && root.right == null)
		    return root.val;
		 if(root.left != null)
			 result += tilt(root.left);
		 if(root.right != null)
			 result += tilt(root.right);
		 return result;
	}
}
