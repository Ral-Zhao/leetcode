package populatingNextRightPointersinEachNode116;

import java.util.ArrayDeque;
import java.util.Queue;

public class Solution
{
	public void connect(TreeLinkNode root) 
	{
		if(root == null)
		{
			return;
		}
		Queue<TreeLinkNode> que = new ArrayDeque<>();
		que.add(root);
		while(!que.isEmpty())
		{
			
			int size = que.size();
			for(int i=1;i<=size;++i)
			{
				TreeLinkNode temp = que.poll();
				TreeLinkNode next = que.peek();
				if(i != size)
				{
					temp.next = next;
				}
				if(temp.left != null)
					que.add(temp.left);
				if(temp.right != null)
					que.add(temp.right);
			}
		}
		
    }
}
