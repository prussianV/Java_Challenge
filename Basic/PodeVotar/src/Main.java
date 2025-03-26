//Você pode votar? (Java)

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Insira seu nome: ");
        String seuNome = leitor.nextLine();

        System.out.print("Insira sua idade: ");
        int idade = leitor.nextInt();

        if (idade < 18){

            System.out.print(seuNome+" você não pode votar");

        } else {

            System.out.print(seuNome +" você pode votar");

        }
    }
}

