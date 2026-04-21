public class Arco implements EstrategiaAtaque {
    @Override
    public void ataque(Personagem atacante, Mob alvo) {
        System.out.println(atacante.getNome() + " ataca " + alvo.getNome() + " com um arco\nDano: " + atacante.getPoder());
        alvo.receberDano(atacante.getPoder());
    }
}
