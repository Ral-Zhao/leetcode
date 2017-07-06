package palindromeLinkedList234;

public class Solution
{
	public boolean isPalindrome(ListNode head)
	{
		if(head == null)
		{
			return true;
		}
		if(head.next == null)
		{
			return true;
		}
		
		int sum = 0;
		
		ListNode temp = head;
		
		while(temp != null)
		{
			sum += 1;
			temp = temp.next;
		}
		
		int[] arr = new int[sum/2];
		
		int mid = sum/2;
		int i = 0;
		temp = head;
		int j = 0;
		while(temp != null)
		{
			if(i < mid)
			{
				arr[i] = temp.val;
				temp = temp.next;
				i++;
				j = i-1;
				continue;
			}
			
			if(sum % 2 == 1)
			{
				temp = temp.next;
				sum = 0;
				continue;
			}
			if(temp.val == arr[j])
			{
				temp = temp.next;
				j -= 1;
				continue;
			}
			else
			{
				return false;
			}
			
			
		}
		return true;
		
		
    }
}
