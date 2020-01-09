package rotateArray189;

public class Test
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		int[] arr = new int[]{1,2,3,4,5,6};
		
		s.rotate(arr,3);
		for(int i=0;i<arr.length;++i)
		{
			System.out.println(arr[i]);
		}
	}
}
