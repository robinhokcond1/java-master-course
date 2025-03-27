package segundo_dia.desafio_extra;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BibliotecaService {
    private final List<Livro> listaLivros = new ArrayList<>();

    public boolean adicionarLivro(int id, String titulo, String autor, int ano ) {
        if (id == 0 || titulo.isBlank() || autor.isBlank() || ano < 1900) {
            return false;
        }
        listaLivros.add(new Livro(id, titulo, autor, ano));
        return true;
    }

    public  List<Livro> listarLivros() {
        return listaLivros;
    }
    public List<Livro> buscarLivroPorTitulo(String titulo){
        List<Livro> titulosEncontrados = new ArrayList<>();
        for (Livro livro : listaLivros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                titulosEncontrados.add(livro);
            }
        }
        return titulosEncontrados;
    }
    public List<String> listarAutoresUnicos() {
        Set<String> autores = new HashSet<>();
        for (Livro livro : listaLivros) {
            autores.add(livro.getAutor());
        }
        return new ArrayList<>(autores);
    }

}
