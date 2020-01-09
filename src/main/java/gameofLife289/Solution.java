package gameofLife289;

/**
 * Created by Zhao Zhe on 2017/9/21.
 */
public class Solution {
    public void gameOfLife(int[][] board) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                int sum = count(board,i,j);
                if(sum < 2 || sum > 3) {
                    continue;
                }
                if((board[i][j]&1) == 0){
                    if(sum == 2)
                        continue;
                }
                board[i][j] = board[i][j]|(1<<1);

            }

        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = board[i][j]>>1;

            }

        }

    }

    private int helper(int[][] nums, int i, int j){
        if(i < 0 || i > nums.length-1 || j<0 || j>nums[0].length-1)
            return 0;
        return nums[i][j]&1;
    }
    private int count(int[][] nums,int i, int j){
        int sum = helper(nums,i-1,j-1) + helper(nums,i-1,j) + helper(nums,i-1,j+1)+
                helper(nums,i,j-1)+helper(nums,i,j+1)+helper(nums,i+1,j-1)+
                helper(nums,i+1,j)+helper(nums,i+1,j+1);
        return sum;
    }
}
