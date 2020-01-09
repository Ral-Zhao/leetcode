package convertBSTtoGreaterTree538;

public class Solution
{
	int sum = 0;
	public TreeNode convertBST(TreeNode root) 
	{
		if(root == null)
		{
			return null;
		}
		order(root);
		return root;
    }
	private void order(TreeNode root)
	{
		if(root.left==null && root.right==null)
		{
			sum += root.val;
			root.val = sum;
			return;
		}
		if(root.right != null)
		{
			order(root.right);
		}
		sum += root.val;
		root.val = sum;
		if(root.left != null)
		{
			order(root.left);
		}
	}
}
