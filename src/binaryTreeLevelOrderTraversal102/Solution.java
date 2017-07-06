package binaryTreeLevelOrderTraversal102;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;


public class Solution
{
	public List<List<Integer>> levelOrder(TreeNode root) 
	{
		List<List<Integer>> list = new ArrayList<>();
		
        if(root == null)
        {
        	return list;
        }
        
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        List<TreeNode> arr = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>(); 
        arr2.add(1);
        int temp = 0;
        
        while(queue.isEmpty() == false)
        {
        	root = queue.poll();
        	arr.add(root);
        	
        	if(root.left != null)
        	{
        		queue.add(root.left);
        		temp = arr2.get(arr.indexOf(root));
        		arr2.add(temp+1);
        	}
        	if(root.right != null)
        	{
        		queue.add(root.right);
        		temp = arr2.get(arr.indexOf(root));
        		arr2.add(temp+1);
        	}
        	
        }
		
        int layer = 0;
        List<Integer> list2 = new ArrayList<>();
        for(int j=0;j<arr.size();++j)
        {
        	
        	if(arr2.get(j) != layer)
        	{
        		list.add(list2);
        		list2 = new ArrayList<>();
        		layer += 1;
        	}
        		
        		list2.add(arr.get(j).val);
        	
        }
        list.add(list2);
        list.remove(0);
		
		return list;
    }
}
