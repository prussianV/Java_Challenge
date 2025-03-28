import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Vamos verificar se seu CPF é verdadeiro!!");

        String CPF;
        int D1,D2;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um cpf (Somente os numeros): ");
        CPF = scanner.nextLine();
        if(CPF.length() != 11){

            System.out.println("Insira um CPF do tamanho correto");

        }else {
            int position = 0,Multi1 = 10;
            int D1F = 0,D2F = 0;
            int[] mult = new int[11];

            for(char number : CPF.toCharArray()){
                mult[position] = Integer.parseInt(String.valueOf(number)) * Multi1;
                position++;
                Multi1--;
                if (position == 10){
                D1F = Integer.parseInt(String.valueOf(number));
                }else if(position ==11){
                D2F = Integer.parseInt(String.valueOf(number));
                }
            }
            int total = 0;
            for(int i = 0;i<mult.length-2;i++){
                total += mult[i];
            }

            if (11-(total % 11) > 9){
                D1 = 0;
            }else{
                D1 = 11-(total % 11);
            }

            int[] mult2 = new int[11];
            int position2 = 0,Multi2 = 11,total2 = 0;

            for(char number : CPF.toCharArray()){
                mult[position2] = Integer.parseInt(String.valueOf(number)) * Multi2;
                position2++;
                Multi2--;
            }
            for(int i = 0;i<mult2.length-1;i++){
                total2 += mult[i];
            }

            if (11-(total2 % 11) > 9){
                D2 = 0;
            }else{
                D2 = 11-(total2 % 11);
            }

            if (D1 == D1F && D2 == D2F){
                System.out.println("Seu cpf é verdadeiro");
            }else{
                System.out.println("Seu cpf é falso");
            }

        }
    }
}


