//31. Next Permutation

import java.util.*;
class Main{
    public static void main(String[] args){
        int[] nums = {1,1,5}; 
        nextPerm(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void nextPerm(int[] nums){
        int n = nums.length;
        int i = n-2;
        while(i>=0 && nums[i] >= nums[i+1]){
            i--;
        }
        if(i>=0){
            int j = n-1;
            while(nums[j] <= nums[i]){
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i+1, n-1);
    }
    static void swap(int[] nums, int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    static void reverse(int[] nums, int i ,  int j){
        while(i<j){
            swap(nums, i++, j--);
        }
    }
}