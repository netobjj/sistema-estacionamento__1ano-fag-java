import Carro.Carro;
import Pessoa.Pessoa;
import Produto.Produto;
import Retangulo.Retangulo;

import java.util.Scanner;

public class Main {
    public static void criarPessoa(Scanner scan) {
        Pessoa pessoa1 = new Pessoa();

        System.out.println("Digite o nome da pessoa:");
        String nome = scan.next();
        pessoa1.setNome(nome);

        System.out.println("Digite a idade da pessoa:");
        int idade = scan.nextInt();
        pessoa1.setIdade(idade);

        System.out.println("A pessoa foi criada:\n" + pessoa1.toString());
    }

    public static void criarProdutoEcalcularDesconto(Scanner scan) {
        Produto produto = new Produto();

        System.out.println("Digite o nome do produto:");
        String nome = scan.next();
        produto.setNome(nome);

        System.out.println("Digite o preco do produto:");
        double preco = scan.nextDouble();
        produto.setPreco(preco);
        produto.setPercentualDesconto(10);

        System.out.println("A pessoa foi criada:\n" + produto.toString());
    }

    public static void criarDuasPessoasECalcularAMaisVelha(Scanner scan) {
        Pessoa pessoa1 = new Pessoa();
        System.out.println("Digite o nome da 1ª pessoa:");
        pessoa1.setNome(scan.next());

        System.out.println("Digite a idade da 1ª pessoa:");
        pessoa1.setIdade(scan.nextInt());

        Pessoa pessoa2 = new Pessoa();
        System.out.println("Digite o nome da 2ª pessoa:");
        pessoa2.setNome(scan.next());

        System.out.println("Digite a idade da 2ª pessoa:");
        pessoa2.setIdade(scan.nextInt());

        if (pessoa1.getIdade() == pessoa2.getIdade()) {
            System.out.println("As idades são iguais: " + pessoa1.getIdade() + " anos.");
        } else if (pessoa1.getIdade() > pessoa2.getIdade()) {
            System.out.println(pessoa1.getNome() + " (" + pessoa1.getIdade() + " anos) é mais velho(a) que " + pessoa2.getNome() + " (" + pessoa2.getIdade() + " anos).");
        } else {
            System.out.println(pessoa2.getNome() + " (" + pessoa2.getIdade() + " anos) é mais velho(a) que " + pessoa1.getNome() + " (" + pessoa1.getIdade() + " anos).");
        }

    }

    public static void calcularAreaDeRetangulo(Scanner scan) {
        Retangulo retang = new Retangulo();


        System.out.println("Digite a base do Retângulo:");
        retang.setBase(scan.nextDouble());

        System.out.println("Digite a altura do Retângulo:");
        retang.setAltura(scan.nextDouble());

        System.out.println(retang.toString());
    }

    public static void ligarOuDesligarCarro(Scanner scan) {
        Carro carro1 = new Carro();

        System.out.println("Digite o modelo do carro:");
        carro1.setModelo(scan.next());

        System.out.println("\nDigite \n1 para ligar\n2 para desligar\n");
        int opcao = scan.nextInt();
        if(opcao == 1){
            carro1.setEstado("ligado");
            System.out.println(carro1.toString());
        } else if(opcao == 2) {
            carro1.setEstado("desligado");
            System.out.println(carro1.toString());
        } else {
            System.out.println("Você digitou uma opção inválida, tente novamente!");
        }


    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha uma opção: \n");
        System.out.println("1-Classe Pessoa");
        System.out.println("2-Criar Produto e calcular desconto");
        System.out.println("3-Criar 2 pessoas e mostrar a mais velha");
        System.out.println("4-Calcular a área de um Retângulo");
        System.out.println("5-Ligar ou desligar o carro");

        int option = scan.nextInt();

        if (option == 1) criarPessoa(scan);
        if (option == 2) criarProdutoEcalcularDesconto(scan);
        if (option == 3) criarDuasPessoasECalcularAMaisVelha(scan);
        if (option == 4) calcularAreaDeRetangulo(scan);
        if (option == 5) ligarOuDesligarCarro(scan);
    }
}
