public class Arqueiro implements Personagem {
    private String nome;
    private int forca;

    public Arqueiro(String nome, int forca) {
        this.nome = nome;
        this.forca = forca;
    }

    @Override
    public void ataque(Mob alvo) {
        System.out.println(nome + " ataca " + alvo.getNome() + " com um arco\nDano: " + forca);
        
        // Sistema de dano 
    }
    
}
