package reverseLinkedListII92;

public class Solution
{
	public ListNode reverseBetween(ListNode head, int m, int n) 
	{
		if(head == null)
		{
			return null;
		}
		if(n == m)
		{
			return head;
		}
		ListNode before = head;
		ListNode temp = head.next;
		int sum = 1;
		
		if(m == 1)
		{
			temp = head;
			ListNode l = temp;
			while(sum != n)
			{
				ListNode next = temp.next;
				temp.next = next.next;
				next.next = l;
				l = next;
				sum += 1;
				
			}
			head = l;
		}
		else
		{
			while(sum != m-1)
			{
				
				temp = temp.next;
				before = before.next;
				sum += 1;
			}
			ListNode l = temp;
			while(sum != n-1)
			{
				ListNode next = temp.next;
				if(next == null)
				{
					break;
				}
				temp.next = next.next;
				
				next.next = l;
				l = next;
				sum += 1;
			}
			before.next = l;
		}
		
		return head;
    }
}
