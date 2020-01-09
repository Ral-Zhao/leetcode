package constructBinaryTreefromPreorderandInorderTraversal105;

public class Solution
{
	private int[] pre;
	private int[] in;
	 public TreeNode buildTree(int[] preorder, int[] inorder) 
	 {
		 this.in = inorder;
		 this.pre = preorder;
		 return build(0,0,in.length-1);
	 }
	 private TreeNode build(int start1, int start2, int end2)
	 {
		 if(start2 == end2)
		 {
			 return new TreeNode(in[start2]);
		 }
		 boolean isIn = false;
		 TreeNode node = null;
		 for(int i=start1;i<pre.length;++i)
		 {
			 for(int j=start2;j<=end2;++j)
			 {
				if(pre[i] == in[j])
				{
					isIn = true;
					node = new TreeNode(pre[i]);
					node.left = build(i+1,start2,j-1);
					node.right = build(i+1,j+1,end2);
					break;
				}
			
			 }
			 if(isIn == true)
				 break;
		 }
		 return node;
	 }
}
