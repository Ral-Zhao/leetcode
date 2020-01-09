package kthSmallestElementinaBST230;

public class Test
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		TreeNode root = new TreeNode(5);
		TreeNode node1 = new TreeNode(4);
		TreeNode node2 = new TreeNode(7);
		TreeNode node3 = new TreeNode(2);
		TreeNode node4 = new TreeNode(6);
		TreeNode node5 = new TreeNode(8);
		TreeNode node6 = new TreeNode(1);
		TreeNode node7 = new TreeNode(3);

		root.left = node1;
		root.right = node2;
		node1.left = node3;
		node3.left = node6;
		node3.right = node7;
		node2.left = node4;
		node2.right = node5;
		System.out.println(s.kthSmallest(root,6));
	}
}
