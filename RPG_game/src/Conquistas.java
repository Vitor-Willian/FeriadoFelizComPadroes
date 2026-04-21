public class Conquistas implements Observer {
    private int conquistasObtidas = 0;

    @Override
    public void onNotify(String evento) {
        if (evento.equals("Batalha_Vencida")) {
            conquistasObtidas++;
            System.out.println("Conquista obtida! Total de conquistas: " + conquistasObtidas);
        }
    }
    
}
