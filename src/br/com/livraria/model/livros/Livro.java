package br.com.livraria.model.livros;

public class Livro {

    private String titulo;
    private String editora;
    private String genero;
    private String idioma;
    private String autor;
    private String isbn;
    private String acabamento;
    private String papel;
    private String organizador;
    private String coordenador;
    private double valor;
    private String paginas;
    private Integer id;
    private String ano;
    private int qtd;
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAcabamento() {
        return acabamento;
    }

    public void setAcabamento(String acabamento) {
        this.acabamento = acabamento;
    }

    public String getPapel() {
        return papel;
    }

    public void setPapel(String papel) {
        this.papel = papel;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getPaginas() {
        return paginas;
    }

    public void setPaginas(String paginas) {
        this.paginas = paginas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    
    public int getQtd() {
        return qtd;
    }

    
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

   
    public String getOrganizador() {
        return organizador;
    }

   
    public void setOrganizador(String organizador) {
        this.organizador = organizador;
    }

    public String getCoordenador() {
        return coordenador;
    }

   
    public void setCoordenador(String coordenador) {
        this.coordenador = coordenador;
    }

    
    public String desc() {
        return  titulo + " "+"R$ "+valor;
    }
    

    
    
}
