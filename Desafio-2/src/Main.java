import Orquestra.Instrumento;
import Orquestra.Piano;
import Orquestra.Tambor;
import Orquestra.Violino;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Violino violino = new Violino();

        Piano piano = new Piano();

        Tambor tambor = new Tambor();



        // Lista da orquestra escolhida pelo usuário
        List<Instrumento> orquestra = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Escolha os instrumentos para a orquestra:");
        System.out.println("1 - Violino");
        System.out.println("2 - Piano");
        System.out.println("3 - Tambor");
        System.out.println("Digite os números separados por vírgula (ex: 1,3): ");

        // Lê linha inteira (ex: "1,3")
        String entrada = scanner.nextLine();
        String[] escolhas = entrada.split(",");

        for (String e : escolhas) {
            switch (e.trim()) {
                case "1":
                    orquestra.add(violino);
                    break;
                case "2":
                    orquestra.add(piano);
                    break;
                case "3":
                    orquestra.add(tambor);
                    break;
                default:
                    System.out.println("Opção inválida: " + e);
            }
        }
        // Resumo
        System.out.println("\nInstrumentos na orquestra:");
        for (Instrumento inst : orquestra) {
            System.out.println(inst.getClass().getSimpleName());
        }

        // Tocar
        System.out.println("\n--- Orquestra ---");
        for (Instrumento inst : orquestra) {
            inst.tocar();
        }


    }
}