public class AnelPoder extends Equipamento {

    public AnelPoder(Personagem personagem) {
        super(personagem);
    }

    @Override
    public int ataque(Mob alvo) {
        int dano = this.getPoder();
        System.out.println(getNome() + " usa o Anel de Poder para aumentar o ataque!\nDano total: " + dano);
        return dano;
    }

    @Override
    public int getPoder() {
        return super.getPoder() + 10;
    }

    @Override
    public String getNome() {
        return super.getNome() + " com Anel de Poder";
    }
}
