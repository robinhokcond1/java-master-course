package desafios.linkedList.service;

import desafios.linkedList.entity.PessoaEntity;

import java.util.LinkedList;

public class FilaService {

    private LinkedList<PessoaEntity> listaPessoa = new LinkedList<>();

    public void adicionarPessoa(String nome, int idade) {
        PessoaEntity pessoa = new PessoaEntity(nome, idade);
        if (idade >= 60) {
            listaPessoa.addFirst(pessoa);
        }else {
            listaPessoa.addLast(pessoa);
        }
    }
    public boolean cancelarPessoa(String nome) {
        return listaPessoa.removeIf(p -> p.getNome().equalsIgnoreCase(nome));
    }

    public PessoaEntity atenderPessoa() {
        return listaPessoa.poll();
    }
    public void listarFila() {
        if (listaPessoa.isEmpty()) {
            System.out.println("Fila vazia.");
        } else {
            System.out.println("🧾 Fila atual:");
            for (PessoaEntity pessoa : listaPessoa) {
                System.out.println("- " + pessoa);
            }
        }
    }

}
