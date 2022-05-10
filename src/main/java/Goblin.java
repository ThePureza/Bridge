public class Goblin extends Inimigo {

    public Goblin(Integer vida) {
        super(vida, 3);
    }

    public Integer causarDano() {
        return (getAtaque.getDano() + getModificador());
    }

    public void receberDano(Integer dano){
        Integer vidaFinal = getVida() - dano;
        setVida(vidaFinal);
    }
}