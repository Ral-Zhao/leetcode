package maxDepthOfBinaryTree;

public class Test
{
	public static void main(String[] args)
	{
		TreeNode root = new TreeNode(5);
		TreeNode t1 = new TreeNode(5);
		TreeNode t2 = new TreeNode(5);
		TreeNode t3 = new TreeNode(5);
		TreeNode t4 = new TreeNode(5);
		TreeNode t5 = new TreeNode(5);
		TreeNode t6 = new TreeNode(5);
		TreeNode t7 = new TreeNode(5);
		
		root.left = t1;
		root.right = t2;
		t1.left = t3;
		t3.right = t4;
		t2.left = t5;
		t3.left = t6;
		t6.left = t7;
		
		Solution s = new Solution();
		int d = s.maxDepth(root);
		System.out.println(d);
	}
}
