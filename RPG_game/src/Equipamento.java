public abstract class Equipamento implements Personagem {
    protected Personagem personagem;

    public Equipamento(Personagem personagem) {
        this.personagem = personagem;
    }

    @Override
    public String getNome() {
        return personagem.getNome();
    }

    @Override
    public int ataque(Mob alvo) {
        return personagem.ataque(alvo);
    }

    @Override
    public int getPoder() {
        return personagem.getPoder();
    }

    @Override
    public int getMaxHp() {
        return personagem.getMaxHp();
    }

    @Override
    public int getHp() {
        return personagem.getHp();
    }
    
}
