//2965. Find Missing and Repeated Values

import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        int[][] nums = {{{9,1,7},{8,9,2},{3,4,6}}};
        // int[][] nums = {{1,3},{2,2}};
        System.out.println(Arrays.toString(findRepMis(nums)));
    }
    static int[] findRepMis(int[][] grid){
        //mathematical approach
        int n = grid.length;
        int size = n*n;
        int actSum = 0, actSqSum = 0, expSum = 0 , expSqSum = 0;
        int rep = 0, mis = 0;
        for(int[] row : grid){
            for(int num : row){
                actSum += num;
                actSqSum += num*num;
            }
        }
        expSum = size * (size + 1)/2;
        expSqSum = size * (size + 1) * (2 * size + 1)/6;

        int diff = actSum - expSum;
        int diffSq = actSqSum - expSqSum;

        int sum = diffSq/diff;
        rep = (sum + diff)/2;
        mis = sum - rep;

        return new int[]{rep,mis};

    }
}