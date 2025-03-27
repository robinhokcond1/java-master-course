package terceiro_dia;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> listaDuplicados = new ArrayList<>();
        boolean execucao = true;

        System.out.println("Bem-vindo ao programa para treinar estrutura de dados Collections");

        while (execucao) {
            System.out.println("\n************ Menu ************");
            System.out.println("1. Adicionar nome na lista");
            System.out.println("2. Mostrar lista de nomes (com duplicados)");
            System.out.println("3. Mostrar nomes únicos (sem duplicados)");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcaoEscolhida;

            if (scanner.hasNextInt()) {
                opcaoEscolhida = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Opção inválida. Tente novamente.");
                scanner.nextLine();
                continue;
            }

            switch (opcaoEscolhida) {
                case 1:
                    System.out.print("Digite um nome: ");
                    String nome = scanner.nextLine().trim();

                    if (nome.isEmpty()) {
                        System.out.println("Nome não pode ser vazio!");
                    } else {
                        listaDuplicados.add(nome);
                        System.out.println("Nome adicionado com sucesso!");
                    }
                    break;

                case 2:
                    System.out.println("\nLista de nomes (com duplicados):");
                    if (listaDuplicados.isEmpty()) {
                        System.out.println("Nenhum nome cadastrado.");
                    } else {
                        for (String n : listaDuplicados) {
                            System.out.println(n);
                        }
                    }
                    break;

                case 3:
                    System.out.println("\nLista de nomes únicos:");
                    if (listaDuplicados.isEmpty()) {
                        System.out.println("Nenhum nome cadastrado.");
                    } else {
                        Set<String> nomesUnicos = new HashSet<>(listaDuplicados);
                        for (String n : nomesUnicos) {
                            System.out.println(n);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Saindo do programa... Até logo!");
                    execucao = false;
                    break;

                default:
                    System.out.println("Opção inválida. Escolha entre 1 e 4.");
            }
        }

        scanner.close();
    }
}
