package swapNodesinPairs24;

public class Test
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(5);
		
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		
		ListNode l = s.swapPairs(l1);
		while(l != null)
		{
			System.out.println(l.val);
			l = l.next;
		}
	}
}
