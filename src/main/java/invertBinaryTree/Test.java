package invertBinaryTree;

public class Test
{
	public static void main(String[] args)
	{
		TreeNode root = new TreeNode(2);
		TreeNode t1 = new TreeNode(3);
		TreeNode t2 = new TreeNode(5);
		TreeNode t3 = new TreeNode(4);
		TreeNode t4 = new TreeNode(8);
		TreeNode t5 = new TreeNode(1);
		TreeNode t6 = new TreeNode(2);
		TreeNode t7 = new TreeNode(9);
		
		root.left = t1;
		root.right = t2;
		t1.left = t3;
		t3.right = t4;
		t2.left = t5;
		t3.left = t6;
		t6.left = t7;
		
		Solution s = new Solution();
		
		TreeNode result = s.invertTree(root);
		
		System.out.println(result.right.val);
		System.out.println(result.left.right.val);
		System.out.println(result.right.right.left.val);
		
	}
}
