import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Descubra quantos caracteres tem sua palavra ou frase!!");
        Scanner scanner = new Scanner(System.in);
        String inputUser = scanner.nextLine();
        for( char Letter : inputUser.toCharArray()){
            System.out.println(Letter);
        }
        System.out.print("Sua palavra/frase tem "+inputUser.length()+" caracteres");
    }
}