package segundo_dia;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        boolean opcao = true;

        System.out.println("Bem-vindo ao Programa de Gerenciamento de Nomes");

        while (opcao) {
            System.out.println("************ Menu ************************************************");
            System.out.println("1. Cadastrar nomes");
            System.out.println("2. Listar nomes");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            System.out.println("****************************************************************");

            int opcaoEscolhida;

            if (scanner.hasNextInt()) {
                opcaoEscolhida = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Entrada inválida. Digite um número.");
                scanner.nextLine();
                continue;
            }

            if (opcaoEscolhida == 1) {
                System.out.print("Digite o nome: ");
                String nome = scanner.nextLine();
                lista.add(nome);
                System.out.println("Nome cadastrado com sucesso!");

            } else if (opcaoEscolhida == 2) {
                System.out.println("Lista de nomes:");
                if (lista.isEmpty()) {
                    System.out.println("Nenhum nome cadastrado. Favor voltar ao menu para cadastrar.");
                } else {
                    for (String nome : lista) {
                        System.out.println(nome);
                    }
                }

            } else if (opcaoEscolhida == 3) {
                System.out.println("Saindo do programa...");
                opcao = false;

            } else {
                System.out.println("Opção inválida, voltando ao menu...");
            }
        }

        scanner.close();
    }
}
