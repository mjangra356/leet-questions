//50. Pow(x, n)
//Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

import java.lang.Math;
class Main {
    public static void main(String[] args) {;
        // System.out.println(pow(2.00000, 10));
        // System.out.println(pow(2.10000, 3));
        System.out.println(pow(2.00000, -2));
    }
    static double pow(double x, int n){
        if(n == 0) return 1.0;
        if(n == 1) return x;
        if(x == 0) return 0;
        if(x == 1) return 1.0;
        if(x == -1 && n%2 == 0) return 1.0;
        if(x == -1 && n%2 != 0) return -1.0;
        
        if(n < 0){
            x = 1/x;
            n = -n;
        }

        long bitForm = n;
        double ans = 1;
        while(bitForm > 0){
            if(bitForm % 2 == 1){
                ans *= x;
            }
            x *= x;
            bitForm /= 2;
        }
        return ans;
    }
}