import java.util.List;

public class BatalhaFachada {
    
    private BatalhaTurnos batalhaTurnos;
    private BatalhaStatus batalhaStatus;

    public BatalhaFachada() {
        this.batalhaTurnos = new BatalhaTurnos();
        this.batalhaStatus = new BatalhaStatus();
    }

    public void iniciarBatalha(Personagem personagem, List<Mob> inimigos) {
        while (batalhaStatus.CombateAtivo(inimigos)) {
            for (Mob inimigo : inimigos) {
                if (inimigo.getHp() > 0) {
                    batalhaTurnos.Turno(personagem, inimigo);

                }
            }
        }
        System.out.println("A batalha terminou!");
    }
}
