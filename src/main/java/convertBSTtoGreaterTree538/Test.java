package convertBSTtoGreaterTree538;

public class Test
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		TreeNode root = new TreeNode(10);
		TreeNode node1 = new TreeNode(7);
		TreeNode node2 = new TreeNode(11);
		TreeNode node3 = new TreeNode(6);
		TreeNode node4 = new TreeNode(8);
		TreeNode node5 = new TreeNode(4);
		TreeNode node6 = new TreeNode(15);
		TreeNode node7 = new TreeNode(21);
		
		root.left = node1;
		root.right = node2;
		node1.left = node3;
		node1.right = node4;
		node3.left = node5;
		node2.right = node6;
		node6.right = node7;
		
		TreeNode result = s.convertBST(root);
		
		System.out.println(result.val);
	}
}
