
package br.com.livraria.mock;

import br.com.livraria.model.livros.Livro;
import java.util.ArrayList;
import java.util.List;


public class MockLivro {

    private static int idLivros = 0;

    private static List<Livro> listaLivros = new ArrayList<>();

    /**
     *Adiciona um livro ao mock
     * @param livro
     * @throws Exception
     */
    public static void inserir(Livro livro)
            throws Exception {
        livro.setId(idLivros++);
        listaLivros.add(livro);
    }

    /**
     *Substitui um livro sem necessidade de 
     * excluir e inserir novamente.
     * @param livroUpdate
     * @throws Exception
     */
    public static void atualizar(Livro livroUpdate)
            throws Exception {
        if (livroUpdate != null
                && livroUpdate.getId() != null
                && listaLivros.size() > 0) {
            int contador = 0;
            boolean livroAtualizado = false;
            while (contador < listaLivros.size() && !livroAtualizado) {
                Livro livroLista = listaLivros.get(contador);
                if (livroLista != null
                        && livroLista.getId() == livroUpdate.getId()) {

                    livroLista.setTitulo(livroUpdate.getTitulo());
                    livroLista.setEditora(livroUpdate.getEditora());
                    livroLista.setGenero(livroUpdate.getGenero());
                    livroLista.setIdioma(livroUpdate.getIdioma());
                    livroLista.setAutor(livroUpdate.getAutor());
                    livroLista.setIsbn(livroUpdate.getIsbn());
                    livroLista.setAcabamento(livroUpdate.getAcabamento());
                    livroLista.setPapel(livroUpdate.getPapel());
                    livroLista.setValor(livroUpdate.getValor());
                    livroLista.setPaginas(livroUpdate.getPaginas());
                    livroLista.setAno(livroUpdate.getAno());

                    livroAtualizado = true;

                }
                contador++;
            }
        } else {
            throw new Exception("Não há livro para atualizar");
        }
    }

    /**
     *Exclui o livro com Id igual ao parametro
     * @param id
     * @throws Exception
     */
    public static void excluir(int id)
            throws Exception {
        if (listaLivros.size() > 0) {

            int posicao = 0;
            boolean livroRemovido = false;
            while (posicao < listaLivros.size() && !livroRemovido) {
                Livro livroLista = listaLivros.get(posicao);
                if (livroLista != null && livroLista.getId() == id) {
                    listaLivros.remove(posicao);
                    livroRemovido = true;
                }
                posicao++;
            }
        } else {
            throw new Exception("Não há livro para remover");
        }
    }

    /**
     *Retorna uma lista com todos os livros disponíveis
     * @return
     * @throws Exception
     */
    public static List<Livro> listar()
            throws Exception {
        return listaLivros;
    }

    /**
     *Retorna uma lista com todos os livros que
     * possuem titulo especificado
     * @param titulo
     * @return
     * @throws Exception
     */
    public static List<Livro> buscarTitulo(String titulo)
            throws Exception {
        List<Livro> listaResultado = new ArrayList<>();
        if (titulo != null && listaLivros.size() > 0) {

            int posicao = 0;
            while (posicao < listaLivros.size()) {

                Livro livroLista = listaLivros.get(posicao);

                if (livroLista != null && livroLista.getTitulo() != null) {
                    if (livroLista.getTitulo().contains(titulo)) {
                        listaResultado.add(livroLista);
                    }
                }
                posicao++;
            }
        } else {
            throw new Exception("Não há dados para pesquisa");
        }
        return listaResultado;
    }

    /**
     *Retorna uma lista com todos os livros
     * que possuem o autor especificado
     * @param autor
     * @return
     * @throws Exception
     */
    public static List<Livro> buscarAutor(String autor)
            throws Exception {
        List<Livro> listaResultado = new ArrayList<>();
        if (autor != null && listaLivros.size() > 0) {

            int posicao = 0;
            while (posicao < listaLivros.size()) {

                Livro livroLista = listaLivros.get(posicao);

                if (livroLista != null && livroLista.getAutor() != null) {
                    if (livroLista.getTitulo().contains(autor)) {
                        listaResultado.add(livroLista);
                    }
                }
                posicao++;
            }
        } else {
            throw new Exception("Não há dados para pesquisa");
        }
        return listaResultado;
    }

    /**
     *Retorna o livro com o id especificado
     * @param id
     * @return
     * @throws Exception
     */
    public static Livro obter(int id)
            throws Exception {
        if (listaLivros.size() > 0) {

            int posicao = 0;
            while (posicao < listaLivros.size()) {

                Livro livroLista = listaLivros.get(posicao);
                if (livroLista != null
                        && livroLista.getId() != null
                        && livroLista.getId() == id) {
                    return livroLista;
                }
                posicao++;
            }
        } else {
            throw new Exception("Não há dados para pesquisa");
        }
        return null;
    }

}
