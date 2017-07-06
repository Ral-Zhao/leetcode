package insertionSortList147;

public class Solution
{
	public ListNode insertionSortList(ListNode head) 
	{
		if(head == null){
			return null;
		}
		if(head.next == null)
		{
			return head;
		}
        ListNode temp = head;
        ListNode curr = head.next;
        while(curr != null)
        {
        	if(curr.val < temp.val)
        	{
        		ListNode move = curr;
        		temp.next = move.next;
        		curr = temp.next;
                ListNode start = head;
                
        		if(start.val >= move.val)
        		{
        			move.next = head;
        			head = move;
        		}
        		else
        		{
        			while(start.next.val <= move.val)
            		{
            			start = start.next;
            		}
        			move.next = start.next;
        			start.next = move;
        		}
        		
        	}
        	else
        	{
        		temp = temp.next;
        		curr = temp.next;
        	}
        }
        return head;
    }
}
