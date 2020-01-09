package implementStackusingQueues225;

public class Test
{
	public static void main(String[] args)
	{
		MyStack stack = new MyStack();
		System.out.println(stack.empty());
		stack.push(1);
		stack.push(2);
		stack.push(1);
		stack.push(2);
		stack.push(2);
		
		while(stack.empty() == false)
		{
			System.out.println(stack.top());
			stack.pop();
		}
	}
}
