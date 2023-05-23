import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double price = 360.4567;
        String name = "Ana";
        String product = "Moedor de café";

        System.out.println("Hello and welcome!");
        System.out.println("The return of Java");
        System.out.printf("%.2f%n", price);
        System.out.printf("%.4f%n", price);
        Locale.setDefault(Locale.FRANCE);
        System.out.printf("%.4f%n", price);
        System.out.printf("%s vendeu %s que custa R$ %.2f%n", name, product,price);

        //area calc
        double left, bottom, height, area;
        left = 6.0;
        bottom = 8.0;
        height = 5.0;
        area = (int) (left + bottom)/2.0 * height;
        System.out.printf("%.1f%n",area);

        // Data injection by users to calc polygon area
        Locale.setDefault(Locale.US);
        double inputLeftValue, inputBottomValue, inputHeightValue, areaValue;
        System.out.println("Digite a medida do lado esquerdo do poligono:");
        Scanner inputLeft = new Scanner(System.in);
        inputLeftValue = inputLeft.nextDouble();


        System.out.println("Digite a medida da base do poligono:");
        Scanner inputBottom = new Scanner(System.in);
        inputBottomValue = inputBottom.nextDouble();

        System.out.println("Digite a altura do poligono:");
        Scanner inputHeight = new Scanner(System.in);
        inputHeightValue = inputHeight.nextDouble();

        areaValue = (inputLeftValue + inputBottomValue) / 2 * inputHeightValue;

        System.out.println("Medida do lado esquerdo: " + inputLeftValue);
        System.out.println("Medida da base: " + inputBottomValue);
        System.out.println("Medida da altura: " + inputHeightValue);
        System.out.printf("A área do poligono é : %.2f%n", areaValue);

        inputLeft.close();
        inputBottom.close();
        inputHeight.close();
    }
}