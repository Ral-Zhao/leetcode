package cloneGraph133;

import java.util.*;

/**
 * Given a reference of a node in a connected undirected graph, return a deep copy (clone) of the graph.
 * Each node in the graph contains a val (int) and a list (List[Node]) of its neighbors.
 * <p>
 * Note:
 * <p>
 * The number of nodes will be between 1 and 100.
 * The undirected graph is a simple graph, which means no repeated edges and no self-loops in the graph.
 * Since the graph is undirected, if node p has node q as neighbor, then node q must have node p as neighbor too.
 * You must return the copy of the given node as a reference to the cloned graph.
 */
public class Solution {
    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        Map<Node, Node> map = new HashMap<>();
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            Node temp = queue.poll();
            Node clone = map.get(temp);
            if (clone == null) {
                clone = new Node();
                clone.val = temp.val;
                map.put(temp, clone);
            }
            if (temp.neighbors != null) {
                List<Node> list = new ArrayList<>();
                for (Node neighbor : temp.neighbors){
                    if (!map.containsKey(neighbor)){
                        queue.add(neighbor);
                    }
                    Node cloneNeighbor = map.get(neighbor);
                    if (cloneNeighbor == null){
                        cloneNeighbor = new Node();
                        cloneNeighbor.val = neighbor.val;
                        map.put(neighbor,cloneNeighbor);
                    }
                    list.add(cloneNeighbor);
                }
                clone.neighbors = list;
            }

        }

        return map.get(node);
    }
}
