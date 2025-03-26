import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int operation;
        float res = 0,n1,n2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora Simples");

        System.out.println("Escolha a operação desejada:\n1-Adição\n2-Subtração\n3-Multiplicação\n4-Divisão");

        operation = scanner.nextInt();
        if (operation < 1 || operation > 4) {

            System.out.println("Insira uma operação válida");

        }else {
            System.out.print("Insira o primeiro número para fazer a operação: ");
            n1 = scanner.nextFloat();
            System.out.print("Insira o segundo número para fazer a operação: ");
            n2 = scanner.nextFloat();

            res = switch (operation) {
                case 1 -> n1 + n2;
                case 2 -> n1 - n2;
                case 3 -> n1 * n2;
                case 4 -> n1 / n2;
                default -> res;
            };

            System.out.println("O resultado de sua operação é: "+res);
        }
    }
}