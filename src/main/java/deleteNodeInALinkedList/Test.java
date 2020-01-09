package deleteNodeInALinkedList;

public class Test
{
	public static void main(String[] args)
	{
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = null;
		
		Solution s = new Solution();
		
		s.deleteNode(l3);
		
		while(null != l1)
		{
			System.out.println(l1.val);
			l1 = l1.next;
		}
	}
}
