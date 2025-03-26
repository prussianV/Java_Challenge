import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = random.nextInt(11);
        int inputNumber;
        System.out.println("Acerte o numero entre 0 a 10!");

        while (true) {
            inputNumber = scanner.nextInt();
            if (inputNumber == randomNumber){
                System.out.println("Você acertou o número!!");
                break;
            }
            System.out.println("Tente novamente!");
        }
    }
}