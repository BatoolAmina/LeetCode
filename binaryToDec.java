class Main {
    public static int binaryToDec(int bin) {
        int dec = 0;
        int pow = 0;
        while(bin > 0) {
            int lastdigit = bin % 10;
            dec = dec + (lastdigit * (int)Math.pow(2, pow));
            pow++;
            bin = bin / 10;
        }
        return dec;
    }
    public static void main(String[] args) {
        int binaryNum = 100;
        int decimalNumber = binaryToDec(binaryNum);
        System.out.println("Decimal number is: " + decimalNumber);
    }
}
