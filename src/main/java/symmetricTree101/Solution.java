package symmetricTree101;

public class Solution
{
	
	public boolean isSymmetric(TreeNode root) 
	{
        if(root == null)
        {
        	return true;
        }
        
        return symmetric(root.left,root.right);
    }
	
	public boolean symmetric(TreeNode node1, TreeNode node2)
	{
		if(node1 == null && node2 == null)
		{
			return true;
		}
		else if(node1 != null & node2 != null)
		{
			if(node1.val == node2.val)
			{
				boolean f1 = symmetric(node1.left,node2.right);
				boolean f2 = symmetric(node1.right,node2.left);
				return f1 && f2;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}
	
	
}
