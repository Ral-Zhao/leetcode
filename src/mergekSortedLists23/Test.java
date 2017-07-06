package mergekSortedLists23;

public class Test
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		ListNode l1 = new ListNode(1);
		ListNode l12 = new ListNode(2);
		ListNode l13 = new ListNode(3);
		ListNode l14 = new ListNode(4);
		ListNode l15 = new ListNode(5);
		l1.next = l12;
		l12.next = l13;
		l13.next = l14;
		l14.next = l15;
		
		ListNode l2 = new ListNode(2);
		ListNode l22 = new ListNode(4);
		ListNode l23 = new ListNode(6);
		ListNode l24 = new ListNode(8);
		ListNode l25 = new ListNode(10);
		l2.next = l22;
		l22.next = l23;
		l23.next = l24;
		l24.next = l25;
		
		ListNode l3 = new ListNode(1);
		ListNode l32 = new ListNode(3);
		ListNode l33 = new ListNode(5);
		ListNode l34 = new ListNode(7);
		l3.next = l32;
		l32.next = l33;
		l33.next = l34;
		
		ListNode[] lists = new ListNode[]{null};
		
		ListNode temp = s.mergeKLists(lists);
		while(temp != null)
		{
			System.out.println(temp.val);
			temp = temp.next;
		}
	}
}
