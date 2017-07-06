package diagonalTraverse498;

public class Test
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		int[][] arr = new int[][]{
			{1,2,3,4},
			{5,6,7,8},
//			{7,8,9},
//			{10,11,12},

		};
		
		int[] result = s.findDiagonalOrder(arr);
		for(int n : result)
		{
			System.out.println(n);
		}
	}
}
