public class Main {
    private static final double COEFFICIENT_CONV_TO_CELCIUS = 5.0 / 9.0;
    private static final double COEFFICIENT_CONV_TO_FAHRENHEIT = 9.0 / 5.0;
    public static void main(String[] args) {
        System.out.println("This project will convert celsius to fahrenheit and vice versa.");

        double fahr = 77.1;
        double cels = 23.7;
        double convertedFahToCel = convertedFahToCel(fahr);
        double convertedCelToFah = convertedCelToFah(cels);
        System.out.println("Fahrenheits without conversion to celsius: " + fahr + "\n" +
                "Fahrenheits with conversion to celsius: " + convertedFahToCel);

        System.out.println("Celsius without conversion to fahrenheit: " + cels + "\n" +
                "Celsius with conversion to fahrenheit: " + convertedCelToFah);

    }
    private static double convertedFahToCel(double fahr) {
        return (fahr - 32) * COEFFICIENT_CONV_TO_CELCIUS;
    }

    private static double convertedCelToFah(double cels) {
        return cels * COEFFICIENT_CONV_TO_FAHRENHEIT + 32;
    }
}