public class PersonagemFactory {
    public static Personagem criarGuerreiro(String nome, int forca) {
        return new Guerreiro(nome, forca);
    }

    public static Personagem criarArqueiro(String nome, int forca) {
        return new Arqueiro(nome, forca);
    }

    public static Personagem criarMago(String nome, int forca) {
        return new Mago(nome, forca);
    }
}
