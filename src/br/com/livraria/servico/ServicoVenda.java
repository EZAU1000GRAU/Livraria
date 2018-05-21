package br.com.livraria.servico;

import br.com.livraria.mock.MockVenda;
import br.com.livraria.model.validadores.ValidadorVenda;
import br.com.livraria.model.venda.Venda;
import java.util.Date;
import java.util.List;

public class ServicoVenda {

    public static String gerarVenda(Venda venda) {
        String resposta = null;
        resposta = ValidadorVenda.validar(venda);
        if (resposta == null) {
            try {
                MockVenda.inserir(venda);
            } catch (Exception e) {
                e.printStackTrace();
                resposta = "Erro na fonte de dados";
            }
        }
        return resposta;
    }

    public static String excluirVenda(Integer id) {
        String resposta = null;
        try {
            MockVenda.excluir(id);
        } catch (Exception e) {
            e.printStackTrace();
            resposta = "Erro na fonte de dados";
        }
        return resposta;
    }

    public static Venda obterVenda(Integer id) {
        Venda vendaResposta = null;
        try {
            vendaResposta = MockVenda.obter(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return vendaResposta;
    }

    public static List<Venda> gerarRelatorio(Date inicio, Date fim) {
        List<Venda> resposta = null;
        try {
            resposta = MockVenda.relatorio(inicio, fim);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resposta;
    }
}
