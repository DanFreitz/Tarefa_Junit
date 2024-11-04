import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GeneroSeparador {
    public List<String> separarGenerosFemininos(List<String> nomes, List<String> generos) {
        return IntStream.range(0, nomes.size())
                .filter(i -> generos.get(i).equalsIgnoreCase("Feminino"))
                .mapToObj(nomes::get)
                .collect(Collectors.toList());
    }
}