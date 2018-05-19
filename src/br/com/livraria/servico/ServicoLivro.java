package br.com.livraria.servico;

import br.com.livraria.mock.MockLivro;
import br.com.livraria.model.livros.Livro;
import br.com.livraria.model.validadores.ValidadorLivro;
import java.util.List;

public class ServicoLivro {

    public static String cadastrarLivro(Livro livro) {
        String resposta = null;
        resposta = ValidadorLivro.validar(livro);
        if (resposta == null) {
            try {
                MockLivro.inserir(livro);
            } catch (Exception e) {
                e.printStackTrace();
                resposta = "Erro na fonte de dados";
            }
        }
        return resposta;
    }

    public static String atualizarLivro(Livro livro) {
        String resposta = null;
        resposta = ValidadorLivro.validar(livro);
        if (resposta == null) {
            try {
                MockLivro.atualizar(livro);
            } catch (Exception e) {
                e.printStackTrace();
                resposta = "Erro na fonte de dados";
            }
        }
        return resposta;
    }

    public static String excluirLivro(Integer id) {
        String resposta = null;
        try {
            MockLivro.excluir(id);
        } catch (Exception e) {
            e.printStackTrace();
            resposta = "Erro na fonte de dados";
        }
        return resposta;
    }

    public static List<Livro> procurarAutor(String autor) {
        List<Livro> listaResposta = null;
        try {
            if (autor == null || "".equals(autor)) {
                listaResposta = MockLivro.listar();
            } else {
                listaResposta = MockLivro.buscarAutor(autor);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaResposta;
    }

    public static List<Livro> procurarTitulo(String titulo) {
        List<Livro> listaResposta = null;
        try {
            if (titulo == null || "".equals(titulo)) {
                listaResposta = MockLivro.listar();
            } else {
                listaResposta = MockLivro.buscarTitulo(titulo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaResposta;
    }

    public static Livro obterLivro(Integer id) {
        Livro livroResposta = null;
        try {
            livroResposta = MockLivro.obter(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return livroResposta;
    }
}
