import java.util.Scanner;

public class Garagem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Veiculo veiculo = null;

        System.out.println("Qual Veiculo guardado deseja conferir?");
        System.out.println("1 - moto");
        System.out.println("2 - caminhão");
        System.out.println("3 - carro");
        int escolha = sc.nextInt();

        switch (escolha){

            case 1:
                veiculo = new Moto("Yamaha", 160, "Pequena");
                System.out.println(veiculo.informacaoVeiculo());
                break;
            case 2:
                veiculo = new Caminhao("Scania", 110, "Grande");
                System.out.println(veiculo.informacaoVeiculo());
                break;
            case 3:
                veiculo = new Carro("BYD", 140,"Média");
                System.out.println(veiculo.informacaoVeiculo());
        }


    }
}