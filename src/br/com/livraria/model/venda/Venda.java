package br.com.livraria.model.venda;

import br.com.livraria.model.clientes.Cliente;
import br.com.livraria.model.livros.LivroVendido;
import java.util.Date;
import java.util.List;

public class Venda {

    private Integer id;
    private Date data;
    private Cliente cliente;
    private List<LivroVendido> itens;
    private double total;
    private int idCliente;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<LivroVendido> getItens() {
        return itens;
    }

    public void setItens(List<LivroVendido> itens) {
        this.itens = itens;
        calcularTotal();
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    private void calcularTotal(){
        for (int i = 0; i < itens.size(); i++) {
            total+=itens.get(i).getValor();
            
        }
    }

   

}
