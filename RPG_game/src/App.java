public class App {
    public static void main(String[] args) {

        Config config = Config.getInstance();
        config.setDificuldade("Difícil");
        config.setForcaMax(150);
        config.carregarConfig();

        Personagem guerreiro = PersonagemFactory.criarGuerreiro("Aragorn", 50);
        Personagem arqueiro = PersonagemFactory.criarArqueiro("Legolas", 40);
        Personagem mago = PersonagemFactory.criarMago("Gandalf", 60);

        Mob goblin = new Mob("Goblin", 100);
        
        guerreiro.ataque(goblin);
        arqueiro.ataque(goblin);
        mago.ataque(goblin);

        ((Mago) mago).tornarPremium();

        Zona zonaPremium = new ZonaPremiumProxy("Pay-to-win Village");

        zonaPremium.acesso(guerreiro);
        zonaPremium.acesso(mago);

    }
}
