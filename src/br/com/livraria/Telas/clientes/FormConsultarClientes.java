/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.livraria.Telas.clientes;

import br.com.livraria.model.clientes.Cliente;
import br.com.livraria.servico.ServicoCliente;
import java.awt.Dimension;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormConsultarClientes extends javax.swing.JInternalFrame {

    FormCadastrarCliente formCadastrarCliente
            = new FormCadastrarCliente();

    public FormConsultarClientes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPesquisa = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaResultados = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consultar Clientes");

        lblPesquisa.setText("Cliente");

        tabelaResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Sexo", "Data de Nasc."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaResultados.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabelaResultados);

        btnCancelar.setText("Cancelar");

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");

        btnAlterar.setText("Alterar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar)
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPesquisa)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnExcluir)
                    .addComponent(btnAlterar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        pesquisar();
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void tabelaResultadosMouseClicked(java.awt.event.MouseEvent evt) {

        if (evt.getClickCount() == 2) {

            alterar();

        }
    }

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {

        if (tabelaResultados.getSelectedRow() >= 0) {

            final int row = tabelaResultados.getSelectedRow();

            String nome = (String) tabelaResultados.getValueAt(row, 1);

            int respostaConfirmacao = JOptionPane.showConfirmDialog(rootPane,
                    "Excluir o cliente \"" + nome + "\"?",
                    "Confirmar exclusão", JOptionPane.YES_NO_OPTION);

            if (respostaConfirmacao == JOptionPane.YES_OPTION) {

                Integer id = (Integer) tabelaResultados.getValueAt(row, 0);

                String respostaServico = ServicoCliente.excluirCliente(id);

                if (respostaServico == null) {

                    pesquisar();

                } else {

                    JOptionPane.showMessageDialog(rootPane, respostaServico,
                            "Falha na Exclusão", JOptionPane.ERROR_MESSAGE);

                }

            }

        }

    }

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {
        alterar();
    }

    private void pesquisar() {

        List<Cliente> resultado = ServicoCliente.
                procurarCliente(txtPesquisa.getText());

        DefaultTableModel model
                = (DefaultTableModel) tabelaResultados.getModel();

        model.setRowCount(0);

        if (resultado != null && resultado.size() > 0) {

            for (int i = 0; i < resultado.size(); i++) {

                Cliente cli = resultado.get(i);

                if (cli != null) {

                    Object[] row = new Object[5];
                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

                    row[0] = cli.getId();
                    row[1] = cli.getNome();
                    row[2] = cli.getSobrenome();
                    row[3] = dateFormat.format(cli.getDataNascimento());
                    row[4] = cli.getGenero();

                    model.addRow(row);

                }

            }

        } else {

            JOptionPane.showMessageDialog(rootPane,
                    "Não há clientes para exibição",
                    "Não há dados",
                    JOptionPane.ERROR_MESSAGE);

        }
    }

    private void alterar() {

        int row = tabelaResultados.getSelectedRow();

        Integer id = (Integer) tabelaResultados.getValueAt(row, 0);

        Cliente cliente = ServicoCliente.obterCliente(id);

        if (cliente != null) {

            formCadastrarCliente.dispose();

            formCadastrarCliente = new FormCadastrarCliente();

            formCadastrarCliente.setCliente(cliente);

            formCadastrarCliente.setModoEdicao(true);

            formCadastrarCliente.setTitle(cliente.getNome()
                    + " " + cliente.getSobrenome());

            this.getParent().add(formCadastrarCliente);

            this.openFrameInCenter(formCadastrarCliente);

            formCadastrarCliente.toFront();

        } else {

            JOptionPane.showMessageDialog(rootPane, "Não foi possível localizar"
                    + " este cliente para edição",
                    "Erro", JOptionPane.ERROR_MESSAGE);

        }

    }

    public void openFrameInCenter(JInternalFrame jif) {

        Dimension desktopSize = this.getParent().getSize();

        Dimension jInternalFrameSize = jif.getSize();

        int width = (desktopSize.width - jInternalFrameSize.width) / 2;
        int height = (desktopSize.height - jInternalFrameSize.height) / 2;

        jif.setLocation(width, height);

        jif.setVisible(true);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPesquisa;
    private javax.swing.JTable tabelaResultados;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
