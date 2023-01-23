public class App {
    public static void main(String[] args) throws Exception {
        var fase = new Fase();
        var mago = new Mago();
        var guerreiro = new Guerreiro();

        fase.carregar(mago);
        fase.carregar(new Dragao());
        fase.carregar(new Dragao());
        // pq nao sobe esse caraio

    }
}
