import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number,res;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vamos calcular o fatorial de um número!!");
        System.out.print("Insira o número: ");
        number = scanner.nextInt();
        res = number;
        for(int i = number-1; i>= 1; i--){
            res = res * i;
            System.out.println(res);
        }

        System.out.print("O fatorial do numero "+number+" é: "+res);

    }
}