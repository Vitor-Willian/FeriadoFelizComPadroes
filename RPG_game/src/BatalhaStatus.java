import java.util.List;

public class BatalhaStatus {
    public boolean CombateAtivo(List<Mob> inimigos) {
        for (Mob inimigo : inimigos) {
            if (inimigo.getHp() > 0) {
                return true;
            }
        }
        System.out.println("Todos os inimigos foram derrotados!");
        return false;
    }
}
