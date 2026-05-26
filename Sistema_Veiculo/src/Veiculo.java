public abstract class Veiculo {
    private String modelo;
    private int velocidadeMaxima;
    private String buzina;

    public Veiculo(String modelo, int velocidadeMaxima, String buzina){
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
        this.buzina = buzina;
    }

    public String getModelo(){
        return modelo;
    }

    public int getVelocidadeMaxima(){
        return velocidadeMaxima;
    }

    public String getBuzina(){
        return buzina;
    }

    public abstract String informacaoVeiculo();




}