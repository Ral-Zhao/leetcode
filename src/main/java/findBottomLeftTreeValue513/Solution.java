package findBottomLeftTreeValue513;

import java.util.Stack;

public class Solution
{
	 public int findBottomLeftValue(TreeNode root) 
	 {
		 Stack<TreeNode> stack = new Stack<>();
		 int depth = 1;
		 int maxDepth = 0;
		 TreeNode maxNode = root;
		 stack.push(root);
		 TreeNode temp = root;
		 while(temp.left != null)
		 {
			 stack.push(temp);
			 depth += 1;
			 temp = temp.left;
		 }
		 while(!stack.isEmpty())
		 {
			 if(depth > maxDepth)
			 {
				 maxDepth = depth;
				 maxNode = temp;
			 }
			 if(temp.right != null)
			 {
				 stack.push(temp.right);
				 depth += 1;
				 temp = temp.right;
				 while(temp.left != null)
				 {
					 stack.push(temp);
					 depth += 1;
					 temp = temp.left;
				 }
			 }
			 else
			 {
				 temp = stack.pop();
				 depth -= 1;
			 }
			 
			 
		 }
		 return maxNode.val;
		 
	 }
}
