package copyListwithRandomPointer138;

import java.util.ArrayList;
import java.util.List;

public class Solution
{
	public RandomListNode copyRandomList(RandomListNode head) 
	{
		if(head == null)
		{
			return null;
		}
        RandomListNode temp = head;
        List<RandomListNode> list = new ArrayList<>();
        
        while(temp != null)
        {
        	list.add(temp);
        	temp = temp.next;
        }
        RandomListNode[] arr = new RandomListNode[list.size()];
        for(int i=0;i<list.size();++i)
        {
        	arr[i] = new RandomListNode(list.get(i).label);
        }
        for(int i=0;i<list.size()-1;++i)
        {
        	arr[i].next = arr[i+1];
        }
        for(int i=0;i<list.size();++i)
        {
        	RandomListNode t = list.get(i);
        	if(t.random == null)
        	{
        		arr[i].random = null;
        	}
        	else
        	{
        		int index = list.indexOf(t.random);
        		arr[i].random = arr[index];
        	}
        }
        
        return arr[0];
    }
}
