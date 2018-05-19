package br.com.livraria.model.validadores;

import br.com.livraria.model.livros.Livro;

public class ValidadorLivro {

    public static String validar(Livro livro) {

        if (livro == null) {
            return "Não foi informado um livro";
        }

        if (livro.getTitulo() == null || "".equals(livro.getTitulo())) {
            return "Não foi informado o título";
        }
        if (livro.getAcabamento() == null || "".equals(livro.getAcabamento())) {
            return "Não foi informado o acabamento";
        }
        if (livro.getEditora() == null || "".equals(livro.getEditora())) {
            return "Não foi informado a editora";
        }
        if (livro.getGenero() == null || "".equals(livro.getGenero())) {
            return "Não foi informado o gênero";
        }
        if (livro.getIdioma() == null || "".equals(livro.getIdioma())) {
            return "Não foi informado o idioma";
        }
        if (livro.getAutor() == null || "".equals(livro.getAutor())) {
            return "Não foi informado o autor";
        }
        if (livro.getIsbn() == null || "".equals(livro.getIsbn())) {
            return "Não foi informado o ISBN";
        }
        if (livro.getPapel() == null || "".equals(livro.getPapel())) {
            return "Não foi informado o papel";
        }
        if (livro.getValor() == null) {
            return "Não foi informado um valor";
        }
        if (livro.getPaginas() == null) {
            return "Não foi informado a quantidade de páginas";
        }
        if (livro.getAno() == null) {
            return "Não foi informado o ano";
        }

        return null;
    }
}
