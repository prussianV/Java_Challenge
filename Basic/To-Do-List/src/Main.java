import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        String tar = "";
        ArrayList<String> itens = new ArrayList<>();
<<<<<<< HEAD
=======


>>>>>>> 09b39a9e5a76b666ff01284fa242297cac2594fb
        while(true){
            System.out.println("--Lista de afazeres--");
            System.out.println("1- Ver lista");
            System.out.println("2- Adicionar item à lista");
            System.out.println("0- Sair");
            op = sc.nextInt();
            sc.nextLine();
            if (op == 1){
                if (itens.isEmpty()){
                    System.out.println("Não há itens");
                } else {
                    for (int i=0;i<itens.size();i++){
                        System.out.println("Item "+(i+1)+": "+itens.get(i));
                    }
                }
            } else if (op==2) {
                System.out.println("Insira qual tarefa você deseja inserir: ");
                tar = sc.nextLine();
                itens.add(tar);
            } else if (op==0) {
                break;
            }else{
                System.out.println("Insira uma opção existente");
            }
        }
<<<<<<< HEAD
=======



>>>>>>> 09b39a9e5a76b666ff01284fa242297cac2594fb
    }
}





//     nlist.add(55);
//       nlist.add(33);
//        nlist.add(423);
//        System.out.println(nlist.get(1));
