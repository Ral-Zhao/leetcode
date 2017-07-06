package constructBinaryTreefromPreorderandInorderTraversal105;

public class Test
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		int[] pre = new int[]{1,2,4,5,7,3,6};
		int[] in = new int[]{4,2,5,7,1,3,6};
		TreeNode root = s.buildTree(pre,in);
		
//		System.out.println(root.left.right.right.right.val);
		pre(root);
		System.out.println();
		in(root);
	}
	public static void pre(TreeNode root)
	{
		if(root == null)
			return;
		System.out.print(root.val+",");
		pre(root.left);
		pre(root.right);
	}
	public static void in(TreeNode root)
	{
		if(root == null)
			return;
		
		if(root.left != null)
			in(root.left);
		System.out.print(root.val+",");
		if(root.right != null)
			in(root.right);
	}
	
}
