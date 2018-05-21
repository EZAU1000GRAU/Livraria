package br.com.livraria.model.livros;

public class LivroVendido {

    private Livro livro;
    private int qtd;
    private int id;
    private Double valor;

    public LivroVendido(Livro livro,int qtd){
        this.livro = livro;
        this.qtd = qtd;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public int getId() {
        return id;
    }
    

    

    

    
}
