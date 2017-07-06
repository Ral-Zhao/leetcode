package linkedListCycle141;

public class Test
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(1);
		ListNode l3 = new ListNode(1);
		ListNode l4 = new ListNode(1);
		ListNode l5 = new ListNode(1);
		
		l1.next = l2;
		l2.next = l1;
		l3.next = l4;
		l4.next = l5;
		l5.next = l1;
				
		System.out.println(s.hasCycle(l1));
				

	}
}
