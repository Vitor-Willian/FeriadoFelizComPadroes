public class Mob {
    private String nome;
    private int hp;

    public Mob(String nome, int hp) {
        this.nome = nome;
        this.hp = hp;
    }

    public String getNome() {
        return nome;
    }

    public int getHp() {
        return hp;
    }

    public void receberDano(int dano) {
        this.hp -= dano;
        if (this.hp < 0) {
            this.hp = 0;
        }
    }

}
