import java.util.Scanner;
public class Sistema_Bancario {

    Scanner sc = new Scanner(System.in);
    double saldo;

    Sistema_Bancario(double saldo){
        this.saldo = saldo;
    }

    public void getSaldo(){
        System.out.println("Seu saldo é: "+saldo);;
    }

    public void addSaldo(){
        System.out.println("Insira o valor que deseja depositar:");
        double valor = sc.nextDouble();
        saldo = saldo + valor;
    }

    public void removeSaldo(){
        System.out.println("Insire o valor que deseja sacar");
        double valor = sc.nextDouble();
        if (saldo - valor < 0){
            System.out.println("Saldo insuficiente");
        } else {
            saldo = saldo - valor;
        }
    }
}
