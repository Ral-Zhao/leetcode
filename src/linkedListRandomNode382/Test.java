package linkedListRandomNode382;

public class Test
{
	public static void main(String[] args)
	{
		ListNode head = new ListNode(1);
		ListNode l1 = new ListNode(2);
		ListNode l2 = new ListNode(3);
		ListNode l3 = new ListNode(4);
		ListNode l4 = new ListNode(5);
		head.next = l1;
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		
		Solution s = new Solution(head);
		System.out.println(s.getRandom());
		
	}
}
