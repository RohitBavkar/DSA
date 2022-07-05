package dsa.bit;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        //Take user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Binary Number");
        int binaryNo = sc.nextInt();
        int decimalNo = convertBinaryToDecimal(binaryNo);
        System.out.println("Decimal Number is : "+decimalNo);
    }

    private static int convertBinaryToDecimal(int binaryNo) {
        int counter = 0;
        int decimalNo = 0;
        while(binaryNo != 0){
            int digit = binaryNo % 10;
            decimalNo = decimalNo + (int)(digit * Math.pow(2, counter));
            binaryNo = binaryNo /10;
            counter++;
        }
        return decimalNo;
    }
}
