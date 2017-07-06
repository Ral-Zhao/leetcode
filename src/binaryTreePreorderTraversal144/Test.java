package binaryTreePreorderTraversal144;

import java.util.List;

public class Test
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		TreeNode root = new TreeNode(1);
		TreeNode node1 = new TreeNode(2);
		TreeNode node2 = new TreeNode(3);
		
		root.left = node1;
		node1.right = node2;
		
		List<Integer> list = s.preorderTraversal(root);
		for(int num : list)
		{
			System.out.println(num);
		}

	}
}
