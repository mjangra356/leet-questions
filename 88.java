//88. Merge Sorted Array

import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        int[] nums1 = {0};
        int[] nums2 = {1}; 
        mergeSorted(nums1,nums2,0,1);
    }
    static void mergeSorted(int[] nums1, int[] nums2,int m ,int n){
        int pa = m-1,pb = n-1;
        int a = m+n-1;
        while(pa >= 0 && pb >= 0){
            if(nums1[pa] > nums2[pb]){
                nums1[a--] =  nums1[pa--];
            }else{
                nums1[a--] = nums2[pb--];
            }
        }
        while(pb>=0){
            nums1[a--] = nums2[pb--];
        }
        System.out.println(Arrays.toString(nums1));
    }
}