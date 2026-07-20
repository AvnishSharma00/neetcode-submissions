class Solution {
    public int maxSubarraySumCircular(int[] arr) {
        int total=0;
        int maxSum=arr[0];
        int currMaxSum=0;
        int minSum=arr[0];
        int currMinSum=0;
        for(int i=0;i<arr.length;i++){
            currMaxSum=Math.max(arr[i],arr[i]+currMaxSum);
            maxSum=Math.max(currMaxSum,maxSum);

            currMinSum=Math.min(arr[i],arr[i]+currMinSum);
            minSum=Math.min(currMinSum,minSum);

            total+=arr[i];
            
        }
        if(maxSum<0){
            return maxSum;
        }
        return Math.max(maxSum,total-minSum);
    }
}