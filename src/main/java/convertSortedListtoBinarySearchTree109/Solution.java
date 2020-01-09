package convertSortedListtoBinarySearchTree109;

import java.util.ArrayList;
import java.util.List;

public class Solution
{
	public TreeNode sortedListToBST(ListNode head) 
	{
		if(head == null)
		{
			return null;
		}
		List<Integer> list = new ArrayList<>();
		while(head != null)
		{
			list.add(head.val);
			head = head.next;
		}
		int n = list.size()/2+list.size()%2-1;
		TreeNode root = new TreeNode(list.get(n));
		root.left = helper(list,0,n-1);
		root.right = helper(list,n+1,list.size()-1);
		return root;
		
    }
	
	private TreeNode helper(List<Integer> list, int start,int end)
	{
		if(start > end)
		{
			return null;
		}
		if(start == end)
		{
			return new TreeNode(list.get(start));
		}
		else
		{
			TreeNode root = new TreeNode(list.get((start + end)/2));
			root.left = helper(list,start,(start + end)/2-1);
			root.right = helper(list,(start + end)/2+1,end);
			return root;
		}
	}
}
