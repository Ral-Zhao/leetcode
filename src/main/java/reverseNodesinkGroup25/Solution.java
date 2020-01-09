package reverseNodesinkGroup25;

public class Solution
{
	 public ListNode reverseKGroup(ListNode head, int k) 
	 {
		 if(head == null)
		 {
			 return null;
		 }
		 int sum = 0;
		 ListNode temp = head;
		 while(temp != null)
		 {
			 sum += 1;
			 temp = temp.next;
		 }
		 if(sum < k)
		 {
			 return head;
		 }
		 int num = sum / k;
		 temp = head;
		 ListNode l = head;
		 while(temp != null)
		 {
			 if(num == 0)
			 {
				 break;
			 }
			 int index = k-1;
			 if(num == sum/k)
			 {
				 while(index != 0)
				 {
					 
					 ListNode curr = temp.next;
					 temp.next = curr.next;
					 curr.next = l;
					 l = curr;
					 index --;
				 }
				 num -= 1;
				 head = l;
			 }
			 else
			 {
				 while(index != 0)
				 {
					 
					 ListNode curr = temp.next;
					 temp.next = curr.next;
					 curr.next = l.next;
					 l.next = curr;
					 index --;
				 }
				 num -= 1;
			 }
			 l = temp;
			 temp = temp.next;
			 
		 }
		 return head;
	 }
}
