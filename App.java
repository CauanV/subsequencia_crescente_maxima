import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Lê a quantidade de números
        System.out.print("Quantos números você quer inserir? ");
        int n = sc.nextInt();

        // Cria a lista e lê os números
        ArrayList<Integer> numerosLista = new ArrayList<>();
        System.out.println("Digite os números separados por ENTER:");
        for (int i = 0; i < n; i++) {
            numerosLista.add(sc.nextInt());
        }

        sc.close();

        // Chama o método que retorna a subsequência crescente máxima
        Funcao objeto = new Funcao();
        ArrayList<Integer> subseq = objeto.subCrescMaxima(numerosLista);

        // Imprime o resultado
        if (subseq.size() > 0) {
            System.out.println("Subsequência crescente máxima: " + subseq);
        } else {
            System.out.println("Não existe subsequência crescente.");
        }
    }
}
