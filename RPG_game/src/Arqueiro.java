public class Arqueiro implements Personagem {
    private String nome;
    private int forca;
    private boolean isPremium;

    public Arqueiro(String nome, int forca) {
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
        System.out.println(nome + " ataca " + alvo.getNome() + " com um arco\nDano: " + forca);
        
        // Sistema de dano 
    }
    
}
