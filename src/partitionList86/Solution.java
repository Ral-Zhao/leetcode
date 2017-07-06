package partitionList86;

public class Solution
{
	public ListNode partition(ListNode head, int x) 
	{
		if(head == null)
		{
			return null;
		}
		ListNode l1 = new ListNode(0);
		ListNode l2 = new ListNode(0);
		ListNode h1 = l1;
		ListNode h2 = l2;
		ListNode temp = head;
		while(temp != null)
		{
			ListNode curr = temp;
			temp = temp.next;
			if(curr.val < x)
			{
				curr.next = null;

				l1.next = curr;
				
				l1 = l1.next;
			}
			else
			{
				curr.next = null;

				l2.next = curr;
				l2 = l2.next;
			}
		}
		
		l1.next = h2.next;
		return h1.next;
    }
}
