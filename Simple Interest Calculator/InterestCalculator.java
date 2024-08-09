public class InterestCalculator {

    long result = 0;

    long Balance(long Principal, long InterestRate, long term) {
        long totalInterest = (Principal * InterestRate * term) / 100;
        result = totalInterest + Principal;
        return result;
    }

    long TotalInterest(long Principal, long InterestRate, long term) {
        result = (Principal * InterestRate * term) / 100;
        return result;
    }

    long Principal(long finalAmount, long interestRate, long term) {
        result = finalAmount / (1 + (interestRate * term) / 100);
        return result;
    }

    double Term(long finalAmount, long principal, long interestRate) {
        // Convert interestRate to a double to prevent integer division
        double rateFactor = interestRate / 100.0;
        return (finalAmount - principal) / (principal * rateFactor);
    }

    double Rate(long finalAmount, long principal, long term) {
        result = (finalAmount - principal) / (principal * term) * 100;
        return result;
    }
}
