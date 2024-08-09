public class Main {
    public static void main(String[] args) {
        InterestCalculator CalculatBalance = new InterestCalculator();

        System.out.println(CalculatBalance.Balance(20000, 3, 10));
        System.out.println(CalculatBalance.TotalInterest(56000, 7, 30));
        System.out.println(CalculatBalance.Principal(200, 3, 2));
        System.out.println(CalculatBalance.Term(900000, 3, 20));
        System.out.println(CalculatBalance.Rate(10000, 3, 6));
    }
}