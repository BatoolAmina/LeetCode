public class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num <= 1) return false;
        int sum = 1;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) sum += num / i;
            }
        }
        return sum == num;
    }
}




class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        for(int i = 1; i <= num/2; i++) {
            if(num % i == 0)
            sum = sum + i;
        }
        return(num == sum);
    }
}
