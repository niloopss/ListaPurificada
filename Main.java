import java.util.List;

/**
 * A classe Principal é o ponto de entrada do programa e coordena a interação com o usuário e o processamento da lista.
 */
public class Main {

    /**
     * Método principal que executa o programa.
     */
    public static void main(String[] args) {
        // Obtém a entrada do usuário
        List<String> entrada = EntradaDeDados.obterEntrada();

        // Remove as duplicatas da entrada
        List<String> resultado = RemovedorDeDuplicatas.remover(entrada);

        // Encontra as duplicatas na entrada
        List<String> duplicatas = ListaPurificada.encontrarDuplicatas(entrada);

        System.out.print("----------------------------------------------------");
        System.out.println("\nEntrada: " + entrada);
        System.out.println("Resultado (sem duplicatas): " + resultado);
        System.out.println("Duplicatas: " + duplicatas);
        System.out.println("----------------------------------------------------");

    }
}
