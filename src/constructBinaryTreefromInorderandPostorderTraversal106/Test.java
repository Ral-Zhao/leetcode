package constructBinaryTreefromInorderandPostorderTraversal106;


public class Test
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		int[] post = new int[]{4,7,5,2,6,3,1};
		int[] in = new int[]{4,2,5,7,1,3,6};
		
		TreeNode root = s.buildTree(in,post);
		post(root);
		System.out.println();
		in(root);
	}
	public static void post(TreeNode root)
	{
		if(root == null)
			return;
		post(root.left);
		post(root.right);
		System.out.print(root.val+",");

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
