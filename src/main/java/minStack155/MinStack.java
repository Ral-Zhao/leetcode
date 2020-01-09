package minStack155;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class MinStack
{
	private Stack<Integer> stack;
	private Deque<Integer> queue = new ArrayDeque<>();
	public MinStack() 
	{
		stack = new Stack<>();
    }
    
    public void push(int x) 
    {
        stack.push(x);
        if(queue.isEmpty())
        {
        	queue.addLast(x);
        }
        else if(x <= queue.getFirst())
        {
        	queue.addFirst(x);
        }
        else
        {
        	queue.addLast(x);
        }
    }
    
    public void pop() 
    {
        Integer x = stack.peek();
        queue.removeFirstOccurrence(x);
        stack.pop();
    }
    
    public int top() 
    {
        return stack.peek();
    }
    
    public int getMin() 
    {
        return queue.getFirst();
    }
}
