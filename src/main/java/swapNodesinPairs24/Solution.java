package swapNodesinPairs24;

public class Solution
{
	public ListNode swapPairs(ListNode head)
	{
		if(head == null)
		{
			return null;
		}
		if(head.next == null)
		{
			return head;
		}
		
		ListNode l1 = head;
		ListNode temp1 = l1.next;
		l1.next = temp1.next;
		head = temp1;
		temp1.next = l1;
		
		
		while(l1.next != null)
		{
			temp1 = l1.next;
			if(temp1.next == null)
			{
				break;
			}
			ListNode temp2 = temp1.next;
			
			temp1.next = temp2.next;
			l1.next = temp2;
			temp2.next = temp1;
			l1 = temp1;
			
		}
		
		return head;
		
		
    }
}
