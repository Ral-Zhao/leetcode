package addTwoNumbersII445;

public class Test
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		ListNode l1 = new ListNode(7);
		ListNode l12 = new ListNode(2);
		ListNode l13 = new ListNode(4);
		ListNode l14 = new ListNode(3);
		
		l1.next = l12;
		l12.next = l13;
		l13.next = l14;
		
		ListNode l2 = new ListNode(5);
		ListNode l22 = new ListNode(6);
		ListNode l23 = new ListNode(4);
		
		l2.next = l22;
		l22.next = l23;
		
		ListNode result = s.addTwoNumbers(l1,l2);
		while(result != null)
		{
			System.out.println(result.val);
			result = result.next;
		}
	}
}
