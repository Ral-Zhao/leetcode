package lowestCommonAncestorofaBinaryTree236;

public class Test
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		TreeNode root = new TreeNode(3);
		TreeNode node1 = new TreeNode(5);
		TreeNode node2 = new TreeNode(1);
		TreeNode node3 = new TreeNode(6);
		TreeNode node4 = new TreeNode(2);
		TreeNode node5 = new TreeNode(0);
		TreeNode node6 = new TreeNode(8);
		TreeNode node7 = new TreeNode(7);
		TreeNode node8 = new TreeNode(4);

		root.left = node1;
		root.right = node2;
		node1.left = node3;
		node1.right = node4;
		node4.left = node7;
		node4.right = node8;
		node2.left = node5;
		node2.right = node6;
		
		TreeNode result = s.lowestCommonAncestor(root,node1,node8);
		System.out.println(result.val);
	}
}
