import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * A classe EntradaDeDados é responsável por obter a entrada do usuário, que consiste em uma lista de elementos
 * (números ou letras) separados por espaços.
 */
public class EntradaDeDados {

    /**
     * Obtém a entrada do usuário a partir da linha de comando.
     *
     * @return Uma lista de strings contendo os elementos da entrada, separados por espaços.
     */
    public static List<String> obterEntrada() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite os elementos separados por espaço: ");

        // Lê a linha digitada pelo usuário
        String entrada = scanner.nextLine();

        // Divide a entrada em elementos usando espaços como delimitadores
        List<String> elementos = Arrays.asList(entrada.split(" "));

        return elementos;
    }
}
