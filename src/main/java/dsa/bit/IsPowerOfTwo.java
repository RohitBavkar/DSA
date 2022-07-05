package dsa.bit;

import java.util.Scanner;

public class IsPowerOfTwo {
    public static void main(String[] args) {
        //Take user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int no = sc.nextInt();
        System.out.println(isPowerOfTwo(no));
    }
    /*There's a nice bit-trick that can be used to check if a number is power of 2 efficiently.
    As already seen above, n will only have 1 set bit if it is power of 2. Then, we can AND (&) n and n-1 and if the result is 0, it is power of 2.
    This works because if n is power of 2 with ith bit set, then in n-1, i will become unset and all bits to right of i will become set.
    Thus, the result of AND will be 0.*/
    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & n - 1) == 0;
    }
    //pow(2,x)=n; i.e log(n)/log(2) = x;
    public static boolean isPowerOfTwo2(int n) {
        int power = (int)Math.round((Math.log(n) / Math.log(3)));
        return (n>0 && Math.pow(3, power) == n);
    }
}
