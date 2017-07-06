package mergeTwoSortedLists21;

public class Test
{
	public static void main(String[] args)
	{
		ListNode l1 = new ListNode(1);
		ListNode l12 = new ListNode(3);
		ListNode l13 = new ListNode(5);
		ListNode l14 = new ListNode(7);
		l1.next = l12;
		l12.next = l13;
		l13.next = l14;
		
		ListNode l2 = new ListNode(2);
		ListNode l22 = new ListNode(4);
		ListNode l23 = new ListNode(5);
		ListNode l24 = new ListNode(6);
		l2.next = l22;
		l22.next = l23;
		l23.next = l24;
	//================================================
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(1);
		
		Solution s = new Solution();
		ListNode newList = s.mergeTwoLists(node2,node1);
		while(newList != null)
		{
			System.out.println(newList.val);
			newList = newList.next;
		}
		
	}
}
