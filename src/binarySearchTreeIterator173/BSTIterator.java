package binarySearchTreeIterator173;

import java.util.Stack;

public class BSTIterator
{
	private Stack<TreeNode> stack = new Stack<>();
	public BSTIterator(TreeNode root) {
        while(root != null)
        {
        	stack.push(root);
        	root = root.left;
        }
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return stack.isEmpty()? false : true;
    }

    /** @return the next smallest number */
    public int next() {
    	TreeNode result = stack.pop();
    	TreeNode temp = result.right;
    	while(temp != null)
    	{
    		stack.push(temp);
    		temp = temp.left;
    	}
        return result.val;
    }
}
