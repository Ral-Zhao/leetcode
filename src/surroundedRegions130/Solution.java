package surroundedRegions130;

import java.util.*;

/**
 * Created by zhaozhezijian on 2020/1/6.
 */
public class Solution {
    public void solve(char[][] board) {
        if (board == null || board.length <= 1 || board[0].length <= 1) {
            return;
        }

        Set<String> inValid = new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (!isBorder(i, j, board) || board[i][j] != 'O') {
                    continue;
                }
                Deque<String> stack = new ArrayDeque<>();
                Set<String> visited = new HashSet<>();
                stack.push(i + "," + j);
                while (!stack.isEmpty()) {
                    String string = stack.pop();
                    int iTemp = Integer.parseInt(string.split(",")[0]);
                    int jTemp = Integer.parseInt(string.split(",")[1]);
                    visited.add(string);
                    inValid.add(string);
                    if (iTemp - 1 >= 0 && board[iTemp - 1][jTemp] == 'O' && !visited.contains(iTemp - 1 + "," + jTemp)) {
                        stack.push(iTemp - 1 + "," + jTemp);
                    }
                    if (iTemp + 1 < board.length && board[iTemp + 1][jTemp] == 'O' && !visited.contains(iTemp + 1 + "," + jTemp)) {
                        stack.push(iTemp + 1 + "," + jTemp);
                    }
                    if (jTemp - 1 >= 0 && board[iTemp][jTemp - 1] == 'O' && !visited.contains(iTemp + "," + (jTemp - 1))) {
                        stack.push(iTemp + "," + (jTemp - 1));
                    }
                    if (jTemp + 1 < board[0].length && board[iTemp][jTemp + 1] == 'O' && !visited.contains(iTemp + "," + (jTemp + 1))) {
                        stack.push(iTemp + "," + (jTemp + 1));
                    }
                }
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'O' && !inValid.contains(i + "," + j)) {
                    board[i][j] = 'X';
                }
            }
        }

    }

    private boolean isBorder(int i, int j, char[][] board) {
        return i * j == 0 || i == board.length - 1 || j == board[0].length - 1;
    }
}
