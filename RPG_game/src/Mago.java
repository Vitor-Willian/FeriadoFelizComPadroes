public class Mago implements Personagem {
    private String nome;
    private int poderMagico;
    private boolean isPremium;

    public Mago(String nome, int poderMagico) {
        this.nome = nome;
        this.poderMagico = poderMagico;
        this.isPremium = false;
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
    public void ataque(Mob alvo) {
        System.out.println(nome + " ataca " + alvo.getNome() + " com um feitiço\nDano: " + poderMagico);
        
        // Sistema de dano 
    }
    
}
