package quarto_dia.desafio_fila;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AtendimentoService service = new AtendimentoService();
        Scanner scanner = new Scanner(System.in);
        boolean executando = true;

        System.out.println("📋 Sistema de Fila de Atendimento");

        while (executando) {
            System.out.println("\n========= MENU =========");
            System.out.println("1 - Adicionar pessoa à fila");
            System.out.println("2 - Atender próxima pessoa");
            System.out.println("3 - Mostrar fila atual");
            System.out.println("4 - Mostrar lista ordenada por nome");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.hasNextInt() ? scanner.nextInt() : -1;
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();

                    service.adicionarPessoa(nome, idade);
                    System.out.println("✅ Pessoa adicionada à fila.");
                    break;

                case 2:
                    Pessoa atendida = service.atenderProxima();
                    if (atendida != null) {
                        System.out.println("🙋 Pessoa atendida: " + atendida);
                    } else {
                        System.out.println("❌ Nenhuma pessoa na fila.");
                    }
                    break;

                case 3:
                    List<Pessoa> fila = service.verFilaAtual();
                    System.out.println("🧾 Fila atual:");
                    fila.forEach(System.out::println);
                    break;

                case 4:
                    List<Pessoa> ordenada = service.verListaOrdenada();
                    System.out.println("📚 Lista de espera (ordenada):");
                    ordenada.forEach(System.out::println);
                    break;

                case 5:
                    executando = false;
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("⚠️ Opção inválida.");
            }
        }

        scanner.close();
    }
}
