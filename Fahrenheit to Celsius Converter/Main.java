public class Main {
    public static void main (String[] args){
        FahrenheitToCelsiusConverter Converter = new FahrenheitToCelsiusConverter();

        System.out.println(Converter.FahrenheitToCelsius(54));
        System.out.println(Converter.CelsiusToFahrenheit(54));
    }
}
