public class Espada implements EstrategiaAtaque {
    @Override
    public void ataque(Personagem atacante, Mob alvo) {
        System.out.println(atacante.getNome() + " ataca " + alvo.getNome() + " com uma espada\nDano: " + atacante.getPoder());
        alvo.receberDano(atacante.getPoder());
    }
    
}
