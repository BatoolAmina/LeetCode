class Main {
    public static int DecToBin(int dec) {
        int bin = 0, pow = 0;
        while(dec > 0) {
            int div = dec % 2;
            bin = bin + (div * (int)Math.pow(10, pow));
            pow++;
            dec = dec / 2;
        }
        return bin;
    }
    public static void main(String[] args) {
        int decimalNum = 5;
        int binaryNumber = DecToBin(decimalNum);
        System.out.println("Binary number is: " + binaryNumber);
    }
}
