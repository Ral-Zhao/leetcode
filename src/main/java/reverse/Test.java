package reverse;

public class Test
{
	public static void main(String[] args)
	{
		TestReverse t = new TestReverse();
		String str = t.reverse("hello world");
		
		System.out.println(str);
	}
}
