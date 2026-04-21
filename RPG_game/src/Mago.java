public class Mago implements Personagem {
    private String nome;
    private int poderMagico;
    private int maxHp = 100;
    private int Hp = maxHp;
    private boolean isPremium;

    private EstrategiaAtaque estrategia;

    public Mago(String nome, int poderMagico) {
        this.nome = nome;
        this.poderMagico = poderMagico;
        this.isPremium = false;
        this.estrategia = new MissilMagico();
    }

    public void setEstrategiaAtaque(EstrategiaAtaque nova_estrategia) {
        this.estrategia = nova_estrategia;
        System.out.println(nome + " mudou sua estratégia de ataque para " + nova_estrategia.getClass().getSimpleName());
    }

    public void tornarPremium() {
        this.isPremium = true;
    }

    public boolean isPremium() {
        return isPremium;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public int ataque(Mob alvo) {
        this.estrategia.ataque(this, alvo);
        return poderMagico;
    }
    
    @Override
    public int getPoder() {
        return this.poderMagico;
    }

    @Override
    public int getMaxHp() {
        return maxHp;
    }

    @Override
    public int getHp() {
        return Hp;
    }
}
