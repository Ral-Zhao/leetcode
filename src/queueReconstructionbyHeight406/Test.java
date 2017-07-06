package queueReconstructionbyHeight406;

public class Test
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		int[][] people = new int[][]{
			{7,0},{4,4},{7,1},{5,0},{6,1},{5,2},
			
		};
		
		int[][] result = s.reconstructQueue(people);
		for(int i=0;i<result.length;i++)
		{
			System.out.println(result[i][0]+","+result[i][1]);
		}
	}
}
