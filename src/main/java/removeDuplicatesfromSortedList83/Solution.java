package removeDuplicatesfromSortedList83;

public class Solution
{
	 public ListNode deleteDuplicates(ListNode head) 
	 {
		 
		 if(head == null || head.next == null)
		 {
			 return head;
		 }
		 ListNode first = head;
		 ListNode next = head.next;
		 while(head.next != null)
		 {
			 if (head.val < next.val)
			 {
				 head = next;
				 next = head.next;
			 }
			 else
			 {
				 ListNode temp = next.next;
				 next.next = null;
				 head.next = temp;
				 next = temp;
			 }
		 }
		 
		 return first;
		 
	 }
}
