package binaryTreeInorderTraversal94;

import java.util.ArrayList;
import java.util.List;

public class Test
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		TreeNode head = new TreeNode(1);
		TreeNode t2 = new TreeNode(3);
		TreeNode t3 = new TreeNode(5);
		TreeNode t4 = new TreeNode(4);
		TreeNode t5 = new TreeNode(2);
		TreeNode t6 = new TreeNode(6);
		head.left = t2;
		head.right = t3;
		t2.left = t4;
		t2.right = t5;
		t3.right = t6;
		
		List<Integer> list = new ArrayList<>();
		list = s.inorderTraversal(null);
		for(int num : list)
		{
			System.out.println(num);
		}
		


		
	}
	
}
