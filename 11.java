//11. Container With Most Water

import java.lang.Math;
class Main {
    public static void main(String[] args) {
        // int[] heights = {1,8,6,2,5,4,8,3,7};
        int[] heights = {1,1};
        System.out.println(maxWater(heights));
    }

    static int maxWater(int[] heights){
        int n = heights.length;
        int left = 0, right = n-1;
        int maxWater = Integer.MIN_VALUE;
        while(left < right){
            int h = Math.min(heights[left], heights[right]);
            int w = right - left;
            maxWater = Math.max(h * w , maxWater);
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxWater;
    }
}