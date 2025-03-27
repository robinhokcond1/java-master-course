package segundo_dia.desafio_extra;

import java.util.ArrayList;
import java.util.List;

public class ProdutoService {

    private final List<Produto> listaProdutos = new ArrayList<>();

    public boolean adicionarProduto(String nome, double preco, int quantidade) {
        if (nome == null || nome.isBlank() || preco < 0 || quantidade < 0) {
            return false;
        }
        listaProdutos.add(new Produto(nome, preco, quantidade));
        return true;
    }

    public List<Produto> listarProdutos() {
        return listaProdutos;
    }

    public List<Produto> buscarPorNome(String nome) {
        List<Produto> encontrados = new ArrayList<>();
        for (Produto p : listaProdutos) {
            if (p.getName().equalsIgnoreCase(nome)) {
                encontrados.add(p);
            }
        }
        return encontrados;
    }
}
