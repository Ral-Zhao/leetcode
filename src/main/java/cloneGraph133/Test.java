package cloneGraph133;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhaozhezijian on 2020/1/9.
 */
public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();

        Node a = new Node();
        a.val = 1;
        Node b = new Node();
        b.val = 2;
        Node c = new Node();
        c.val = 3;
        Node d = new Node();
        d.val = 4;
        Node e = new Node();
        e.val = 5;

        List<Node> aNeighbor = new ArrayList<>();
        aNeighbor.add(b);
        aNeighbor.add(e);
        a.neighbors = aNeighbor;

        List<Node> bNeighbor = new ArrayList<>();
        bNeighbor.add(a);
        bNeighbor.add(c);
        b.neighbors = bNeighbor;

        List<Node> cNeighbor = new ArrayList<>();
        cNeighbor.add(b);
        cNeighbor.add(d);
        cNeighbor.add(e);
        c.neighbors = cNeighbor;

        List<Node> dNeighbor = new ArrayList<>();
        dNeighbor.add(e);
        dNeighbor.add(c);
        d.neighbors = dNeighbor;

        List<Node> eNeighbor = new ArrayList<>();
        eNeighbor.add(a);
        eNeighbor.add(c);
        eNeighbor.add(d);
        e.neighbors = eNeighbor;

        System.out.println(JSON.toJSONString(a));

        Node clone = solution.cloneGraph(a);
        System.out.println(JSON.toJSONString(clone));



    }
}
