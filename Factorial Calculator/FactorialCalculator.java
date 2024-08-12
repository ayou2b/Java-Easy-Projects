public class FactorialCalculator{

     long Calculate(int num) {
        if (num == 1) {          
            return 1;
        } else {                  
            return num * Calculate(num - 1);
        }
    }
}