package lowestCommonAncestorofaBinarySearchTree235;

public class Test
{
	public static void main(String[] args)
	{
		TreeNode node1 = new TreeNode(6);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(8);
		node1.left = node2;
		node1.right = node3;
		
		TreeNode node4 = new TreeNode(0);
		node2.left = node4;
		TreeNode node5 = new TreeNode(4);
		node2.right = node5;
		TreeNode node6 = new TreeNode(3);
		TreeNode node7 = new TreeNode(5);
		node5.left = node6;
		node5.right = node7;
		
		TreeNode node8 = new TreeNode(7);
		TreeNode node9 = new TreeNode(9);
		node3.left = node8;
		node3.right = node9;
		
		TreeNode node11 = new TreeNode(2);
		TreeNode node12 = new TreeNode(1);
		node11.left = node12;
		
		Solution s = new Solution();
		TreeNode test = s.lowestCommonAncestor(node1,node4,node9);
		System.out.println(test.val);
		
		//System.out.println(s.isAncestor(node3,node8));
		
		
		
	}
}
