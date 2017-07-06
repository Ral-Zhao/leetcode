package constructBinaryTreefromInorderandPostorderTraversal106;


public class Solution
{
	private int[] post;
	private int[] in;
	public TreeNode buildTree(int[] inorder, int[] postorder) 
	{
		 this.in = inorder;
		 this.post = postorder;
		 return build(post.length-1,0,in.length-1);
    }
	private TreeNode build(int start1, int start2, int end2)
	 {
		 if(start2 == end2)
		 {
			 return new TreeNode(in[start2]);
		 }
		 boolean isIn = false;
		 TreeNode node = null;
		 for(int i=start1;i>=0;--i)
		 {
			 for(int j=start2;j<=end2;++j)
			 {
				if(post[i] == in[j])
				{
					isIn = true;
					node = new TreeNode(post[i]);
					
					node.right = build(i-1,j+1,end2);
					node.left = build(i-1,start2,j-1);
					break;
				}
			
			 }
			 if(isIn == true)
				 break;
		 }
		 return node;
	 }
}
