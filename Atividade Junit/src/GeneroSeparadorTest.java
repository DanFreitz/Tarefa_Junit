import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class GeneroSeparadorTest {

    @Test
    public void testSepararGenerosFemininos() {
        GeneroSeparador separador = new GeneroSeparador();

        List<String> nomes = Arrays.asList("Maria", "João", "Ana", "Pedro", "Júlia", "Lucas");
        List<String> generos = Arrays.asList("Feminino", "Masculino", "Feminino", "Masculino", "Feminino", "Masculino");

        List<String> nomesFemininosEsperados = Arrays.asList("Maria", "Ana", "Júlia");

        List<String> nomesFemininosObtidos = separador.separarGenerosFemininos(nomes, generos);

        assertEquals(nomesFemininosEsperados, nomesFemininosObtidos);
    }
}