package dsa.bit;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        //Take user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Decimal Number");
        int decimalNo = sc.nextInt();
        String binaryNo = convertDecimalToBinary(decimalNo);
        System.out.println("Binary Number is : "+binaryNo);
    }
    private static String convertDecimalToBinary(int decimalNo) {
        StringBuilder binaryNo = new StringBuilder();
        int counter = 0;
        while(decimalNo != 0){
            int digit = decimalNo & 1;
            binaryNo.insert(0, digit);
            decimalNo = decimalNo >>> 1;
            counter++;
        }
        return binaryNo.toString();
    }
}
