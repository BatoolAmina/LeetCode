class Main {
    public static int factorial(int number) {
        int fact = 1;
        for(int i = 1; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }

    public static double binomial_coefficient(int n, int r) {
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nr_fact = factorial(n-r);
        double bin_coeff = n_fact/(r_fact*nr_fact);
        return bin_coeff;
    }
    
    public static void main(String[] args) {
        int n = 5;
        int r = 2;
        double bin_coeff = binomial_coefficient(n, r);
        System.out.println("Binomial Coefficient is: " + bin_coeff);
    }
}
