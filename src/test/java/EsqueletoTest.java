import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EsqueletoTest {

    @Test
    void deveRetornarDanoCausadoPorCortar() {
        Ataque ataque = new Cortar();
        Esqueleto esqueleto = new Esqueleto(10);
        esqueleto.setAtaque(ataque);
        assertEquals(3, esqueleto.causarDano());
    }

    @Test
    void deveRetornarDanoCausadoPorBater() {
        Ataque ataque = new Bater();
        Esqueleto esqueleto = new Esqueleto(10);
        esqueleto.setAtaque(ataque);
        assertEquals(2, esqueleto.causarDano());
    }

    @Test
    void deveRetornarDanoCausadoPorPerfurar() {
        Ataque ataque = new Perfurar();
        Esqueleto esqueleto = new Esqueleto(10);
        esqueleto.setAtaque(ataque);
        assertEquals(4, esqueleto.causarDano());
    }

    @Test
    void deveRetornarDanoCausadoPorMagico() {
        Ataque ataque = new Magico();
        Esqueleto esqueleto = new Esqueleto(10);
        esqueleto.setAtaque(ataque);
        assertEquals(5, esqueleto.causarDano());
    }

    @Test
    void deveRetornarDanoRecebido() {
        Esqueleto esqueleto = new Esqueleto(10);
        esqueleto.receberDano(3);
        assertEquals(7, esqueleto.getVida());
    }

}