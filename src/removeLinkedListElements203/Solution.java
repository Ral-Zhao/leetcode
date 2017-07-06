package removeLinkedListElements203;

public class Solution
{
	public ListNode removeElements(ListNode head, int val) 
	{
		if(head == null)
		{
			return null;
		}
		while(head.val == val)
		{
			head = head.next;
			if(head == null)
			{
				return null;
			}
		}
		
		ListNode l1 = head;
		ListNode before = head;
		
		while(l1 != null)
		{
			if(l1.val == val)
			{
				l1 = l1.next;
				before.next = l1;
				
			}
			else
			{
				before = l1;
				l1 = l1.next;
				
			}
			
		}
		
		return head;
    }
}
