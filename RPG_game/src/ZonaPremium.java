public class ZonaPremium implements Zona {
    private String nome;

    public ZonaPremium(String nome) {
        this.nome = nome;
    }

    @Override
    public void acesso(Personagem personagem) {
        System.out.println(personagem.getClass().getSimpleName() + " acessou a zona premium: " + nome);
        // Implementação específica para zona premium
    }

}
