package implementStackusingQueues225;

import java.util.ArrayDeque;
import java.util.Queue;

public class MyStack
{
	private Queue<Integer> queue = new ArrayDeque<>();
	
 	public void push(int x) 
 	{
 		Integer data = new Integer(x);
        queue.add(data);
        while(queue.peek() != data)
        {
        	Integer temp = queue.remove();
        	queue.add(temp);
        }
    }

    public void pop() 
    {
        queue.poll();
    }

    public int top() 
    {
        return queue.peek();
    }

    public boolean empty() 
    {
    		return queue.isEmpty();
    }	
}
