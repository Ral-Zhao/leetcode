package serializeandDeserializeBinaryTree297;

import java.util.ArrayDeque;
import java.util.Queue;


public class Codec
{
	// Encodes a tree to a single string.
    public String serialize(TreeNode root) 
    {
    	if(root == null)
    		return "";
    	StringBuffer str = new StringBuffer();
    	Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        
        while(!queue.isEmpty())
        {
        	root = queue.poll();
        	if(root.left != null)
        		queue.add(root.left);
        	if(root.right != null)
        		queue.add(root.right);
        	if(root.left == null && root.right==null)
        		str.append(root.val+"z,");
        	if(root.left == null && root.right != null)
        		str.append(root.val+"r,");
        	if(root.right == null && root.left != null)
        		str.append(root.val+"l,");
        	if(root.left != null && root.right != null)
        		str.append(root.val+"t,");
        }
        str.delete(str.length()-1,str.length());
        return str.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data)
    {
    	if(data.equals(""))
    		return null;
    	String[] str = data.split(",");
    	TreeNode root = null;
    	Queue<TreeNode> que = new ArrayDeque<>();
    	Queue<TreeNode> que2 = new ArrayDeque<>();
    	Queue<String> queStr = new ArrayDeque<>();

    	for(int i=0;i<str.length;++i)
    	{
    		String s = str[i].substring(0,str[i].length()-1);
    		TreeNode node = new TreeNode(Integer.parseInt(s));
    		if(!isLeaf(str[i]))
    		{
    			queStr.add(str[i]);
    			que.add(node);
    		}
    		que2.add(node);
    	}
    	
    	root = que2.poll();
    	while(!que.isEmpty())
    	{
    		String cmp = queStr.poll();
    		TreeNode cur = que.poll();
    		if(cmp.endsWith("t"))
    		{
    			TreeNode left = que2.poll();
    			TreeNode right = que2.poll();
    			cur.left = left;
    			cur.right = right;
    		}
    		else if(cmp.endsWith("l"))
    		{
    			TreeNode left = que2.poll();
    			cur.left = left;
    		}
    		else if(cmp.endsWith("r"))
    		{
    			TreeNode right = que2.poll();
    			cur.right = right;
    		}
    		
    	}
        return root;
    }
    private boolean isLeaf(String str)
    {
    	return str.endsWith("z");
    }
}
