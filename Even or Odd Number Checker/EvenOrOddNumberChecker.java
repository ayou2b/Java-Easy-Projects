public class EvenOrOddNumberChecker{

    String result = "";

    String checker(int num){
        
     if(num / 2 == 0){
       result = "Even";
    }else{
       result = "Odd";
    }
        return result;
    }
}