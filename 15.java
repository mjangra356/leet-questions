//15. 3Sum

import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] nums = {0,0,0};
        // int[] nums = {0,1,1};
        // int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(triplets(nums));
    }

    static List<List<Integer>> triplets(int[] nums){
        //O(n^2)
        // List<List<Integer>> ans = new ArrayList<>();
        // Set<List<Integer>> unique = new HashSet<>();
        int n = nums.length;
        // for(int i=0;i<n;i++){
        //     Set<Integer> seen = new HashSet<>();
        //     for(int j=i+1;j<n;j++){
        //         int third = -nums[i]-nums[j];
        //         if(seen.contains(third)){
        //             List<Integer> trip = Arrays.asList(nums[i],nums[j],third);
        //             Collections.sort(trip);
        //             unique.add(trip);
        //         }
        //         seen.add(nums[j]);
        //     }
        // }
        // ans.addAll(unique);
        // return ans;

        //more optimized approach
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
            //skip duplicates
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }

            int left = i+1;
            int right  = n-1;

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    ans.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                    while(left<right && nums[left] == nums[left-1]){
                        left++;
                    }
                    while(left  < right && nums[right] == nums[right+1]){
                        right--;
                    }
                }else if(sum > 0){
                    right--;
                }else{
                    left++;
                }
            }
        }
        return ans;
    }
}