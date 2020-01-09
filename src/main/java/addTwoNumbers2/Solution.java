package addTwoNumbers2;

public class Solution
{
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
	{
		if(l1 == null || l2 == null)
		{
			return l1==null?l2:l1;
		}
		int mod = 0;
		int div = 0;
		ListNode h = null;
		ListNode l = h;
		boolean first = true;
		while(l1 != null && l2 != null)
		{
			div = (l1.val + l2.val + mod)%10;
			mod = (l1.val + l2.val + mod)/10;
			if(first)
			{
				h = new ListNode(div);
				l = h;
				first = false;
			}
			else
			{
				l.next = new ListNode(div);
				l = l.next;
			}
			l1 = l1.next;
			l2 = l2.next;
		}
		ListNode temp = l1==null ? l2:l1;
		while(temp != null)
		{
			div = (temp.val + mod)%10;
			mod = (temp.val + mod)/10;
			l.next = new ListNode(div);
			temp = temp.next;
			l = l.next;
		}
		if(mod != 0)
		{
			l.next = new ListNode(mod);
		}
		
		return h;
    }
}
