public class Guerreiro implements Personagem {
    private String nome;
    private int forca;
    private int maxHp = 150;
    private int Hp = maxHp;
    private boolean isPremium;

    EstrategiaAtaque estrategia;

    public Guerreiro(String nome, int forca) {
        this.nome = nome;
        this.forca = forca;
        this.isPremium = false;
        this.estrategia = new Espada();
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
        return forca;
    }

    @Override
    public int getPoder() {
        return this.forca;
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
