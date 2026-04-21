public class AnelPoder extends Equipamento {

    public AnelPoder(Personagem personagem) {
        super(personagem);
    }

    @Override
    public int ataque(Mob alvo) {
        int danoBase = super.ataque(alvo);
        int danoExtra = 10; // Dano extra do Anel de Poder
        int danoTotal = danoBase + danoExtra;
        System.out.println(getNome() + " usa o Anel de Poder para aumentar o ataque!\nDano total: " + danoTotal);
        return danoTotal;
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
