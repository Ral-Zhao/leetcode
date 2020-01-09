package rotateList61;

public class Solution
{
	public ListNode rotateRight(ListNode head, int k) 
	{
		if(head == null)
		{
			return null;
		}
        ListNode temp = head;
        int sum = 0;
        while(temp != null)
        {
        	temp = temp.next;
        	sum += 1;
        }
        k = k % sum;
        temp = head;
        ListNode curr = head;
        while(temp.next != null)
        {
        	if(k <= 0)
        	{
        		curr = curr.next;
        	}
        	temp = temp.next;
        	k -= 1;
        }
        
        temp.next = head;
        head = curr.next;
        curr.next = null;
        
        return head;
    }
}
