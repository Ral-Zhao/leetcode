package intersectionOfTwoLinkedLists160;

public class Solution
{
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
	{
		if(headA == null || headB == null)
		{
			return null;
		}
		if(headA == headB)
		{
			return headA;
		}
		
		ListNode l1 = headA;
		ListNode l2 = headB;
		int lengthA = 0;
		int lengthB = 0;
		while(l1 != null)
		{
			lengthA += 1;
			l1 = l1.next;
		}
		while(l2 != null)
		{
			lengthB += 1;
			l2 = l2.next;
		}
		l1 = headA;
		l2 = headB;
		
		int sub = Math.abs(lengthA - lengthB);
		if(lengthA < lengthB)
		{
			ListNode temp = l1;
			l1 = l2;
			l2 = temp;
		}
		
		while(sub != 0)
		{
			l1 = l1.next;
			sub -= 1;
		}
		
		while(l1 != null)
		{
			if(l1 == l2)
			{
				return l1;
			}
			l1 = l1.next;
			l2 = l2.next;
		}
		
		return null;
		
		
    }
}
