package oddEvenLinkedList328;

public class Test
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		ListNode node1 = new ListNode(0);
		ListNode node2 = new ListNode(1);
		ListNode node3 = new ListNode(2);
		ListNode node4 = new ListNode(3);
		ListNode node5 = new ListNode(4);
//		ListNode node6 = new ListNode(5);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
//		node5.next = node6;
		ListNode result = s.oddEvenList(node1);
		while(result != null)
		{
			System.out.println(result.val);
			result = result.next;
		}
	}
}
