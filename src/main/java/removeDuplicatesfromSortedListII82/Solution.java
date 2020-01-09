package removeDuplicatesfromSortedListII82;

public class Solution
{
	public ListNode deleteDuplicates(ListNode head) 
	{
        ListNode h1 = new ListNode(0);
        ListNode l1 = h1;
        boolean dup = false;
        
        while(head != null)
        {
        	if(head.next == null)
        	{
        		if(dup == false)
        		{
        			l1.next = head;
        			break;
        		}
        		else
        		{
        			break;
        		}
        	}
        	else
        	{
        		if(head.next.val == head.val)
        		{
        			dup = true;
        			head = head.next;
        		}
        		else
        		{
        			if(dup == false)
        			{
        				ListNode temp = head;
        				head = head.next;
        				l1.next = temp;
        				temp.next = null;
        				l1 = l1.next;
        			}
        			else
        			{
        				dup = false;
        				head =head.next;
        			}
        		}
        	}
        }
        return h1.next;
    }
}
