//75. Sort Colors

//will use Dutch National Flag algo
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        // int[] nums = {2,0,2,1,1,0};
        int[] nums = {2,0,1};
        sortColors(nums);
    }

    static void sortColors(int[] nums){
        int n = nums.length;
        int low = 0, mid = 0, high = n-1;
        while(mid <= high){
            if(nums[mid] == 0){
                swap(nums, low, mid);
                    low++;
                    mid++;
                }
            else if(nums[mid] == 1){
                mid++;
            }else{
                swap(nums, mid, high);
                    high--;
                } 
        }
        System.out.println(Arrays.toString(nums));
    }

    static void swap(int[] nums, int m, int n){
        int temp = nums[m];
        nums[m] = nums[n];
        nums[n] = temp;
    }
}