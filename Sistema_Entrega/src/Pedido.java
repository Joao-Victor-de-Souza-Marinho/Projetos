import java.util.ArrayList;

public class Pedido {

    private String pedido;
    private int valor;

    public Pedido(String pedido, int valor) {
        this.pedido = pedido;
        this.valor = valor;
    }

    public String getPedido() {
        return pedido;
    }

    public int getValor() {
        return valor;
    }


}
