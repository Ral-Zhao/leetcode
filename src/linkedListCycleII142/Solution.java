package linkedListCycleII142;

import java.util.ArrayList;
import java.util.List;

public class Solution
{
	public ListNode detectCycle(ListNode head) 
	{
		
		List<ListNode> list = new ArrayList<>();
		ListNode temp = head;
		while(temp != null)
		{
			if(list.contains(temp))
			{
				return temp;
			}
			else
			{
				list.add(temp);
				temp = temp.next;
			}
		}
		
		return null;
    }
}
