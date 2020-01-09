package cloneGraph133;

import java.util.List;

/**
 * Created by zhaozhezijian on 2020/1/9.
 */
public class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {}

    public Node(int val,List<Node> neighbors) {
        this.val = val;
        this.neighbors = neighbors;
    }
}
