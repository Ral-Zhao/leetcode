package binaryTreeZigzagLevelOrderTraversal103;

import java.util.List;

public class Test
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		TreeNode root = new TreeNode(3);
		TreeNode node1 = new TreeNode(9);
		TreeNode node2 = new TreeNode(20);
		TreeNode node3 = new TreeNode(15);
		TreeNode node4 = new TreeNode(7);
		root.left = node1;
		root.right = node2;
		node2.left = node3;
		node2.right = node4;
		
		List<List<Integer>> lists = s.zigzagLevelOrder(root);
		for(List<Integer> list : lists)
		{
			for(int e : list)
			{
				System.out.print(e+",");
			}
			System.out.println();
		}

	}
}
