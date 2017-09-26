package searcha2DMatrix74;

/**
 * Created by zhaozhezijian on 2017/9/26.
 */
public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix == null)
            return false;
        if(matrix[0].length == 0)
            return false;
        int row = -1;
        if(target<matrix[0][0] || target > matrix[matrix.length-1][matrix[0].length-1])
            return false;
        for (int i = 0; i < matrix.length; i++) {
            if(matrix[i][0] <= target && target<=matrix[i][matrix[0].length-1]){
                row = i;
                break;
            }
        }
        if(row < 0)
            return false;

        return binarySearch(matrix,row,target);

    }

    private boolean binarySearch(int[][] matrix,int row,int target){
        int start = 0;
        int end = matrix[0].length;
        while(start<=end){
            int mid = (start+end)/2;
            if(matrix[row][mid] > target){
                end = mid-1;
            }else if(matrix[row][mid] < target){
                start = mid+1;
            }else {
                return true;
            }
        }
        return false;

    }
}
