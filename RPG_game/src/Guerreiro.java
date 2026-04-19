public class Guerreiro implements Personagem {
    private String nome;
    private int forca;

    public Guerreiro(String nome, int forca) {
        this.nome = nome;
        this.forca = forca;
    }

    @Override
    public void ataque(Mob alvo) {
        System.out.println(nome + " ataca " + alvo.getNome() + " com uma espada\nDano: " + forca);
        
        // Sistema de dano 
    }
}
