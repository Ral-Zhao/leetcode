package implementQueueusingStacks232;

public class Test
{
	public static void main(String[] args)
	{
		MyQueue queue = new MyQueue();
		queue.push(12);
		queue.push(34);
		queue.push(56);
		
		System.out.println(queue.peek());
		queue.pop();
		System.out.println(queue.peek());
	}
}
