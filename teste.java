public class TestePessoa {

    public static void main(String[] args) {


        Pessoa pessoa1 = new Pessoa("Andriele", 21, 163);

        Pessoa pessoa2 = new Pessoa("Mauricio", 19, 165);
      

        System.out.println("Pessoa 1:");

        System.out.println("Nome: " + pessoa1.getNome());

        System.out.println("Idade: " + pessoa1.getIdade());

        System.out.println("Altura: " + pessoa1.getAltura());


        System.out.println("\nPessoa 2:");

        System.out.println("Nome: " + pessoa2.getNome());

        System.out.println("Idade: " + pessoa2.getIdade());

        System.out.println("Altura: " + pessoa2.getAltura());

    }

}
