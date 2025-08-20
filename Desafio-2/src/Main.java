import Orquestra.Piano;
import Orquestra.Tambor;
import Orquestra.Violino;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Violino violino = new Violino();
        violino.tocar();
        Piano piano = new Piano();
        piano.tocar();
        Tambor tambor = new Tambor();
        tambor.tocar();

    }
}