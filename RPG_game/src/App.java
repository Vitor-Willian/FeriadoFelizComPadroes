public class App {
    public static void main(String[] args) {
        Personagem guerreiro = new Guerreiro("Aragorn", 50);
        Personagem arqueiro = new Arqueiro("Legolas", 40);
        
        Mob goblin = new Mob("Goblin", 100);
        
        guerreiro.ataque(goblin);
        arqueiro.ataque(goblin);
    }
}
