public class Carro extends Veiculo{

    public Carro(String modelo, int velocidadeMaxima, String buzina) {
        super(modelo, velocidadeMaxima, buzina);
    }

    @Override
    public String informacaoVeiculo() {
        return "\nModelo do Carro: " + getModelo() + " velocidade maxima é de " + getVelocidadeMaxima() + " tamanho da buzina: " + getBuzina() ;
    }
}
