public class BatalhaTurnos {
        public void Turno(Personagem personagem, Mob inimigo) {
        System.out.println("\n--- Turno de " + personagem.getNome() + " ---");
        int dano = personagem.ataque(inimigo);
        inimigo.receberDano(dano);
    }
}
