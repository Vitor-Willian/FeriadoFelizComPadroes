public class Fireball implements EstrategiaAtaque {
    @Override
    public void ataque(Personagem atacante, Mob alvo) {
        int dano = atacante.getPoder() + 20;
        System.out.println(atacante.getNome() + " lança uma bola de fogo em " + alvo.getNome() + " causando " + dano + " de dano!");
        alvo.receberDano(dano);
    }
}
