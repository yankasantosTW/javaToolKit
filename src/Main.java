import java.util.Locale;

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
        System.out.printf("%.1f",area);
    }
}