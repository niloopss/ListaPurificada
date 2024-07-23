import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * A classe ListaPurificada fornece métodos utilitários para manipulação de listas, como encontrar duplicatas.
 */
public class ListaPurificada {

    /**
     * Encontra os elementos duplicados em uma lista.
     *
     * @param <T> O tipo dos elementos na lista.
     * @param entrada A lista de entrada que pode conter duplicatas.
     * @return Uma nova lista contendo os elementos duplicados da lista de entrada.
     */
    public static <T> List<T> encontrarDuplicatas(List<T> entrada) {
        List<T> duplicatas = new ArrayList<>();
        HashSet<T> conjuntoUnico = new HashSet<>();

        for (T elemento : entrada) {
            if (!conjuntoUnico.add(elemento)) {
                duplicatas.add(elemento);
            }
        }

        return duplicatas;
    }
}
