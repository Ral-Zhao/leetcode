package deleteNodeinaBST450;

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
		TreeNode node5 = new TreeNode(15);
		TreeNode node6 = new TreeNode(4);
		TreeNode node7 = new TreeNode(12);
		TreeNode node8 = new TreeNode(21);
		TreeNode node9 = new TreeNode(13);
		
		root.left = node1;
		root.right = node2;
		node1.left = node3;
		node1.right = node4;
		node3.left = node6;
		node2.right = node5;
		node5.left = node7;
		node5.right = node8;
		node7.right = node9;
		
		root = s.deleteNode(root,10);
		traverse(root);


	}
	
	private static void traverse(TreeNode root)
	{
		if(root.right == null && root.left == null)
		{
			System.out.println(root.val);
			return;
		}
		if(root.left != null)
		{
			traverse(root.left);
		}
		System.out.println(root.val);
		if(root.right != null)
		{
			traverse(root.right);
		}
		
	}
}
