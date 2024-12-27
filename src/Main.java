public class Main {
    private static final double COEFFICIENT = 5.0 / 9.0;
    public static void main(String[] args) {
        System.out.println("This project will convert celsius to fahrenheit and vice versa.");

        double fahr = 77.1;
        double cels = 23.7;
        double convertedFahToCel = convertedFahToCel(fahr);
        System.out.println("Fahrenheits without conversion to celsius: " + fahr + "\n" +
                "Fahrenheits with conversion to celsius: " + convertedFahToCel);

    }
    private static double convertedFahToCel(double fahr) {
        return (fahr - 32) * COEFFICIENT;
    }
}