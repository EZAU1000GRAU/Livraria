package br.com.livraria.mock;

import br.com.livraria.model.clientes.Cliente;
import java.util.ArrayList;
import java.util.List;

public class MockCliente {

    private static int idClientes = 0;

    private static List<Cliente> listaClientes = new ArrayList<>();

    /**
     * Adiciona um livro ao mock
     *
     * @param cliente
     * @throws Exception
     */
    public static void inserir(Cliente cliente)
            throws Exception {
        cliente.setId(idClientes++);
        listaClientes.add(cliente);

    }
/**
     *Substitui um cliente sem necessidade de 
     * excluir e inserir novamente.
     * @param clienteUpdate
     * @throws Exception
     */
    public static void atualizar(Cliente clienteUpdate)
            throws Exception {

        if (clienteUpdate != null
                && clienteUpdate.getId() != null
                && listaClientes.size() > 0) {

            int contador = 0;
            boolean clienteAtualizado = false;
            while (contador < listaClientes.size() && !clienteAtualizado) {

                Cliente clienteLista = listaClientes.get(contador);

                if (clienteLista != null
                        && clienteLista.getId() == clienteUpdate.getId()) {

                    clienteLista.setNome(clienteUpdate.getNome());
                    clienteLista.setSobrenome(clienteUpdate.getSobrenome());
                    clienteLista.setDataNascimento(clienteUpdate.getDataNascimento());
                    clienteLista.setGenero(clienteUpdate.getGenero());
                    clienteLista.setTelefone(clienteUpdate.getTelefone());
                    clienteLista.setCelular(clienteUpdate.getCelular());
                    clienteLista.setCep(clienteUpdate.getCep());
                    clienteLista.setRua(clienteUpdate.getRua());
                    clienteLista.setNumeroRes(clienteUpdate.getNumeroRes());
                    clienteLista.setBairro(clienteUpdate.getBairro());
                    clienteLista.setCidade(clienteUpdate.getCidade());

                    clienteAtualizado = true;
                }

                contador++;
            }

        } else {
            throw new Exception("Não há cliente para atualizar");
        }

    }
/**
     *Exclui o cliente com Id igual ao parametro
     * @param id
     * @throws Exception
     */
    public static void excluir(int id)
            throws Exception {

        if (listaClientes.size() > 0) {

            int posicao = 0;
            boolean clienteRemovido = false;
            while (posicao < listaClientes.size() && !clienteRemovido) {

                Cliente clienteLista = listaClientes.get(posicao);

                if (clienteLista != null && clienteLista.getId() == id) {
                    listaClientes.remove(posicao);
                    clienteRemovido = true;
                }

                posicao++;
            }

        } else {

            throw new Exception("Não há cliente para remover");

        }

    }
/**
     *Retorna uma lista com todos os clientes disponíveis
     * @return
     * @throws Exception
     */
    public static List<Cliente> listar()
            throws Exception {

        return listaClientes;

    }

    /**
     * Retorna uma lista de clientes que possuem nome ou sobrenome iguais ao
     * parametro
     *
     * @param nome
     * @return
     * @throws java.lang.Exception
     */
    public static List<Cliente> buscarNome(String nome)
            throws Exception {

        List<Cliente> listaResultado = new ArrayList<>();

        if (nome != null && listaClientes.size() > 0) {

            int posicao = 0;
            while (posicao < listaClientes.size()) {

                Cliente clienteLista = listaClientes.get(posicao);

                if (clienteLista != null
                        && clienteLista.getNome() != null
                        && clienteLista.getSobrenome() != null) {

                    if (clienteLista.getNome().contains(nome)
                            || clienteLista.getSobrenome().contains(nome)) {

                        listaResultado.add(clienteLista);

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
     * Retorna o cliente com o id igual ao parametro
     *
     * @param id
     * @return
     * @throws java.lang.Exception
     */
    public static Cliente obter(int id)
            throws Exception {

        if (listaClientes.size() > 0) {

            int posicao = 0;
            while (posicao < listaClientes.size()) {

                Cliente clienteLista = listaClientes.get(posicao);

                if (clienteLista != null
                        && clienteLista.getId() != null
                        && clienteLista.getId() == id) {

                    return clienteLista;

                }

                posicao++;
            }

        } else {
            throw new Exception("Não há dados para pesquisa");
        }

        return null;
    }
}
