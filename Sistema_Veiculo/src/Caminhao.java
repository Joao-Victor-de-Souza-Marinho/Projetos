public class Caminhao extends Veiculo{


    public Caminhao(String modelo, int velocidadeMaxima, String buzina) {
        super(modelo, velocidadeMaxima, buzina);
    }

    @Override
    public String informacaoVeiculo() {
        return "\nModelo do Caminhão: " + getModelo() + " velocidade maxima é de " + getVelocidadeMaxima() + " tamanho da buzina: " + getBuzina() ;
    }
}
