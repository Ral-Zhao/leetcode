package pathSum112;

public class Test
{
	public static void main(String[] args)
	{
		TreeNode node1 = new TreeNode(5);
		TreeNode node2 = new TreeNode(4);
		TreeNode node3 = new TreeNode(6);
		TreeNode node4 = new TreeNode(1);
		TreeNode node5 = new TreeNode(2);
		TreeNode node6 = new TreeNode(3);
		TreeNode node7 = new TreeNode(4);
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.left = node6;
		node5.left = node7;
		
		Solution s = new Solution();
		System.out.println(s.hasPathSum(node1,15));
		
	}
}
