import java.util.ArrayList;

public class Funcao {

    public static ArrayList<Integer> subCrescMaxima(ArrayList<Integer> numeros) {
        // Cada posição vai guardar a melhor subsequência crescente terminando nesse
        // índice
        ArrayList<ArrayList<Integer>> todas = new ArrayList<>(); // lista de listas chamada todas||||| quando se trata
                                                                 // de uma lista todas, a sequencia de la ja foi tratada
                                                                 // e é correta ate tal indice

        for (int i = 0; i < numeros.size(); i++) {
            ArrayList<Integer> melhor = new ArrayList<>();
            melhor.add(numeros.get(i)); // pelo menos o próprio número entra

            // Olha todos os anteriores
            for (int j = 0; j < i; j++) {
                if (numeros.get(j) < numeros.get(i)) { // Se O DA ESQUERDA FOR MENOR EU PREGO os dois juntos
                    // se dá pra colar depois de j
                    if (todas.get(j).size() + 1 > melhor.size()) { // tamanho da subsequência crescente que termina em
                        // copia a subsequência que terminava em j
                        melhor = new ArrayList<>(todas.get(j)); // que vai pegar a menor da esquerda
                        melhor.add(numeros.get(i));
                    }
                }
            }
            todas.add(melhor); // guarda a melhor subsequência que termina em i
        }

        // Agora procura a mais longa entre todas
        ArrayList<Integer> resultado = new ArrayList<>();
        for (ArrayList<Integer> seq : todas) {
            if (seq.size() > resultado.size()) {
                resultado = seq;
            }
        }

        return resultado;
    }

}

// 23 2 55 96 4 6 -> 23, 55, 96
// 23 2 55 96 97 4 6 -> 23, 55, 96, 97
// 3 1 2 -> 3

// 3 1 2 -> 1, 2
// 3 1 2 4 -> 1, 2, 4