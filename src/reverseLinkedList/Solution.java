package reverseLinkedList;

public class Solution
{
	public ListNode reverseList(ListNode head) 
	{
		if (null == head)
		{
			return null;
		}
		else if(head.next == null)
		{
			return head;
		}
		ListNode now = head;
		ListNode next = head.next;
		ListNode temp = next.next;
		head.next = null;
		
		while(temp != null)
		{
			next.next = now;
			now = next;
			next = temp;
			temp = temp.next;
		}
		
		next.next = now;
		
		return next;
    }
}
