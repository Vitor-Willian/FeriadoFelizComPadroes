public class Guerreiro implements Personagem {
    private String nome;
    private int forca;
    private boolean isPremium;

    public Guerreiro(String nome, int forca) {
        this.nome = nome;
        this.forca = forca;
        this.isPremium = false;
    }

    public void tornarPremium() {
        this.isPremium = true;
    }

    public boolean isPremium() {
        return isPremium;
    }

    @Override
    public void ataque(Mob alvo) {
        System.out.println(nome + " ataca " + alvo.getNome() + " com uma espada\nDano: " + forca);
        
        // Sistema de dano 
    }
}
