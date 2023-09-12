import java.util.*;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int number, decimal;
        int binary = 0;
        boolean isCurrentlyDecimal;
        boolean tryAgain = true;
        while(tryAgain){
            System.out.println("Decimal/Bit Conversion");
            System.out.print("Please enter a number with no spaces: ");
            number = input.nextInt();
            input.nextLine();
            isCurrentlyDecimal = isCurrentlyDecimal();
            if (isCurrentlyDecimal){
                decimal = number;
                binary = Integer.valueOf(convertToBinary(decimal));
            } else {
                binary = number;
                decimal = convertToDecimal(binary);
            }
            System.out.println("Your binary number is: " + binary);
            System.out.println("Your decimal number is: " + decimal);
            System.out.println("Try again (Y, N)? ");
            String tryAgainChoice = input.nextLine();
            if (tryAgainChoice.equals("N")){
                tryAgain = false;
            }
        }
    }
    public static boolean isCurrentlyDecimal(){
        while (true){
            System.out.print("Are you converting to decimal format or binary format? ");
            String decision = input.nextLine();
            if (decision.equals("decimal")) {
                return false;
            } else if (decision.equals("binary")){
                return true;
            } else {
                System.out.println("Invalid choice.");
                System.out.println("Please type \"decimal\" or \"binary\".");
            }
        }
    }
    public static int convertToDecimal(int binaryNumber){
        int currentBitValue = 0;
        int decimalNumber = 0;
        int bits = String.valueOf(binaryNumber).length();
        for(int i=0; i<bits ; i++){
            if (i == 0) {
                currentBitValue = binaryNumber % 10;
                decimalNumber = currentBitValue * 1;
                binaryNumber = binaryNumber / 10;
            } else if (i == 1) {
                currentBitValue = binaryNumber % 10;
                decimalNumber = decimalNumber + currentBitValue * 2;
                binaryNumber = binaryNumber / 10;
            } else if (i == 2) {
                currentBitValue = binaryNumber % 10;
                decimalNumber = decimalNumber + currentBitValue * 4;
                binaryNumber = binaryNumber / 10;
            } else if (i == 3) {
                currentBitValue = binaryNumber % 10;
                decimalNumber = decimalNumber + currentBitValue * 8;
                binaryNumber = binaryNumber / 10;
            } else if (i == 4) {
                currentBitValue = binaryNumber % 10;
                decimalNumber = decimalNumber + currentBitValue * 16;
                binaryNumber = binaryNumber / 10;
            } else if (i == 5) {
                currentBitValue = binaryNumber % 10;
                decimalNumber = decimalNumber + currentBitValue * 32;
                binaryNumber = binaryNumber / 10;
            } else if (i == 6) {
                currentBitValue = binaryNumber % 10;
                decimalNumber = decimalNumber + currentBitValue * 64;
                binaryNumber = binaryNumber / 10;
            } else if (i == 7) {
                currentBitValue = binaryNumber % 10;
                decimalNumber = decimalNumber + currentBitValue * 128;
                binaryNumber = binaryNumber / 10;
            }
        }
        return decimalNumber;
    }
    public static String convertToBinary(int decimalNumber){
        String binaryNumber = "";
        while (decimalNumber > 0) {
            if (decimalNumber / 1024 > 0) {
                binaryNumber = "1";
                decimalNumber = decimalNumber - 1024;
            } else {
                binaryNumber = binaryNumber + "0";
            }
            if (decimalNumber / 512 > 0) {
                binaryNumber = "1";
                decimalNumber = decimalNumber - 512;
            } else {
                binaryNumber = binaryNumber + "0";
            }
            if (decimalNumber / 256 > 0) {
                binaryNumber = "1";
                decimalNumber = decimalNumber - 256;
            } else {
                binaryNumber = binaryNumber + "0";
            }
            if (decimalNumber / 128 > 0) {
                binaryNumber = "1";
                decimalNumber = decimalNumber - 128;
            } else {
                binaryNumber = binaryNumber + "0";
            }
            if (decimalNumber / 64 > 0) {
                binaryNumber = binaryNumber + "1";
                decimalNumber = decimalNumber - 64;
            } else {
                binaryNumber = binaryNumber + "0";
            }
            if (decimalNumber / 32 > 0) {
                binaryNumber = binaryNumber + "1";
                decimalNumber = decimalNumber - 32;
            } else {
                binaryNumber = binaryNumber + "0";
            }
            if (decimalNumber / 16 > 0){
                binaryNumber = binaryNumber + "1";
                decimalNumber = decimalNumber - 16;
            } else {
                binaryNumber = binaryNumber + "0";
            }
            if (decimalNumber / 8 > 0){
                binaryNumber = binaryNumber + "1";
                decimalNumber = decimalNumber - 8;
            } else {
                binaryNumber = binaryNumber + "0";
            }
            if (decimalNumber / 4  > 0){
                binaryNumber = binaryNumber + "1";
                decimalNumber = decimalNumber - 4;
            } else {
                binaryNumber = binaryNumber + "0";
            }
            if (decimalNumber / 2 > 0){
                binaryNumber = binaryNumber + "1";
                decimalNumber = decimalNumber - 2;
            } else {
                binaryNumber = binaryNumber + "0";
            }
            if (decimalNumber / 1 > 0){
                binaryNumber = binaryNumber + "1";
                decimalNumber = decimalNumber - 1;
            } else {
                binaryNumber = binaryNumber + "0";
            }
        }
    return binaryNumber;
    }
}
