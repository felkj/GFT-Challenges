import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Decifrador de palavras Concluido

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = scanner.next().toLowerCase().trim();



        for (int i = 0; i < palavra.length(); i++) {
            char primeiraLetra = palavra.charAt(i);
            char segundaLetra = palavra.charAt(i + 1);
            char terceiraLetra = palavra.charAt(i + 2);

            if (segundaLetra == primeiraLetra + 1 && terceiraLetra == segundaLetra + 1) {
                System.out.println("Palavra Rara contém sequência alfabética:"+ primeiraLetra + segundaLetra + terceiraLetra);
                break;
            }
        }

    scanner.close();
    }
}