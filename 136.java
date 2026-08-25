//136. Single Number

class Main {
    public static void main(String[] args) {
        // int[] nums = {2,2,1};
        // int[] nums = {4,1,2,1,2};
        int[] nums = {1};
        System.out.println(findSingle(nums));
    }
    static int findSingle(int[] nums){
        int sig = 0;
        for(int num : nums){
            sig ^= num;
        }
        return sig;
    }
}