import carro.Carro;
import pessoa.Pessoa;
import vaga.Vaga;
import garagem.Garagem;
//teste
teste = "";


import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static Garagem garagem = new Garagem();
    static ArrayList<Carro> listaCarros = new ArrayList<Carro>();
    static ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
    static Pessoa usuarioAtual;
    static Carro carroAtualEscolhido;

    public static void cadastrarPessoa(Scanner scan) {
        // pendente: validar CPF
        // https://www.devmedia.com.br/validando-o-cpf-em-uma-aplicacao-java/22097
        Pessoa novaPessoa = new Pessoa();

        System.out.println("Digite o nome da pessoa:");
        String nome = scan.next();
        novaPessoa.setNome(nome);

        System.out.println("Digite o CPF da pessoa:");
        String cpf = scan.next();
        novaPessoa.setCpf(cpf);

        listaPessoas.add(novaPessoa);
        System.out.println("A pessoa foi cadastrada com sucesso:\n" + novaPessoa.toString());
    }

    public static boolean cadastrarCarro(Scanner scan) {
        try {
            Carro carro = new Carro();

            System.out.println("Digite a placa do carro:");
            String placa = scan.next();
            carro.setPlaca(placa);

            System.out.println("Digite o modelo do carro:");
            String modelo = scan.next();
            carro.setModelo(modelo);

            System.out.println("Carro criado:\n" + carro.toString());
            listaCarros.add(carro);
            return true;
        } catch (Exception e) {
            System.out.println("Erro: não foi possível cadastrar o carro, tente novamente!\n");
            return false;
        }

    }

    public static void imprimirListaDeVagas(List lista) {
        for (Object vaga : lista) {
            System.out.println(vaga.toString());
        }
    }

    /*
     * public static boolean verificarSeCarroExiste() {
     * 
     * boolean carroExiste =
     * for (Carro carro : listaCarros) {
     * System.out.println(carro.getPlaca() + "\n" + placa);
     * if (carro.getPlaca().equals(placa)) {
     * carroAtualEscolhido = carro;
     * return true;
     * }
     * }
     * }
     */

    public static void estacionarCarro(Scanner scan) {
        boolean continuar = true;

        while (continuar) {
            System.out.println("Digite a placa do carro que deseja estacionar:");
            String placa = scan.next();
            boolean carroExiste = false;

            System.out.println(listaCarros);
            // verifica se o caro existe
            for (Carro carro : listaCarros) {
                System.out.println(carro.getPlaca() + "\n" + placa);
                if (carro.getPlaca().equals(placa)) {
                    carroExiste = true;
                    carroAtualEscolhido = carro;
                }

            }

            if (carroExiste) {
                System.out.println("Tenho essas vagas vazias:\n");

                List<Vaga> listaVagasVazias = garagem.getVagas().stream().filter(vaga -> vaga.getCarro() == null)
                        .toList();

                imprimirListaDeVagas(listaVagasVazias);

                System.out.println("Digite o número da vaga que deseja estacionar:\n");
                int numVagaEscolhida = scan.nextInt();
                boolean vagaDisponivel = false;

                for (Vaga v : listaVagasVazias) {
                    if (v.getNumero() == numVagaEscolhida) {
                        vagaDisponivel = true;
                        System.out.println("Carro " + carroAtualEscolhido.getPlaca() + " estacionado na vaga "
                                + v.getNumero() + " por " + usuarioAtual.getNome());
                        v.setCarro(carroAtualEscolhido);
                    }
                }

                System.out.println("\nEscolha uma opção:");
                System.out.println("1-Estacionar outro carro.");
                System.out.println("0-Voltar ao menu principal.");

            } else {
                System.out.println(
                        "\nA placa que você digitou não está cadastrada, deseja ir cadastrar agora? (Digite:\n1-Ir cadastrar carro agora\n2-Voltar ao menu principal\n3-Digitar novamente a placa)");
                int opcao = scan.nextInt();

                if (opcao == 1) {
                    cadastrarCarro(scan);
                } else if (opcao == 2) {
                    continuar = false;
                    System.out.println("Ok, vamos voltar!\n");
                } else if (opcao == 3) {
                    continuar = true;
                    System.out.println("Ok, vamos lá!\n");
                } else {
                    System.out.println("Opçao Inválida! Tente novamente!\n");
                }
            }
        }
    }

    public static void desestacionarCarro(Scanner scan) {
        boolean continuar = true;

        while (continuar) {
            System.out.println("Digite a placa do carro que deseja remover da garagem:");
            String placa = scan.next();
            boolean carroExiste = false;

            // System.out.println(listaCarros);
            // verifica se o caro existe
            for (Carro carro : listaCarros) {
                System.out.println(carro.getPlaca() + "\n" + placa);
                if (carro.getPlaca().equals(placa)) {
                    carroExiste = true;
                    carroAtualEscolhido = carro;
                }

            }

            if (carroExiste) {
                System.out.println("Tenho essas vagas vazias:\n");

                List<Vaga> vagaDoCarro = garagem.getVagas().stream()
                        .filter(vaga -> vaga.getCarro() != null).toList();

                vagaDoCarro.stream().filter(vaga -> vaga.getCarro().getPlaca().equals(placa))
                        .toList();

                imprimirListaDeVagas(vagaDoCarro);

                System.out.println("Tem certeza que deseja remover esse carro?\n1-Sim \n2-Nao");
                int opcao = scan.nextInt();
                String msg = "Nao foi possivel remover o carro!";

                if (opcao == 1) {
                    for (Vaga vaga : garagem.getVagas()) {
                        if (vaga.getCarro() != null) {
                            if (vaga.getCarro().getPlaca().equals(placa)) {
                                vaga.setCarro(null);
                                msg = "Carro removido com sucesso!";
                            }
                        }

                    }
                }

                System.out.println(msg);

            } else {
                System.out.println(
                        "\nA placa que você digitou não está cadastrada, deseja ir cadastrar agora? (Digite:\n1-Ir cadastrar carro agora\n2-Voltar ao menu principal\n3-Digitar novamente a placa)");
                int opcao = scan.nextInt();

                if (opcao == 1) {
                    cadastrarCarro(scan);
                } else if (opcao == 2) {
                    continuar = false;
                    System.out.println("Ok, vamos voltar!\n");
                } else if (opcao == 3) {
                    continuar = true;
                    System.out.println("Ok, vamos lá!\n");
                } else {
                    System.out.println("Opçao Inválida! Tente novamente!\n");
                }
            }
        }
    }

    public static void relatorioDeVagas() {
        imprimirListaDeVagas(garagem.getVagas());
    }

    public static void geraAsVagasDaGaragem() {
        // gera as vagas da garagem
        for (int i = 0; i < 10; i++) {
            Vaga vaga = new Vaga(i);
            garagem.setVaga(vaga);
        }
    }

    public static void main(String[] args) {
        geraAsVagasDaGaragem();

        Scanner scan = new Scanner(System.in);
        boolean pessoaExiste = false;

        int option = -1;
        while (option != 0) {
            if (listaPessoas.size() == 0) {
                System.out.println("\n\nNão há nehuma pessoa cadastrada! Vamos começar cadastrando...\n\n");
                cadastrarPessoa(scan);
            }

            if (!pessoaExiste) {
                System.out.println("Digite o CPF para usar o sistema:\n");
                String cpf = scan.next();

                for (Pessoa pess : listaPessoas) {
                    if (pess.getCpf().equals(cpf)) {
                        usuarioAtual = pess;
                        pessoaExiste = true;
                    }

                }
            }

            if (pessoaExiste) {
                System.out.println("\nAcesso liberado para: \n" + usuarioAtual.getNome());
                System.out.println("Escolha uma opção: \n");
                System.out.println("1-Cadastrar Pessoa.");
                System.out.println("2-Cadastrar Carro.");
                System.out.println("3-Estacionar Carro.");
                System.out.println("4-Desestacionar Carro.");
                System.out.println("5-Relatorio de Vagas");
                System.out.println("0-Sair");

                option = scan.nextInt();

                if (option == 1)
                    cadastrarPessoa(scan);
                if (option == 2)
                    cadastrarCarro(scan);
                if (option == 3)
                    estacionarCarro(scan);
                if (option == 4)
                    desestacionarCarro(scan);
                if (option == 5)
                    relatorioDeVagas();
                // if (option == 0)
            } else {
                System.out.println("Não encontramos uma pessoa com este CPF, por favor, tente novamente!\n");
            }

        }
    }
}
