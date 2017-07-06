package partitionList86;

public class Test
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		ListNode node1 = new ListNode(2);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(4);
		ListNode node4 = new ListNode(5);
		ListNode node5 = new ListNode(1);
		ListNode node6 = new ListNode(3);
		ListNode node7 = new ListNode(7);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		ListNode temp = s.partition(node1,1);
		while(temp != null)
		{
			System.out.println(temp.val);
			temp = temp.next;
		}

	}
}
