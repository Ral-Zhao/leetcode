package sortList148;

public class Test
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		ListNode node1 = new ListNode(49);
		ListNode node2 = new ListNode(38);
		ListNode node3 = new ListNode(65);
		ListNode node4 = new ListNode(97);
		ListNode node5 = new ListNode(76);
		ListNode node6 = new ListNode(13);
		ListNode node7 = new ListNode(27);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		
		ListNode temp = s.sortList(node1);
		while(temp != null)
		{
			System.out.println(temp.val);
			temp = temp.next;
		}

	}
}
