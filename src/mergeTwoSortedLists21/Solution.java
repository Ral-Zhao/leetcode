package mergeTwoSortedLists21;

public class Solution
{
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) 
	{
		if(l1 == null && l2 == null)
		{
			return null;
		}
		if(l1 == null && l2 != null)
		{
			return l2;
		}
		if(l1 != null && l2 == null)
		{
			return l1;
		}
		
		if(l1.val > l2.val)
		{
			ListNode temp = l1;
			l1 = l2;
			l2 = temp;
		}
		
        ListNode node1 = l1;
        ListNode node2 = l2;
        
        while(node1.next != null && node2 != null)
        {
        	if(node2.val >= node1.val && node2.val < node1.next.val)
        	{
        		ListNode temp  = node1.next;
        		ListNode temp2 = node2.next;
        		node1.next = node2;
        		node2.next = temp;
        		node1 = node1.next;
        		node2 = temp2;
        		
        	}
        	else
        	{
        		node1 = node1.next;
        	}
        	
        }
        
        
        if(node1.next == null)
        {
        	node1.next = node2;
        	return l1;
        }
        else
        {
        	
        	return l1;
        }
        
    }
}
