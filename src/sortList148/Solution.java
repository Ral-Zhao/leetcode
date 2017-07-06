package sortList148;

public class Solution
{
	public ListNode sortList(ListNode head) 
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
		ListNode h = new ListNode(-1);
		ListNode l = h;
		int i = 1;
		
		while(i < sum)
		{
			ListNode temp1 = head;
			ListNode temp2 = head;
			
			while(temp1 != null)
			{
				boolean flag = false;
				int step = i;
				temp = temp1;
				while(step > 0)
				{
					if(temp1.next == null)
					{
						l.next = temp;
						l = temp1;
						flag = true;
						break;
					}
					temp1 = temp1.next;

					step -= 1;
				}
				if(flag == true)
				{
					break;
				}
				int step1 = 0;
				int step2 = 0;
				while(!(step1==i && step2==i) && !(step2==i && temp1==null))
				{
					if(step1==i || temp1==null)
					{
						int div = i-step2;
						while(div > 0)
						{
							l.next = temp2;
							div -= 1;
							l = l.next;
							temp2 = temp2.next;
						}
						break;
					}
					else if(step2 == i)
					{
						int div = i-step1;
						while(div > 0 && temp1 != null)
						{
							l.next = temp1;
							div -= 1;
							l = l.next;
							temp1 = temp1.next;
						}
						break;
					}
					if(temp1.val < temp2.val)
					{
						l.next = temp1;
						temp1 = temp1.next;
						l = l.next;
						step1 += 1;
					}
					else
					{
						l.next = temp2;
						l = l.next;
						temp2 = temp2.next;
						step2 += 1;
					}
				}
				temp2 =temp1;
			}
			head = h.next;
			l.next = null;
			l = h;
			i = i * 2;
		}
		return head;
    }
}
