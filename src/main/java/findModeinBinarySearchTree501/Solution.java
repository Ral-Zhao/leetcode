package findModeinBinarySearchTree501;

import java.util.ArrayList;
import java.util.List;

public class Solution
{
	private List<Integer> list = new ArrayList<>();
	public int[] findMode(TreeNode root) 
	{
		if(root == null)
		{
			return new int[]{};
		}
        order(root);
        int max = 0;
        int count = 0;
        int curr = list.get(0);
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<list.size();++i)
        {
        	if(list.get(i) == curr)
        	{
        		count += 1;
        		if(i == list.size()-1)
        		{
        			if(count > max)
            		{
            			max = count;
            		}
        		}
        	}
        	else
        	{
        		if(count > max)
        		{
        			max = count;
        		}
        		count = 1;
        		curr = list.get(i);
        	}
        }
        count = 0;
        curr = list.get(0);
        System.out.println(max);
        for(int i=0;i<list.size();++i)
        {
        	if(list.get(i) == curr)
        	{
        		count += 1;
        	}
        	else
        	{
        		count = 1;
        		curr = list.get(i);
        	}
        	if(count == max)
        	{
        		result.add(list.get(i));
        	}
        	
        }
        int[] arr = new int[result.size()];
        for(int i=0;i<arr.length;++i)
        {
        	arr[i] = result.get(i);
        }
        return arr;
    }
	private void order(TreeNode root)
	{
		if(root.left==null && root.right==null)
		{
			list.add(root.val);
			return;
		}
		if(root.left != null)
		{
			order(root.left);
		}
		list.add(root.val);
		if(root.right != null)
		{
			order(root.right);
		}
	}
	
}
