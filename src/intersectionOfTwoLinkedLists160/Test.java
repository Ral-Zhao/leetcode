package intersectionOfTwoLinkedLists160;

public class Test
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		ListNode l1 = new ListNode(1);
		ListNode l11 = new ListNode(2);
		ListNode l12 = new ListNode(3);
		ListNode l13 = new ListNode(4);
		ListNode l14 = new ListNode(5);
		
		ListNode l2 = new ListNode(6);
		ListNode l21 = new ListNode(7);
		ListNode l22 = new ListNode(8);
		
		l1.next = l11;
		l11.next = l12;
		l12.next = l13;
		l13.next = l14;
		l2.next = l21;
		l21.next = l22;
		l22.next = l13;
		
		ListNode result = s.getIntersectionNode(l1,l2);
		
		if(result == null)
		{
			System.out.println("null");
		}
		else
		{
			System.out.println(result.val);

		}

	}
}
