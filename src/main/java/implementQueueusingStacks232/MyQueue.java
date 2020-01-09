package implementQueueusingStacks232;

import java.util.Stack;

public class MyQueue
{
	private Stack<Integer> stack = new Stack<>();
    public void push(int x) 
    {
    	Stack<Integer> temp = new Stack<>();
    	
    	while(stack.isEmpty() == false)
    	{
    		int i = stack.pop();
    		temp.push(i);
    	}
    	stack.push(x);
    	while(temp.isEmpty() == false)
    	{
    		int i = temp.pop();
    		stack.push(i);
    	}
    	
    }

    public void pop()
    {
        stack.pop();
    }

    public int peek() 
    {
        return stack.peek();
    }

    public boolean empty()
    {
        return stack.isEmpty();
    }
}
