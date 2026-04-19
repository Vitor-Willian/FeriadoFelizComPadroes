public class Config {
    private Config() {}

    private static Config instance;

    private String dificuldade = "Normal";
    private int ForcaMax = 100;

    public static Config getInstance() {
        if (instance == null) {
            instance = new Config();
        }
        return instance;
    }

    public void carregarConfig() {
        System.out.println("Configurações carregadas.");
        System.out.println("Dificuldade: " + dificuldade);
        System.out.println("Força Máxima: " + ForcaMax);
    }

    public String getDificuldade() {
        return this.dificuldade;
    }

    public void setDificuldade(String novaDificuldade) {
        this.dificuldade = novaDificuldade;
    }

    public int getForcaMax() {
        return this.ForcaMax;
    }

    public void setForcaMax(int novaForcaMax) {
        this.ForcaMax = novaForcaMax;
    }
}
