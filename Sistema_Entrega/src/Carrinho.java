import java.util.ArrayList;

public class Carrinho{

    private ArrayList<Pedido> pedidos = new ArrayList<>();

    public void adicionarPedido(Pedido p){
        pedidos.add(p);
    }

    public void listarPedidos(){
        for(Pedido p : pedidos){
            System.out.println("Pedido: "+p.getPedido() + " - R$" + p.getValor());
        }
    }

    public int getValorTotal(){
        int soma = 0;
        for(Pedido p : pedidos){
            soma  += p.getValor();
        }
        return soma;
    }

}
