package mergekSortedLists23;

import java.util.ArrayDeque;
import java.util.Queue;

public class Solution
{
	public ListNode mergeKLists(ListNode[] lists) 
	{
		if(lists.length == 0)
		{
			return null;
		}
		Queue<ListNode> que = new ArrayDeque<>();
		for(int i=0;i<lists.length;++i)
		{
			if(lists[i] != null)
			{
				que.add(lists[i]);
			}
			
		}
		while(que.size() != 1 && !que.isEmpty())
		{
			ListNode l1 = que.poll();
			ListNode l2 = que.poll();
			
			que.add(merge(l1,l2));
		}
		return que.peek();
    }
	private ListNode merge(ListNode l1, ListNode l2)
	{
		ListNode h = new ListNode(-1);
		ListNode l = h;
		while(l1 != null && l2 != null)
		{
			if(l1.val < l2.val)
			{
				l.next = l1;
				l1 = l1.next;
			}
			else
			{
				l.next = l2;
				l2 = l2.next;
			}
			l = l.next;
			l.next = null;	
		}
		
		if(l1 == null)
		{
			l.next = l2;
		}
		if(l2 == null)
		{
			l.next = l1;
		}
		
		return h.next;
	}
}
