public class Cachorro extends Animal {

    public Cachorro(String nome, int idade){
        super(nome,idade);
    }

    @Override
    public void somAnimal(){
        System.out.println("Au Au");
    }

}
