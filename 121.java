//121. Best Time to Buy and Sell Stock
import java.lang.Math;
class Main {
    public static void main(String[] args) {;
        // int[] nums = {7,2,1,5,3,6,4};
        int[] nums = {7,6,4,3,1};
        System.out.println(maxProfit(nums));
    }
    static int maxProfit(int[] nums){
        int maxP = 0;
        int n = nums.length;
        int i=0,j = 1;

        while(i < n && j < n){
            if(nums[j] - nums[i] >= 0){
                maxP = Math.max((nums[j] - nums[i]) , maxP);
                j++;
            }else{
                i++;j++;
            }
        }
        return maxP;
    }
}