public class CelsiustoFahrenheit {

    public static void main(String[] args) {
        double celsius = 25.0; // Example Celsius value
        double fahrenheit = convertCelsiusToFahrenheit(celsius);
        System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
}