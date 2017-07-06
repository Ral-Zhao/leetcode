package reorderList143;

public class Solution
{
	public void reorderList(ListNode head) 
	{
		if(head == null)
		{
			return;
		}
		if(head.next == null)
		{
			return;
		}
        
        ListNode temp = head;
        int sum = 0;
        while(temp != null)
        {
        	sum += 1;
        	temp = temp.next;
        }
        sum = (sum+1)/2;
        temp = head;
        ListNode temp2 = temp.next;
        while(sum > 1)
        {
        	temp = temp.next;
        	temp2 = temp2.next;
        	sum -= 1;
        }
        temp.next = null;
        temp = temp2.next;
        temp2.next = null;
        while(temp != null)
        {
        	ListNode next = temp.next;
        	temp.next = temp2;
        	temp2 = temp;
        	temp = next;
        }
        
        ListNode l2 = temp2;
        ListNode l1 = head;
        while(l2 != null)
        {
        	temp = l2;
        	l2 = l2.next;
        	temp2 = l1;
        	l1 = l1.next;
        	temp2.next = temp;
        	temp.next = l1;
        	
        }
        		
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        while(curr != null)
//        {
//        	ListNode temp = curr.next;
//        	if(temp == null)
//        	{
//        		break;
//        	}
//        	ListNode before = curr;
//        	while(temp.next != null)
//        	{
//        		before = before.next;
//        		temp = temp.next;
//        	}
//        	before.next = null;
//        	temp.next = curr.next;
//        	curr.next = temp;
//        	curr = temp.next;
//        	
//        }
    }
}
