import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        boolean key = true;
        Sistema_Bancario user = new Sistema_Bancario(0);

        System.out.println("Bem vindo ao Sistema de caixa eletrônico");

        while (key) {

            System.out.println("--Escolha uma opção--");
            System.out.println("--1. Fazer depósito--");
            System.out.println("--2. Fazer saque--");
            System.out.println("--3. Colsultar Saldo--");
            System.out.println("--0. Sair--");

            op = sc.nextInt();

            switch (op){
                case 1:
                    user.addSaldo();
                    break;
                case 2:
                    user.removeSaldo();
                    break;
                case 3:
                    user.getSaldo();
                    break;
                case 0:
                    key = false;
                    System.out.println("Finalizando Sistema...");
                    break;
            }
        }
    }
}