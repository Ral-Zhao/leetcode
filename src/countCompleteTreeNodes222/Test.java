package countCompleteTreeNodes222;

public class Test
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		TreeNode root = new TreeNode(1);
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(1);
		TreeNode node3 = new TreeNode(1);
		TreeNode node4 = new TreeNode(1);
		TreeNode node5 = new TreeNode(1);
		TreeNode node6 = new TreeNode(1);
		TreeNode node7 = new TreeNode(1);
		TreeNode node8 = new TreeNode(1);
		TreeNode node9 = new TreeNode(1);
		TreeNode node10 = new TreeNode(1);
		
		root.left = node1;
		root.right = node2;
		node1.left = node3;
		node1.right = node4;
		node2.left = node5;
		node2.right = node6;
		node3.left = node7;
		node3.right = node8;
		node4.left = node9;
		node4.right = node10;
		
		System.out.println(s.countNodes(root));
		
	}
}
