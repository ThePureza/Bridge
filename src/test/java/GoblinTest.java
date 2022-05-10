import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoblinTest {

    @Test
    void deveRetornarDanoCausadoPorCortar() {
        Ataque ataque = new Cortar();
        Goblin goblin = new Goblin(10);
        goblin.setAtaque(ataque);
        assertEquals(5, goblin.causarDano());
    }

    @Test
    void deveRetornarDanoCausadoPorBater() {
        Ataque ataque = new Bater();
        Goblin goblin = new Goblin(10);
        goblin.setAtaque(ataque);
        assertEquals(4, goblin.causarDano());
    }

    @Test
    void deveRetornarDanoCausadoPorPerfurar() {
        Ataque ataque = new Perfurar();
        Goblin goblin = new Goblin(10);
        goblin.setAtaque(ataque);
        assertEquals(6, goblin.causarDano());
    }

    @Test
    void deveRetornarDanoCausadoPorMagico() {
        Ataque ataque = new Magico();
        Goblin goblin = new Goblin(10);
        goblin.setAtaque(ataque);
        assertEquals(7, goblin.causarDano());
    }

    @Test
    void deveRetornarDanoRecebido() {
        Goblin goblin = new Goblin(10);
        goblin.receberDano(3);
        assertEquals(7, goblin.getVida());
    }

}