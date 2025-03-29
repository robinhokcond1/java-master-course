package desafios.linkedList;

import desafios.linkedList.entity.PessoaEntity;
import desafios.linkedList.service.FilaService;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FilaService filaService = new FilaService();

        System.out.println("\nBem vindo a fila de atendimentos");
        System.out.println("--------------------------------");

        boolean execucao = true;
        while (execucao) {
            System.out.println("\n========= MENU =========");
            System.out.println("1 - Adicionar pessoa à fila");
            System.out.println("2 - Cancelar pessoa da fila");
            System.out.println("3 - Atender próxima pessoa");
            System.out.println("4 - Ver fila atual");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.hasNextInt() ? scanner.nextInt() : -1;
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Informe o seu nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Informe sua idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();

                    if (idade < 0) {
                        System.out.println("Idade não pode ser negativa");
                        return;
                    }
                    filaService.adicionarPessoa(nome, idade);
                    System.out.println("✅ Pessoa adicionada à fila.");
                    break;
                case 2:
                    System.out.print("Informe o nome da pessoa para cancelar: ");
                    nome = scanner.nextLine();

                    if (filaService.cancelarPessoa(nome)) {
                        System.out.println("✅ Pessoa cancelada da fila.");

                    } else {
                        System.out.println("Pessoa não encontrada na fila.");
                    }
                    break;
                case 3:
                    filaService.atenderPessoa();
                    break;
                case 4:
                    filaService.listarFila();
                    break;
                case 5:
                    execucao = false;
                    break;
                default:
                    System.out.println("Opção inválida");
            }
            System.out.println("==========================");
        }
        scanner.close();
    }

}
