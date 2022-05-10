import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NecromanteTest {

    @Test
    void deveRetornarDanoCausadoPorCortar() {
        Ataque ataque = new Cortar();
        Necromante necromante = new Necromante(10);
        necromante.setAtaque(ataque);
        assertEquals(7, necromante.causarDano());
    }

    @Test
    void deveRetornarDanoCausadoPorBater() {
        Ataque ataque = new Bater();
        Necromante necromante = new Necromante(10);
        necromante.setAtaque(ataque);
        assertEquals(6, necromante.causarDano());
    }

    @Test
    void deveRetornarDanoCausadoPorPerfurar() {
        Ataque ataque = new Perfurar();
        Necromante necromante = new Necromante(10);
        necromante.setAtaque(ataque);
        assertEquals(8, necromante.causarDano());
    }

    @Test
    void deveRetornarDanoCausadoPorMagico() {
        Ataque ataque = new Magico();
        Necromante necromante = new Necromante(10);
        necromante.setAtaque(ataque);
        assertEquals(9, necromante.causarDano());
    }

    @Test
    void deveRetornarDanoRecebido() {
        Necromante necromante = new Necromante(10);
        necromante.receberDano(3);
        assertEquals(7, necromante.getVida());
    }

}