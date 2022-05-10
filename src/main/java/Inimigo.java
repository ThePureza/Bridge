public abstract class Inimigo {
    protected Integer vida;
    protected Ataque ataque;
    protected Integer modificador;

    public Inimigo(Integer vida, Integer modificador){
        this.vida = vida;
        this.modificador = modificador;
    }

    public void setVida (Integer vida){
        this.vida = vida;
    }

    public void setAtaque (Ataque ataque){
        this.ataque = ataque;
    }

    public void setModificador (Integer modificador){
        this.modificador = modificador;
    }

    public Integer getVida (){
        return this.vida;
    }

    public Ataque getAtaque (){
        return this.ataque;
    }

    public Integer getModificador (){
        return this.modificador;
    }

    public abstract Integer causarDano();

    public abstract void receberDano(Integer dano);
}
