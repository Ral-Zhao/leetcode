package sumRoottoLeafNumbers129;

public class Test
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		TreeNode root = new TreeNode(1);
		TreeNode node1 = new TreeNode(2);
		TreeNode node2 = new TreeNode(3);
		TreeNode node3 = new TreeNode(4);
		TreeNode node4 = new TreeNode(5);
		TreeNode node5 = new TreeNode(6);

		root.left = node1;
		root.right = node2;
		node1.left = node3;
		node2.left = node4;
		node2.right = node5;
		
		System.out.println(s.sumNumbers(root));
	}
}
