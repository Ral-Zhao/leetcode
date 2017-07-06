package convertSortedListtoBinarySearchTree109;

public class Test
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		ListNode node1 = new ListNode(2);
		ListNode node2 = new ListNode(3);
		ListNode node3 = new ListNode(5);
		ListNode node4 = new ListNode(8);
		ListNode node5 = new ListNode(9);
		ListNode node6 = new ListNode(12);
		ListNode node7 = new ListNode(45);
		ListNode node8 = new ListNode(89);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		node7.next = node8;
		
		TreeNode tree = s.sortedListToBST(node1);
		System.out.println(tree.left.val);
		System.out.println(tree.right.val);
		System.out.println(tree.right.right.right.val);
		


	}
}
