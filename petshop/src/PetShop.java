import java.util.ArrayList;
import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Animal> animais = new ArrayList<>();
        int escolha = 0;
        while (escolha != 5){
            System.out.println("\n╔════════════════════════════╗");
            System.out.println("║     ESCOLHA UM ANIMAL      ║");
            System.out.println("╠════════════════════════════╣");
            System.out.println("║ 1 - Cachorro               ║");
            System.out.println("║ 2 - Gato                   ║");
            System.out.println("║ 3 - Pássaro                ║");
            System.out.println("║ 4 - Visualizar todos       ║");
            System.out.println("║ 5 - Sair                   ║");
            System.out.println("╚════════════════════════════╝");
            System.out.print("Digite sua opção: ");

            escolha = sc.nextInt();
            sc.nextLine();

            switch (escolha){
                case 1:
                    System.out.println("\n=== Cadastro de Cachorro ===");
                    System.out.print("Nome: ");
                    String nome1 = sc.nextLine();
                    System.out.print("Idade: ");
                    int idade1 = Integer.parseInt(sc.nextLine());
                    Animal c1 = new Cachorro(nome1, idade1);
                    animais.add(c1);
                    break;

                case 2:
                    System.out.println("\n=== Cadastro de Gato ===");
                    System.out.print("Nome: ");
                    String nome2 = sc.nextLine();
                    System.out.print("Idade: ");
                    int idade2 = Integer.parseInt(sc.nextLine());
                    Animal c2 = new Gato(nome2, idade2);
                    animais.add(c2);
                    break;

                case 3:
                    System.out.println("\n=== Cadastro de Pássaro ===");
                    System.out.print("Nome: ");
                    String nome3 = sc.nextLine();
                    System.out.print("Idade: ");
                    int idade3 = Integer.parseInt(sc.nextLine());
                    Animal c3 = new Passaro(nome3, idade3);
                    animais.add(c3);
                    break;

                case 4:
                    if (animais.isEmpty()){
                        System.out.println("Nenhum animal cadastrado!");
                    }else {
                        for (int i = 0; i < animais.size(); i++) {
                        Animal a = animais.get(i);
                            System.out.println("Nome: " +a.getNome() + ", " + "Idade: "+a.getIdade());

                            a.somAnimal();
                        }
                    }
                    break;

                case 5:
                    System.out.println("Desligando programa...");
                    break;


                default:
                    System.out.println("Opção invalida!");
                    break;
            }

        }
        System.out.println("Até a proxima!");




    }
}