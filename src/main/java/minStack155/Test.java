package minStack155;

public class Test
{
	public static void main(String[] args)
	{
		MinStack stack = new MinStack();
		stack.push(0);
		stack.push(3);
		stack.push(-3);
		stack.push(-5);
		System.out.println(stack.getMin());
		stack.pop();
		System.out.println(stack.getMin());
		stack.pop();
		System.out.println(stack.getMin());
	}
}
