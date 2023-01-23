public class BolaDeFogo {
    private int poder;

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }
    
    public void mover(int x, int y){
        System.out.println("Movendo Bola de fogo p: "+x+" "+y);
    }
}

