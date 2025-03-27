package segundo_dia.desafio_extra;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProdutoService service = new ProdutoService();
        boolean executando = true;

        System.out.println("Bem-vindo ao Programa de Gerenciamento de Produtos");

        while (executando) {
            System.out.println("\n=========== MENU ===========");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Listar Produtos");
            System.out.println("3 - Buscar Produto por nome");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.hasNextInt() ? scanner.nextInt() : -1;
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Preço: ");
                    double preco = scanner.nextDouble();
                    System.out.print("Quantidade: ");
                    int qtd = scanner.nextInt();
                    scanner.nextLine();

                    if (service.adicionarProduto(nome, preco, qtd)) {
                        System.out.println("Produto cadastrado com sucesso!");
                    } else {
                        System.out.println("Erro: dados inválidos.");
                    }
                    break;

                case 2:
                    List<Produto> produtos = service.listarProdutos();
                    if (produtos.isEmpty()) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else {
                        produtos.forEach(System.out::println);
                    }
                    break;

                case 3:
                    System.out.print("Digite o nome do produto: ");
                    String nomeBusca = scanner.nextLine();
                    List<Produto> encontrados = service.buscarPorNome(nomeBusca);
                    if (encontrados.isEmpty()) {
                        System.out.println("Nenhum produto encontrado.");
                    } else {
                        encontrados.forEach(System.out::println);
                    }
                    break;

                case 4:
                    executando = false;
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
