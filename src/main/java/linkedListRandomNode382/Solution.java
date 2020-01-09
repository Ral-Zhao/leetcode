package linkedListRandomNode382;

public class Solution 
{
	private ListNode head;
	private int length;
    /** @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node. */
    public Solution(ListNode head) 
    {
        this.head = head;
        ListNode temp = head;
        
        while(temp != null)
        {
        	length += 1;
        	temp = temp.next;
        }
    }
    
    /** Returns a random node's value. */
    public int getRandom() 
    {
        int random = 1 + (int)(Math.random()*length);
        
        ListNode result = head;
        while(random > 1)
        {
        	result = result.next;
        	random -= 1;
        }
        
        return result.val;
    }
}
