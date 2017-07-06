package removeElement27;

public class Test
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		int[] arr = new int[]{1,2};
		
		int temp = s.removeElement(arr,2);
		System.out.println(temp);
		for(int i=0;i<temp;++i)
		{
			System.out.println(arr[i]);
		}
	}
}
