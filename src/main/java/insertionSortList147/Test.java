package insertionSortList147;

public class Test
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		ListNode node1 = new ListNode(2);
		ListNode node2 = new ListNode(5);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(1);
		ListNode node5 = new ListNode(6);
		ListNode node6 = new ListNode(7);
		ListNode node7 = new ListNode(5);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		ListNode result = s.insertionSortList(node1);
		while(result != null)
		{
			System.out.println(result.val);
			result = result.next;
		}

	}
}
