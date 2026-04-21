import java.util.Iterator; 
import java.util.List;
import java.util.ArrayList;

public class BatalhaFachada implements Subject {
    
    private BatalhaTurnos batalhaTurnos;
    private BatalhaStatus batalhaStatus;

    private List<Observer> observers;

    public BatalhaFachada() {
        this.batalhaTurnos = new BatalhaTurnos();
        this.batalhaStatus = new BatalhaStatus();
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String evento) {
        for (Observer observer : observers) {
            observer.onNotify(evento);
        }
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
        notifyObservers("Batalha_Vencida");
    }
}