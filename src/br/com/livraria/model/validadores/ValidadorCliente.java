package br.com.livraria.model.validadores;

import br.com.livraria.model.clientes.Cliente;

public class ValidadorCliente {

    public static String validar(Cliente cliente) {

        if (cliente == null) {
            return "Não foi informado um cliente";
        }

        if (cliente.getNome() == null || "".equals(cliente.getNome())) {
            return "É necessário informar um nome de cliente";
        }

        if (cliente.getSobrenome() == null
                || "".equals(cliente.getSobrenome())) {
            return "É necessário informar um sobrenome de cliente";
        }

        if (cliente.getDataNascimento() == null) {
            return "É necessário informar um valor de data de nascimento"
                    + " válido";
        }

        if (cliente.getGenero() == null || "".equals(cliente.getGenero())
                || (!cliente.getGenero().equals("Masculino"))
                && !cliente.getGenero().equals("Feminino")) {

            return "É necessário informar o gênero do cliente";

        }
        if(cliente.getTelefone() == null || "".equals(cliente.getTelefone())){
            return "É necessário informar o telefone do cliente";
        }
        if(cliente.getCelular()== null || "".equals(cliente.getCelular())){
            return "É necessário informar o celular do cliente";
        }
        if(cliente.getCep()== null || "".equals(cliente.getCep())){
            return "É necessário informar o cep do cliente";
        }
        if(cliente.getRua()== null || "".equals(cliente.getRua())){
            return "É necessário informar a rua do cliente";
        }
        if(cliente.getNumeroRes()== null || "".equals(cliente.getNumeroRes())){
            return "É necessário informar o número da residencia do cliente";
        }
        if(cliente.getBairro()== null || "".equals(cliente.getBairro())){
            return "É necessário informar o celular do cliente";
        }
        if(cliente.getCidade()== null || "".equals(cliente.getCidade())){
            return "É necessário informar a cidade do cliente";
        }

        return null;
    }

}
