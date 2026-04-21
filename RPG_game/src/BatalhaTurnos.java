public class BatalhaTurnos {
        public void Turno(Personagem personagem, Mob inimigo) {
        System.out.println("\n--- Turno de " + personagem.getNome() + " ---");
        personagem.ataque(inimigo);
    }
}
