public class MissilMagico implements EstrategiaAtaque {
    @Override
    public void ataque(Personagem atacante, Mob alvo) {
        int dano = atacante.getPoder(); 
        System.out.println(atacante.getNome() + " dispara um míssil mágico em " + alvo.getNome() + " causando " + dano + " de dano!");
        alvo.receberDano(dano);
    }
}
