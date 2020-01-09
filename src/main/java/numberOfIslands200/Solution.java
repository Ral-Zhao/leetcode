package numberOfIslands200;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null){
            return 0;
        }
        Set<String> visited = new HashSet<>();
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '0' || visited.contains(i+","+j)){
                    continue;
                }
                Deque<String> stack = new ArrayDeque<>();
                stack.push(i + "," + j);
                while (!stack.isEmpty()) {
                    String string = stack.pop();
                    int iTemp = Integer.parseInt(string.split(",")[0]);
                    int jTemp = Integer.parseInt(string.split(",")[1]);
                    visited.add(string);
                    if (iTemp - 1 >= 0 && grid[iTemp - 1][jTemp] == '1' && !visited.contains(iTemp - 1 + "," + jTemp)) {
                        stack.push(iTemp - 1 + "," + jTemp);
                    }
                    if (iTemp + 1 < grid.length && grid[iTemp + 1][jTemp] == '1' && !visited.contains(iTemp + 1 + "," + jTemp)) {
                        stack.push(iTemp + 1 + "," + jTemp);
                    }
                    if (jTemp - 1 >= 0 && grid[iTemp][jTemp - 1] == '1' && !visited.contains(iTemp + "," + (jTemp - 1))) {
                        stack.push(iTemp + "," + (jTemp - 1));
                    }
                    if (jTemp + 1 < grid[0].length && grid[iTemp][jTemp + 1] == '1' && !visited.contains(iTemp + "," + (jTemp + 1))) {
                        stack.push(iTemp + "," + (jTemp + 1));
                    }
                }
                count+=1;

            }
        }

        return count;
    }
}
