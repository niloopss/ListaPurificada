import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * A classe RemovedorDeDuplicatas é responsável por remover elementos duplicados de uma lista,
 * mantendo a ordem original dos elementos.
 */
public class RemovedorDeDuplicatas {

    /**
     * Remove elementos duplicados de uma lista de entrada.
     *
     * @param <T> O tipo dos elementos na lista.
     * @param entrada A lista de entrada que pode conter duplicatas.
     * @return Uma nova lista contendo os elementos únicos da lista de entrada, na mesma ordem.
     */
    public static <T> List<T> remover(List<T> entrada) {
        HashSet<T> conjuntoUnico = new HashSet<>(entrada);

        List<T> resultado = new ArrayList<>(conjuntoUnico);

        return resultado;
    }
}
