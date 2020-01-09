package convertSortedArraytoBinarySearchTree108;

public class Solution
{
	public TreeNode sortedArrayToBST(int[] nums) 
	{
		if(nums.length == 0)
		{
			return null;
		}
		int n = nums.length/2+nums.length%2-1;
		TreeNode root = new TreeNode(nums[n]);
		root.left = helper(nums,0,n-1);
		root.right = helper(nums,n+1,nums.length-1);
		return root;
    }
	private TreeNode helper(int[] list, int start,int end)
	{
		if(start > end)
		{
			return null;
		}
		if(start == end)
		{
			return new TreeNode(list[start]);
		}
		else
		{
			TreeNode root = new TreeNode(list[(start + end)/2]);
			root.left = helper(list,start,(start + end)/2-1);
			root.right = helper(list,(start + end)/2+1,end);
			return root;
		}
	}
}
