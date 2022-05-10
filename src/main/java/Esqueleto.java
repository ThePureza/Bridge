public class Esqueleto extends Inimigo {

    public Esqueleto(Integer vida) {
        super(vida, 1);
    }

    public Integer causarDano() {
        return (getAtaque.getDano() + getModificador());
    }

    public void receberDano(Integer dano){
        Integer vidaFinal = getVida() - dano;
        setVida(vidaFinal);
    }
}