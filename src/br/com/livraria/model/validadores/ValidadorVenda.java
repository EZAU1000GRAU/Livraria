package br.com.livraria.model.validadores;

import br.com.livraria.model.venda.Venda;

public class ValidadorVenda {

    public static String validar(Venda venda) {
        if (venda == null) {
            return "Não foi informado um pedido";
        }
        if (venda.getCliente() == null) {
            return "Não foi incluído um cliente";
        }
        if (venda.getItens() == null) {
            return "Não foi incluído um produto";
        }
        return null;
    }
}
