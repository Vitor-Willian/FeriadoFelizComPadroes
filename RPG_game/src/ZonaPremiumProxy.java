public class ZonaPremiumProxy implements Zona {
    private ZonaPremium zonaPremium;
    private String nomeZona;

    public ZonaPremiumProxy(String nomeZona) {
        this.nomeZona = nomeZona;
    }

    @Override
    public void acesso(Personagem personagem) {

        System.out.println("Verificando acesso para " + personagem.getClass().getSimpleName() + "...");
        
        if (personagem instanceof Guerreiro && ((Guerreiro) personagem).isPremium()){
            if (zonaPremium == null) {
                zonaPremium = new ZonaPremium(nomeZona);
            }
            zonaPremium.acesso(personagem);
        } else if (personagem instanceof Arqueiro && ((Arqueiro) personagem).isPremium()){
            if (zonaPremium == null) {
                zonaPremium = new ZonaPremium(nomeZona);
            }
            zonaPremium.acesso(personagem);
        } else if (personagem instanceof Mago && ((Mago) personagem).isPremium()){
            if (zonaPremium == null) {
                zonaPremium = new ZonaPremium(nomeZona);
            }
            zonaPremium.acesso(personagem);
        } else {
            System.out.println("Acesso negado. " + personagem.getClass().getSimpleName());
        }
    }
}
