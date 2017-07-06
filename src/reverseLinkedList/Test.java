package reverseLinkedList;

public class Test
{
	public static void main(String[] args)
	{
		ListNode head = new ListNode(0);
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		
		head.next = l1;
		l1.next = null;
//		l1.next = l2;
		l2.next = l3;
		l3.next = null;
		
		Solution s = new Solution();
		ListNode temp = s.reverseList(head);
		
		while(temp != null)
		{
			System.out.println(temp.val);
			temp = temp.next;
		}
	}
}
