public class FahrenheitToCelsiusConverter {

    float  result = 0;

    float  FahrenheitToCelsius(float  f){
        result = (f - 32)* 5/9;
        return result;
    };

    float  CelsiusToFahrenheit ( float c){
        result = (c * 9/5) + 32;
        return result;
    };
}