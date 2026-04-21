import java.util.Iterator; 
import java.util.List;

public class BatalhaFachada {
    
    private BatalhaTurnos batalhaTurnos;
    private BatalhaStatus batalhaStatus;

    public BatalhaFachada() {
        this.batalhaTurnos = new BatalhaTurnos();
        this.batalhaStatus = new BatalhaStatus();
    }

    public void iniciarBatalha(Personagem personagem, List<Mob> inimigos) {
        System.out.println("\n========= BATALHA INICIADA =========");

        while (batalhaStatus.CombateAtivo(inimigos)) {

            Iterator<Mob> iterator = inimigos.iterator();
            while (iterator.hasNext()) {
                Mob inimigo = iterator.next();

                batalhaTurnos.Turno(personagem, inimigo);

                if (inimigo.getHp() <= 0) {
                    System.out.println(inimigo.getNome() + " foi derrotado!");
                    iterator.remove(); 
                }
            }
        }
        System.out.println("A batalha terminou!\n==================================\n");
    }
}