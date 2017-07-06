package oddEvenLinkedList328;

public class Solution
{
	 public ListNode oddEvenList(ListNode head)
	 {
		 if(head == null)
		 {
			 return null;
		 }
		 if(head.next == null)
		 {
			 return head;
		 }
		 ListNode odd = head;
		 ListNode even = head.next;
		 ListNode evenS = head.next;
		 ListNode temp = even.next;
		 even.next = null;
		 int i = 1;
		 while(temp != null)
		 {
			 if(i % 2 == 1)
			 {
				 odd.next = temp;
				 odd = odd.next;
			 }
			 else
			 {
				 even.next = temp;
				 even = even.next;
			 }
			 temp = temp.next;
			 i += 1;
		 }
		 even.next = null;
		 
		 odd.next = evenS;
		 
		 return head;
	 }
}
