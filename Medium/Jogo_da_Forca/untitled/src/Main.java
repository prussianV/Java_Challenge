import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word;
        System.out.println("--Bem vindo ao Jogo da forca!!--");
        System.out.println("Insira a palavra da forca: ");
        word = sc.nextLine();

        ArrayList<String> CorretLetters = new ArrayList<>();
        char[] letters = word.toCharArray();
        int defeat = 0;
        while(true){
            for (char c : letters) {
                boolean chave = true;
                for (String corretLetter : CorretLetters) {
                    if (corretLetter.equalsIgnoreCase(Character.toString(c))) {
                        System.out.println(corretLetter);
                        chave = false;
                        break;
                    }
                }
                if (chave) {
                    System.out.println("_");
                }
            }
                System.out.println("Insira uma letra");
                String Selectletter = sc.nextLine();
                boolean chave = false;
                for(char letter : letters){
                    if (Character.toString(letter).equalsIgnoreCase(Selectletter)) {
                        chave = true;
                        break;
                    }
                }
                if (Objects.equals(Selectletter.toUpperCase(), word.toUpperCase())){
                    System.out.println("Parabéns!! Você acertou a palavra!!");
                    break;
                }
                if (!chave){
                    defeat++;
                    if (defeat>1) {
                        System.out.println("Você tem mais " + (5 - defeat) + " chances");
                    }else {
                        System.out.println("Você tem mais " + (5 - defeat) + " chance");
                    }
                    if (defeat == 5){
                        System.out.println("Você perdeu, a palavra era "+ word);
                        break;
                    }
                }else{
                    for(int i = 0;i<CorretLetters.size();i++){
                        if (Objects.equals(CorretLetters.get(i).toUpperCase(), Selectletter.toUpperCase())){
                            CorretLetters.remove(Selectletter);
                        }
                    }
                    CorretLetters.add(Selectletter);
                    System.out.println("Letra correta!");
                }
            }
        }
    }