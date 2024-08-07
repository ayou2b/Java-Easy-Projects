public class BasicCalculator {

    long result = 0;

    long Addition(int x, int y){
        result = x + y;
        return result;
    }

    long Subtraction (int x , int y){
        result = x - y;
        return result;
    }

    long Multiplication (int x, int y){
        result = x * y;
        return result;
    }

    long Devision(int x , int y){
       if(y !=0){
        result = x / y;
       }else{

        System.out.println("Error! Division by zero.");
        
       }

       return result;
    }

    long Calculate (int x , char op, int y){
        switch (op) {
            case '+':
                Addition(x, y);
                break;
            case '-':
                Subtraction(x, y);
                break;    
            case '/':
                 Devision(x, y);
                 break;
            case '*':
                  Multiplication(x, y);
                  break;
            default:
                System.out.println("This is not a valid math opirator");;
        }

        return result;
    }

}
