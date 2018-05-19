package br.com.livraria.servico;

import br.com.livraria.mock.MockCliente;
import br.com.livraria.model.clientes.Cliente;
import br.com.livraria.model.validadores.ValidadorCliente;
import java.util.List;

public class ServicoCliente {

    public static String cadastrarCliente(Cliente cliente) {

        String resposta = null;

        resposta = ValidadorCliente.validar(cliente);

        if (resposta == null) {

            try {

                MockCliente.inserir(cliente);

            } catch (Exception e) {

                e.printStackTrace();
                resposta = "Erro na fonte de dados";
            }

        }

        return resposta;
    }

    public static String atualizarCliente(Cliente cliente) {

        String resposta = null;

        resposta = ValidadorCliente.validar(cliente);

        if (resposta == null) {

            try {

                MockCliente.atualizar(cliente);

            } catch (Exception e) {

                e.printStackTrace();
                resposta = "Erro na fonte de dados";
            }
        }

        return resposta;

    }

    public static String excluirCliente(Integer id) {

        String resposta = null;

        try {

            MockCliente.excluir(id);

        } catch (Exception e) {

            e.printStackTrace();
            resposta = "Erro na fonte de dados";

        }

        return resposta;
    }

    public static List<Cliente> procurarCliente(String nome) {

        List<Cliente> listaResposta = null;

        try {

            if (nome == null || "".equals(nome)) {
                listaResposta = MockCliente.listar();
            } else {
                listaResposta = MockCliente.buscarNome(nome);
            }

        } catch (Exception e) {

            e.printStackTrace();

        }

        return listaResposta;
    }

    public static Cliente obterCliente(Integer id) {

        Cliente clienteResposta = null;

        try {

            clienteResposta = MockCliente.obter(id);

        } catch (Exception e) {

            e.printStackTrace();

        }

        return clienteResposta;

    }

}
