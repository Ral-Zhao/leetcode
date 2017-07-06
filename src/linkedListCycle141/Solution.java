package linkedListCycle141;

public class Solution
{
	public boolean hasCycle(ListNode head) 
	{
        boolean flag = false;
        boolean result = false;
        if(head == null)
        {
        	return false;
        }
        if(head.next == head)
        {
        	return true;
        }
        
        ListNode l1 = head;
        ListNode l2 = head;
        while(l1 != null)
        {
        	if(flag == false)
        	{
        		l1 = l1.next;
        		flag = true;
        		continue;
        	}
        	
        	if(l1 == l2)
        	{
        		result = true;
        		break;
        	}
        	flag = false;
        	l1 = l1.next;
        	l2 = l2.next;
        	
        	
        	
        }
        return result;
    }
}
