package diameterofBinaryTree543;

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
		
		root.right = node1;
		root.left = node2;
		node1.right = node3;
		node2.left = node4;
		System.out.println(s.diameterOfBinaryTree(root));

	}
}
