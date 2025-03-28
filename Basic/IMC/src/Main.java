import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double IMC;
        float peso,altura;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vamos calcular seu IMC");

        System.out.print("Insira sua altura em metros: ");
        altura = scanner.nextFloat();

        System.out.print("Insira seu peso em KG: ");
        peso = scanner.nextFloat();

        IMC = peso/(altura*altura);

        if(IMC <= 18.5) {

            System.out.println("Seu IMC é "+IMC+" e você está abaixo do peso");

        }else if(IMC > 18.5 && IMC <= 24.9){

            System.out.println("Seu IMC é "+IMC+" e você está com o peso normal");

        }else if (IMC >24.9 && IMC <= 29.9){

            System.out.println("Seu IMC é "+IMC+" e você está com sobrepeso");

        }else {

            System.out.println("Seu IMC é "+IMC+" e você está com obesidade");

        }
    }
}