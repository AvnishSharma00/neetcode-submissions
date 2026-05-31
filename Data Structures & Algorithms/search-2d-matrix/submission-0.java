class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
           int row=matrix.length;
           int col=matrix[0].length;
           int start=0;
           int end=row*col-1;
           while(start<=end){
                int mid=start+(end-start)/2;
                int row1=mid/col;
                int col1=mid%col;
                if(matrix[row1][col1]==target){
                    return true;
                }else if(matrix[row1][col1]<target){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
           }
           return false;
    }
}
