package houseRobberIII337;

public class Test
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		TreeNode root = new TreeNode(3);
		TreeNode node1 = new TreeNode(5);
		TreeNode node2 = new TreeNode(3);
		TreeNode node3 = new TreeNode(1);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(2);
		TreeNode node6 = new TreeNode(3);
		TreeNode node7 = new TreeNode(5);
		
		root.left = node1;
		root.right = node2;
		node2.right = node4;
		node1.right = node3;
		node3.left = node5;
		node3.right = node6;
		node6.right = node7;
		
		System.out.println(s.rob(root));


	}
}
