package targetSum494;

public class Solution
{
	 public int findTargetSumWays(int[] nums, int S)
	 {
		 int n = nums.length;
		 int start = (int)Math.pow(2,n)-1;
		 int end = (int)Math.pow(2,n+1)-1;
		 int sum = 0;
		 int[] list = new int[end];
		 list[0] = 0;
		 int num = 1;
		 for(int i=1;i<=n;++i)
		 {
			 int inner = (int)Math.pow(2,i);
			 for(int j=0;j<inner;++j)
			 {
				 if(j % 2 == 0)
				 {
					 list[num] = nums[i-1] + list[(num-1)/2];
				 }
				 else
				 {
					 list[num] =  list[(num-1)/2]-nums[i-1];
				 }
				 num += 1;
			 }
		 }
		 for(int i=start;i<end;++i)
		 {
			 
			 if(list[i] == S)
			 {
				 sum += 1;
			 }
			 
		 }
		 return sum;
	 }
}
