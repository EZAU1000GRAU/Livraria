package br.com.livraria.mock;

import br.com.livraria.model.venda.Venda;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MockVenda {

    private static int idVendas = 0;
    private static List<Venda> listaVendas = new ArrayList<>();

    public static void inserir(Venda venda)
            throws Exception {
        venda.setId(idVendas++);
        listaVendas.add(venda);
    }

    public static void excluir(int id)
            throws Exception {
        if (listaVendas.size() > 0) {
            int posicao = 0;
            boolean vendaExcluida = false;
            while (posicao < listaVendas.size() && !vendaExcluida) {
                Venda vendaLista = listaVendas.get(posicao);
                if (vendaLista != null && vendaLista.getId() == id) {
                    listaVendas.remove(posicao);
                    vendaExcluida = true;
                }
                posicao++;
            }
        } else {
            throw new Exception("Não há venda para remover");
        }
    }

    public static List<Venda> listar()
            throws Exception {
        return listaVendas;
    }

    public static Venda obter(int id)
            throws Exception {
        if (listaVendas.size() > 0) {
            int posicao = 0;
            while (posicao < listaVendas.size()) {
                Venda vendaLista = listaVendas.get(posicao);
                if (vendaLista != null
                        && vendaLista.getId() != null
                        && vendaLista.getId() == id) {
                    return vendaLista;
                }
                posicao++;
            }
        } else {
            throw new Exception("Não há dados para pesquisa");
        }
        return null;
    }

    public static List<Venda> relatorio(Date inicio, Date fim)
            throws Exception {
        List<Venda> listaRelatorio = new ArrayList<>();
        for (int i = 0; i < listaVendas.size(); i++) {
            if (inicio.before(listaVendas.get(i).getData()) && fim.after(listaVendas.get(i).getData())) {
                listaRelatorio.add(listaVendas.get(i));
            }

        }
        return listaRelatorio;

    }
}
