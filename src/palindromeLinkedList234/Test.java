package palindromeLinkedList234;

public class Test
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		ListNode l1 = new ListNode(0);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(2);
		ListNode l4 = new ListNode(0);
		ListNode l5 = new ListNode(1);
		
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		
		System.out.println(s.isPalindrome(l1));
	}
}
