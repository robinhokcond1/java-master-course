package terceiro_dia.desafio_extra;

import segundo_dia.desafio_extra.BibliotecaService;
import segundo_dia.desafio_extra.Livro;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BibliotecaService bibliotecaService = new BibliotecaService();
        boolean execucao = true;
        int contadorId = 1;

        System.out.println("Bem-vindo ao Programa para Cadastro de Livros!");

        while (execucao) {
            System.out.println("\n=========== MENU ===========");
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Listar todos os livros");
            System.out.println("3 - Buscar livro por título");
            System.out.println("4 - Mostrar autores únicos");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcaoEscolhida;

            if (scanner.hasNextInt()) {
                opcaoEscolhida = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Entrada inválida. Digite um número.");
                scanner.nextLine();
                continue;
            }

            switch (opcaoEscolhida) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();

                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();

                    System.out.print("Ano de publicação: ");
                    int ano = scanner.nextInt();
                    scanner.nextLine();

                    boolean sucesso = bibliotecaService.adicionarLivro(contadorId++, titulo, autor, ano);
                    if (sucesso) {
                        System.out.println("✅ Livro cadastrado com sucesso!");
                    } else {
                        System.out.println("❌ Dados inválidos. Verifique os campos.");
                    }
                    break;

                case 2:
                    System.out.println("\n📚 Lista de livros cadastrados:");
                    List<Livro> livros = bibliotecaService.listarLivros();
                    if (livros.isEmpty()) {
                        System.out.println("Nenhum livro cadastrado.");
                    } else {
                        livros.forEach(System.out::println);
                    }
                    break;

                case 3:
                    System.out.print("Digite o título a ser buscado: ");
                    String buscaTitulo = scanner.nextLine();
                    List<Livro> encontrados = bibliotecaService.buscarLivroPorTitulo(buscaTitulo);
                    if (encontrados.isEmpty()) {
                        System.out.println("❌ Nenhum livro encontrado com esse título.");
                    } else {
                        System.out.println("📗 Livros encontrados:");
                        encontrados.forEach(System.out::println);
                    }
                    break;

                case 4:
                    System.out.println("\n👤 Autores únicos:");
                    bibliotecaService.listarAutoresUnicos()
                            .forEach(System.out::println);
                    break;

                case 5:
                    execucao = false;
                    System.out.println("Saindo do programa... Até mais!");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
