package desafios.set_treeSet_linkedHashSet;

import desafios.set_treeSet_linkedHashSet.entity.service.ProdutoService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProdutoService produtoService = new ProdutoService();

        System.out.println("\n📦 Bem-vindo ao sistema de cadastro de produtos");
        System.out.println("--------------------------------");

        boolean execucao = true;
        while (execucao) {
            System.out.println("\n========= MENU =========");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Ver todos os produtos");
            System.out.println("3 - Remover produto");
            System.out.println("4 - Verificar se produto existe");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.hasNextInt() ? scanner.nextInt() : -1;
            scanner.nextLine(); // limpa buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome do produto: ");
                    String nome = scanner.nextLine();

                    System.out.print("Marca do produto: ");
                    String marca = scanner.nextLine();

                    System.out.print("Preço: ");
                    double preco = scanner.nextDouble();

                    System.out.print("Quantidade: ");
                    int quantidade = scanner.nextInt();
                    scanner.nextLine();

                    boolean adicionado = produtoService.adicionarProduto(nome, preco, quantidade, marca);
                    if (adicionado) {
                        System.out.println("✅ Produto cadastrado com sucesso!");
                    } else {
                        System.out.println("⚠️ Produto já existe no sistema.");
                    }
                    break;

                case 2:
                    System.out.println("\n📋 Lista de produtos:");
                    produtoService.listarProdutos();
                    break;

                case 3:
                    System.out.print("Nome do produto a remover: ");
                    String nomeRemover = scanner.nextLine();

                    System.out.print("Marca do produto a remover: ");
                    String marcaRemover = scanner.nextLine();

                    boolean removido = produtoService.removerProduto(nomeRemover, marcaRemover);
                    if (removido) {
                        System.out.println("🗑 Produto removido com sucesso.");
                    } else {
                        System.out.println("❌ Produto não encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Nome do produto a verificar: ");
                    String nomeVerificar = scanner.nextLine();

                    System.out.print("Marca do produto: ");
                    String marcaVerificar = scanner.nextLine();

                    boolean existe = produtoService.verificarProdutoExiste(nomeVerificar, marcaVerificar);
                    if (existe) {
                        System.out.println("✅ Produto encontrado no sistema.");
                    } else {
                        System.out.println("🔍 Produto não existe.");
                    }
                    break;

                case 5:
                    execucao = false;
                    System.out.println("👋 Saindo... Até a próxima!");
                    break;

                default:
                    System.out.println("❌ Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}
