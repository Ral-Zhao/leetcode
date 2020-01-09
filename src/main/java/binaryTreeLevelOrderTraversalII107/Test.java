package binaryTreeLevelOrderTraversalII107;

import java.util.List;

public class Test
{
	public static void main(String[] args)
	{
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(5);
		TreeNode node4 = new TreeNode(3);
		TreeNode node5 = new TreeNode(7);
		TreeNode node6 = new TreeNode(9);
		TreeNode node7 = new TreeNode(6);

		node1.left = node2;
		node1.right = node3;
		node2.right = node4;
		node3.left = node5;
		node3.right = node6;
		node5.right = node7;
		
		List<List<Integer>> list;
		
		Solution s = new Solution();
		list = s.levelOrderBottom(null);
		
		for(List<Integer> list2 : list)
		{
			System.out.println("[");
			for(Integer num : list2)
			{
				System.out.println(num);
			}
			System.out.println("]");
		}
		
		
	}
}
