package binarySearchTreeIterator173;

public class Test
{
	public static void main(String[] args)
	{
		TreeNode root = new TreeNode(6);
		TreeNode node1 = new TreeNode(5);
		TreeNode node2 = new TreeNode(9);
		TreeNode node3 = new TreeNode(2);
		TreeNode node4 = new TreeNode(7);
		TreeNode node5 = new TreeNode(10);
		TreeNode node6 = new TreeNode(3);
		TreeNode node7 = new TreeNode(4);
		
		root.left = node1;
		root.right = node2;
		node1.left = node3;
		node3.right = node6;
		node6.right = node7;
		node2.left = node4;
		node2.right = node5;
		BSTIterator i = new BSTIterator(null);
		while (i.hasNext()) 
		{
			System.out.println(i.next());
		}
	}
}
