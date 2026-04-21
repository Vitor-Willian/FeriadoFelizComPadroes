import java.util.List;
import java.util.ArrayList;

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
        Mob orc = new Mob("Orc", 120);
        List<Mob> inimigos = new ArrayList<>();
        inimigos.add(goblin);
        inimigos.add(orc);

        guerreiro.ataque(goblin);
        arqueiro.ataque(goblin);
        mago.ataque(goblin);

        ((Mago) mago).tornarPremium();

        Zona zonaPremium = new ZonaPremiumProxy("Pay-to-win Village");

        zonaPremium.acesso(guerreiro);
        zonaPremium.acesso(mago);
        
        ControleMotorGrafico controleMotor = new ControleMotorGrafico();

        MotorAMD motorAMD = new MotorAMD();
        Motor adaptadorAmd = new AdaptadorMotorAMD(motorAMD);
        controleMotor.init(adaptadorAmd);

        MotorNvidia motorNvidia = new MotorNvidia();
        Motor adaptadorNvidia = new AdaptadorMotorNvidia(motorNvidia);
        controleMotor.init(adaptadorNvidia);

        BatalhaFachada batalhaFachada = new BatalhaFachada();
        batalhaFachada.iniciarBatalha(guerreiro, inimigos);

        Personagem guerreiroEq = new AnelPoder(guerreiro);
        System.out.println(guerreiroEq.getNome() + " - Força: " + guerreiroEq.getPoder());

        Mob esqueleto = new Mob("Esqueleto", 60);
        Mob Bandido = new Mob("Bandido", 80);
        inimigos.add(esqueleto);
        inimigos.add(Bandido);

        batalhaFachada.iniciarBatalha(guerreiroEq, inimigos);
    }
}
