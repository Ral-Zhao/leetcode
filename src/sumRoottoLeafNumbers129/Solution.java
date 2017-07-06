package sumRoottoLeafNumbers129;

public class Solution
{
	private int sum;
	public int sumNumbers(TreeNode root) 
	{
		
		if(root == null)
			return 0;
		traverse(root,"");
		return sum;
    }
	private void traverse(TreeNode root, String str)
	{
		if(root.left == null && root.right == null)
		{
			sum += Integer.parseInt(str+root.val);
			return;
		}
		if(root.left != null)
			traverse(root.left, str+root.val);
		if(root.right != null)
			traverse(root.right, str+root.val);
	}
}
