public interface Personagem {

    String getNome();
    int ataque(Mob alvo);
    
    void setEstrategiaAtaque(EstrategiaAtaque estrategia);

    int getPoder();
    int getMaxHp();
    int getHp();
}
