import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //insert text line into a variable
        System.out.println("Digite seu nome, sobrenome e idade");
        Scanner textInput = new Scanner(System.in);

        String username = textInput.nextLine();
        String lastName = textInput.nextLine();
        String age = textInput.nextLine();

        System.out.println("Dados do usuário:");
        System.out.println(username+ " " + lastName);
        System.out.println(age);

        textInput.close();
    }
}