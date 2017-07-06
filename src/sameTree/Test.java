package sameTree;

public class Test
{
	public static void main(String[] args)
	{
		TreeNode root1 = new TreeNode(2);
		TreeNode t1 = new TreeNode(5);
		TreeNode t2 = new TreeNode(4);
		TreeNode t3 = new TreeNode(1);
		TreeNode t4 = new TreeNode(1);
		TreeNode t5 = new TreeNode(3);
		
		root1.left = t1;
		root1.right = t2;
		t1.left = t3;
		t1.right = t4;
		t2.left = t5;
		
		TreeNode root2 = new TreeNode(2);
		TreeNode t12 = new TreeNode(5);
		TreeNode t22 = new TreeNode(4);
		TreeNode t32 = new TreeNode(1);
		TreeNode t42 = new TreeNode(1);
		TreeNode t52 = new TreeNode(3);
		
		root2.left = t12;
		root2.right = t32;
		t12.left = t22;
		t12.right = t42;
		t22.left = t52;
		
		Solution s = new Solution();
		System.out.println(s.isSameTree(root1, root2));
		
	}
}
