package removeNthNodeFromEndofList19;

public class Solution
{
	 public ListNode removeNthFromEnd(ListNode head, int n) 
	 {
		 ListNode temp1 = head;
		 ListNode temp2 = head;
		 ListNode temp3 = head;
		 for(int i=n;i>0;--i)
		 {
			 temp1 = temp1.next;
		 }
		 while(temp1 != null)
		 {
			 
			 temp3 =temp2;
			 temp1 = temp1.next;
			 temp2 = temp2.next;
			 
		 }
		 if(temp2 == head)
		 {
			 head = temp2.next;
		 }
		 else
		 {
			temp3.next = temp2.next; 
		 }
		 
		 return head;
		 
	 }
}
