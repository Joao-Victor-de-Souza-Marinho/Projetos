public class Moto extends Veiculo{

    public Moto(String modelo, int velocidadeMaxima, String buzina) {
        super(modelo, velocidadeMaxima, buzina);
    }

    @Override
    public String informacaoVeiculo() {
        return "\nModelo da moto " + getModelo() + " velocidade maxima é de " + getVelocidadeMaxima() + " tamanho da buzina: " + getBuzina() ;
    }
}
