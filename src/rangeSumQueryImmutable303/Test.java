package rangeSumQueryImmutable303;

public class Test
{
	public static void main(String[] args)
	{
		int[] arr = new int[]{1,5,3,2,6};
		
		NumArray numArray = new NumArray(arr);
		System.out.println(numArray.sumRange(3,3));
	}
}
