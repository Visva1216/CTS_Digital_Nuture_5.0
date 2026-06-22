

public class Main {

    // Recursive method to calculate future value
    static double futureValue(double amount, double growthRate, int years) {

        // Base case
        if (years == 0) {
            return amount;
        }

        // Recursive call
        return futureValue(amount, growthRate, years - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {

        double presentValue = 10000;
        double growthRate = 0.10;   
        int years = 5;

        double result = futureValue(presentValue, growthRate, years);

        System.out.println("Present Value : " + presentValue);
        System.out.println("Growth Rate   : " + (growthRate * 100) + "%");
        System.out.println("Years         : " + years);
        System.out.println("Future Value  : " + result);

    }
}
