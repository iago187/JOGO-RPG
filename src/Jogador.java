public abstract class Jogador implements Visivel{

    private String nome;
    private int hp;
    private int xp;
    private boolean veneno;

    public abstract void mover(int x, int y);

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public int getXp() {
        return xp;
    }
    public void setXp(int xp) {
        this.xp = xp;
    }
    public boolean isVeneno() {
        return veneno;
    }
    public void setVeneno(boolean veneno) {
        this.veneno = veneno;
    }

    
}
