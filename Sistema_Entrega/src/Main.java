import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        Carrinho carrinho = new Carrinho();

        Cliente cliente = new Cliente();

        System.out.println("Digite o nome do cliente: ");
        cliente.setNome(sc.next());

        System.out.println("Olá " + cliente.getNome() +" Quandos pedidos vai fazer?");
        int qtd = sc.nextInt();

        for (int i = 0; i < qtd; i++) {

            System.out.println("Digite seu pedido:");
            String nome = sc.next();

            System.out.println("Digite o valor do pedido:");
            int valor = sc.nextInt();
            sc.nextLine();

            Pedido pedido = new Pedido(nome, valor);
                carrinho.adicionarPedido(pedido);
        }
        System.out.println("\nPedidos cadastrados:");
        carrinho.listarPedidos();
        System.out.println("Valor total: ");
        System.out.println(carrinho.getValorTotal());

    sc.close();
    }
}