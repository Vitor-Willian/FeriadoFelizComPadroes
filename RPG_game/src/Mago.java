public class Mago implements Personagem {
    private String nome;
    private int poderMagico;

    public Mago(String nome, int poderMagico) {
        this.nome = nome;
        this.poderMagico = poderMagico;
    }

    @Override
    public void ataque(Mob alvo) {
        System.out.println(nome + " ataca " + alvo.getNome() + " com um feitiço\nDano: " + poderMagico);
        
        // Sistema de dano 
    }
    
}
