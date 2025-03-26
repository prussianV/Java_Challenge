import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Conversor de temperaturas");
        int operation;
        double res;
        float n1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("O que você deseja converter? \n1 - ºC para ºF\n2 - ºF para ºC\n3 - ºF para K\n4 - ºC para K\n5 - K para ºC\n6 - K para ºF");
        operation = scanner.nextInt();
        if (operation < 1 || operation > 6) {
            System.out.print("Insira uma operação dentre as disponibilizadas!");
        } else {
            System.out.print("Insira a temperatura atual: ");
            n1 = scanner.nextFloat();


            res = switch (operation) {
                case 1 -> res = (n1*9/5)+32;
                case 2 -> res = (n1-32)*5/9;
                case 3 -> res = (n1-32)*5/9+273.15;
                case 4 -> res = n1+273.15;
                case 5 -> res = n1-273.15;
                case 6 -> res = (n1-273.15)*9/5+32;
                default -> res = 0;
            };

            System.out.print("O resultado da sua conversão é: " + res);

        }
    }
}