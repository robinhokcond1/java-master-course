package quarto_dia.desafio_fila;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class AtendimentoService {

    private final LinkedList<Pessoa> filaAtendimento = new LinkedList<>();
    private final List<Pessoa> listaEspera = new ArrayList<>();

    public void adicionarPessoa(String nome, int idade) {
        Pessoa novaPessoa = new Pessoa(nome, idade);
        filaAtendimento.addLast(novaPessoa);  // Fila FIFO
        listaEspera.add(novaPessoa);          // Lista para ordenar depois
    }

    public Pessoa atenderProxima() {
        return filaAtendimento.pollFirst(); // retorna e remove da fila
    }

    public List<Pessoa> verFilaAtual() {
        return filaAtendimento;
    }

    public List<Pessoa> verListaOrdenada() {
        List<Pessoa> copia = new ArrayList<>(listaEspera);
        copia.sort(Comparator.comparing(Pessoa::getNome));
        return copia;
    }
}