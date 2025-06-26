class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int dup = x, d, sum = 0;
        while(dup > 0) {
            d = dup % 10;
            sum += d;
            dup /= 10;
        }
        if(x % sum == 0)
        return sum;
        return -1;
    }
}
