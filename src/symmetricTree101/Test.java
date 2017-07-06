package symmetricTree101;

public class Test
{
	public static void main(String[] args)
	{
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(2);
		TreeNode node4 = new TreeNode(3);
		TreeNode node5 = new TreeNode(3);
		TreeNode node6 = new TreeNode(4);
		TreeNode node7 = new TreeNode(3);
		
		node1.left = node2;
		node1.right = node3;
		node2.right = node4;
		node3.left = node5;
		node3.right = node7;
		node4.right = node6;
		Solution s = new Solution();
		System.out.println(s.isSymmetric((node1)));

		
	}
}
