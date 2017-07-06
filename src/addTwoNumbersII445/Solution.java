package addTwoNumbersII445;

import java.util.Stack;

public class Solution
{
	public ListNode addTwoNumbers(ListNode l1, ListNode l2)
	{
		Stack<Integer> stack1 = new Stack<>();
		Stack<Integer> stack2 = new Stack<>();
		while(l1 != null || l2 != null)
		{
			if(l1 != null)
			{
				stack1.push(l1.val);
				l1 = l1.next;
			}
			if(l2 != null)
			{
				stack2.push(l2.val);
				l2 = l2.next;
			}
		}
		int step = 0;
		ListNode temp = null;
		while(!stack1.isEmpty() || !stack2.isEmpty() || step != 0)
		{
			int n1 = 0;
			int n2 = 0;
			if(!stack1.isEmpty())
			{
				n1 = stack1.pop();
			}
			if(!stack2.isEmpty())
			{
				n2 = stack2.pop();
			}
			int mod = (n1 + n2 + step)%10;
			step = (n1 + n2 + step)/10;
			
			ListNode news = new ListNode(mod);
			news.next = temp;
			temp = news;
			
		}
		
		return temp;
    }
}
