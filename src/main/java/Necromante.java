public class Necromante extends Inimigo {

    public Necromante(Integer vida) {
        super(vida, 5);
    }

    public Integer causarDano() {
        return (getAtaque.getDano() + getModificador());
    }

    public void receberDano(Integer dano){
        Integer vidaFinal = getVida() - dano;
        setVida(vidaFinal);
    }
}