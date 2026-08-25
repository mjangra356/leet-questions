//53. Maximum Subarray
//using Kadane's algo
// which says that is currSum becomes negative, make it 0

import java.lang.Math;
class Main {
    public static void main(String[] args) {;
        int[] nums = {5,4,-1,7,8};
        // int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSum(nums));
    }
    static int maxSum(int[] nums){
        int maxSum = 0 , currSum = 0;
        for(int num : nums){
            currSum += num;
            maxSum = Math.max(currSum, maxSum);
            if(currSum < 0){
                currSum = 0;
            }
        }
        return maxSum;
    }
}