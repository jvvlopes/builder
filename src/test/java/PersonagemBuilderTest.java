import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonagemBuilderTest {

    @Test
    void deveConstruirPersonagemComTodosOsDados() {
        Personagem personagem = new PersonagemBuilder()
                .comNome("Arthas")
                .comClasse("Paladino")
                .comNivel(10)
                .comForca(80)
                .comInteligencia(60)
                .construir();

        assertEquals("Arthas", personagem.getNome());
        assertEquals("Paladino", personagem.getClasse());
        assertEquals(10, personagem.getNivel());
        assertEquals(80, personagem.getForca());
        assertEquals(60, personagem.getInteligencia());
    }
}