//74. Search a 2D Matrix

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int idx = -1;
        int lr = 0 , rr = m-1;
        while(lr <= rr){
            int mr = lr + (rr - lr)/2;
            if(target >= matrix[mr][0] && target <= matrix[mr][n-1]){
                idx = mr;
                break;
            }else if(target < matrix[mr][0]){
                rr = mr-1;
            }else{
                lr = mr+1;
            }
        }
        if(idx == -1){
                return false;
            }

        int left = 0 , right = n-1;
        
        while(left <= right){
            int mid = left + (right-left)/2;
            if(target == matrix[idx][mid]){
                return true;
            }else if(target < matrix[idx][mid]){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return false;
    }
}