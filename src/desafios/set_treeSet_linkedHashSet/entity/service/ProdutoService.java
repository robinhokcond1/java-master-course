package desafios.set_treeSet_linkedHashSet.entity.service;

import desafios.set_treeSet_linkedHashSet.entity.ProdutosEntity;

import java.util.Set;
import java.util.TreeSet;

public class ProdutoService {

    private final Set<ProdutosEntity> listaProdutos = new TreeSet<>();

    public boolean adicionarProduto(String nome, double preco, int quantidade, String marca) {
        ProdutosEntity produto = new ProdutosEntity(nome, preco, quantidade, marca);
        if (listaProdutos.contains(produto)) {
            return false;
        }
        listaProdutos.add(produto);
        return true;
    }

    public void listarProdutos() {
        if (listaProdutos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            for (ProdutosEntity produto : listaProdutos) {
                System.out.println(produto);
            }
        }
    }

    public boolean removerProduto(String nome, String marca) {
        return listaProdutos.removeIf(p ->
                p.getNome().equalsIgnoreCase(nome) &&
                        p.getMarca().equalsIgnoreCase(marca)
        );
    }

    public boolean verificarProdutoExiste(String nome, String marca) {
        return listaProdutos.stream()
                .anyMatch(p -> p.getNome().equalsIgnoreCase(nome) &&
                        p.getMarca().equalsIgnoreCase(marca));
    }
}
