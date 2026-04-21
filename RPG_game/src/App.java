import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        System.out.println("Teste do Padrão Singleton:\n");

        Config config = Config.getInstance();
        config.setDificuldade("Difícil");
        config.setForcaMax(150);
        config.carregarConfig();

        System.out.println("\nTeste do Padrão Factory:\n");

        Personagem guerreiro = PersonagemFactory.criarGuerreiro("Aragorn", 50);
        Personagem arqueiro = PersonagemFactory.criarArqueiro("Legolas", 40);
        Personagem mago = PersonagemFactory.criarMago("Gandalf", 60);

        Mob goblin = new Mob("Goblin", 100);
        Mob orc = new Mob("Orc", 120);
        List<Mob> inimigos = new ArrayList<>();
        inimigos.add(goblin);
        inimigos.add(orc);

        guerreiro.ataque(goblin);
        arqueiro.ataque(goblin);
        mago.ataque(goblin);

        System.out.println("\nTeste do Padrão Proxy:\n");

        ((Mago) mago).tornarPremium();

        Zona zonaPremium = new ZonaPremiumProxy("Pay-to-win Village");
        zonaPremium.acesso(guerreiro);
        zonaPremium.acesso(mago);
        
        System.out.println("\nTeste do Padrão Adapter:\n");

        ControleMotorGrafico controleMotor = new ControleMotorGrafico();

        MotorAMD motorAMD = new MotorAMD();
        Motor adaptadorAmd = new AdaptadorMotorAMD(motorAMD);
        controleMotor.init(adaptadorAmd);

        MotorNvidia motorNvidia = new MotorNvidia();
        Motor adaptadorNvidia = new AdaptadorMotorNvidia(motorNvidia);
        controleMotor.init(adaptadorNvidia);

        System.out.println("\nTeste do Padrão Facade:\n");

        BatalhaFachada batalhaFachada = new BatalhaFachada();
        batalhaFachada.iniciarBatalha(guerreiro, inimigos);

        System.out.println("\nTeste do Padrão Decorator:\n");

        Personagem guerreiroEq = new AnelPoder(guerreiro);
        System.out.println(guerreiroEq.getNome() + " - Força: " + guerreiroEq.getPoder());

        Mob esqueleto = new Mob("Esqueleto", 60);
        Mob Bandido = new Mob("Bandido", 80);
        inimigos.add(esqueleto);
        inimigos.add(Bandido);

        batalhaFachada.iniciarBatalha(guerreiroEq, inimigos);

        System.out.println("\nTeste do Padrão Strategy:\n");

        Mob dragao = new Mob("Dragão", 300);
        inimigos.add(dragao);

        mago.ataque(dragao);
        mago.setEstrategiaAtaque(new Fireball());
        mago.ataque(dragao);

        System.out.println("\nTeste do Padrão Observer:\n");

        Observer conquistas = new Conquistas();
        batalhaFachada.addObserver(conquistas);

        batalhaFachada.iniciarBatalha(mago, inimigos);
    }
}
