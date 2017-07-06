package addTwoNumbers2;

public class Test
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		ListNode l1 = new ListNode(4);
		ListNode l12 = new ListNode(2);
		ListNode l13 = new ListNode(0);
		ListNode l14 = new ListNode(5);
		
		l1.next = l12;
		l12.next = l13;
		l13.next = l14;
		
		ListNode l2 = new ListNode(4);
		ListNode l22 = new ListNode(3);
		ListNode l23 = new ListNode(9);
		ListNode l24 = new ListNode(5);
		ListNode l25 = new ListNode(9);
		
		l2.next = l22;
		l22.next = l23;
		l23.next = l24;
		l24.next = l25;
		
		ListNode temp = s.addTwoNumbers(null,null);
		while(temp != null)
		{
			System.out.println(temp.val);
			temp = temp.next;
		}

	}
}
