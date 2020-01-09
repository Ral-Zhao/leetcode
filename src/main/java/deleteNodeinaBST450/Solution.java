package deleteNodeinaBST450;

public class Solution
{
	public TreeNode deleteNode(TreeNode root, int key) 
	{
		if(root == null)
		{
			return null;
		}
		if(root.val == key)
		{
			if(root.left == null && root.right == null)
			{
				return null;
				
			}
			if(root.left == null && root.right != null)
			{
				return root.right;
			}
			if(root.left != null && root.right == null)
			{
				return root.left;
			}
			
		}
        TreeNode temp = root;
        TreeNode prev = root;
        int dir = -1;
        while(temp != null && temp.val != key)
        {
        	prev = temp;
        	if(temp.val > key)
        	{
        		temp = temp.left;
        		dir = 0;
        	}
        	else if(temp.val < key)
        	{
        		temp = temp.right;
        		dir = 1;
        	}
        	
        }
        if(temp != null)
        {
            delete(prev,temp,dir);

        }
        return root;
    }
	private void delete(TreeNode prev,TreeNode root,int dir)
	{
		if(root.left == null && root.right == null)
		{
			if(dir == 0)
			{
				prev.left = null;
			}
			else
			{
				prev.right = null;
			}
			return;
		}
		if(root.left == null && root.right != null)
		{
			if(dir == 0)
			{
				prev.left = root.right;
			}
			else
			{
				prev.right = root.right;
			}
			return;
		}
		if(root.left != null && root.right == null)
		{
			if(dir == 0)
			{
				prev.left = root.left;
			}
			else
			{
				prev.right = root.left;
			}			
			return;
		}
		TreeNode temp = root.left;
		TreeNode prevs = root;
		int t = 0;
		while(temp.right != null)
		{
			if(t == 0)
			{
				t = 1;
			}
			prevs = temp;
			temp = temp.right;
		}
		root.val = temp.val;
		delete(prevs,temp,t);
	}
}
