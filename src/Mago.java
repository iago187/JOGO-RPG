public class Mago extends Jogador {
    private int mp;

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public void mover(int x, int y){
        System.out.println("Movendo mago p: "+x+" "+y);
    }
}
