import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        char[] alfabeto = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int qtdNumber;
        StringBuilder senha = new StringBuilder();

        System.out.println("Vamos criar uma senha para você!!");
        System.out.print("Insira quantos digitos você deseja que a senha tenha: ");

        qtdNumber = scanner.nextInt();

        for (int i = 1; i<= qtdNumber; i++){

            if (random.nextBoolean()){
                senha.append(random.nextInt(9));
            }else{
                senha.append(alfabeto[random.nextInt(52)]);
            }
        }
        System.out.println("Sua senha é "+senha);
    }
}