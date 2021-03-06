/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.livraria.Telas.produto;

import br.com.livraria.servico.ServicoLivro;
import br.com.livraria.model.livros.Livro;
import javax.swing.JOptionPane;

/**
 *
 * @author ffreire
 */
public class FormCadastrarProd extends javax.swing.JInternalFrame {

    private boolean modoEdicao = false;
    private Livro livro = null;

    public FormCadastrarProd() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalvar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        lblIsbn = new javax.swing.JLabel();
        lblGenero = new javax.swing.JLabel();
        lblPreco = new javax.swing.JLabel();
        txtIsbn = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        comboGenero = new javax.swing.JComboBox<>();
        lblQuantidade = new javax.swing.JLabel();
        txtQuant = new javax.swing.JTextField();
        lblPaginas = new javax.swing.JLabel();
        txtAllPages = new javax.swing.JTextField();
        lblCoordenador = new javax.swing.JLabel();
        txtCordenador = new javax.swing.JTextField();
        lblAcabamento = new javax.swing.JLabel();
        cbAcabamento = new javax.swing.JComboBox<>();
        lblPapel = new javax.swing.JLabel();
        cbPapel = new javax.swing.JComboBox<>();
        lblEditora = new javax.swing.JLabel();
        txtEditora = new javax.swing.JTextField();
        lblIdioma = new javax.swing.JLabel();
        cbIdioma = new javax.swing.JComboBox<>();
        lblAno = new javax.swing.JLabel();
        lblOrganizador = new javax.swing.JLabel();
        txtOrganization = new javax.swing.JTextField();
        txtAno = new javax.swing.JTextField();
        fmtPreco = new javax.swing.JFormattedTextField();
        lblAutor = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastrar Produtos");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblTitulo.setText("Título:");

        lblIsbn.setText("ISBN:");

        lblGenero.setText("Genero:");

        lblPreco.setText("Valor Venda:");

        txtIsbn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIsbnFocusLost(evt);
            }
        });

        txtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloActionPerformed(evt);
            }
        });

        comboGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Autoajuda", "Aventura", "Bibiográficos", "Contos", "Didáticos", "Infantis", "Poesia" }));

        lblQuantidade.setText("Quantidade:");

        lblPaginas.setText("Total de páginas:");

        lblCoordenador.setText("Cordenador/Editor:");

        txtCordenador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCordenadorActionPerformed(evt);
            }
        });

        lblAcabamento.setText("Acabamento: ");

        cbAcabamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Brochura", "Grampo", "Capa dura" }));

        lblPapel.setText("Papel:");

        cbPapel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Offset", "Pólen", "Reciclado", "Especiais" }));

        lblEditora.setText("Editora:");

        txtEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditoraActionPerformed(evt);
            }
        });

        lblIdioma.setText("Idioma:");

        cbIdioma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Português", "Inglês", "Espanhol" }));

        lblAno.setText("Ano: ");

        lblOrganizador.setText("Organizador:");

        fmtPreco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        fmtPreco.setToolTipText("2.99");

        lblAutor.setText("Autor:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAutor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAutor))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCoordenador)
                            .addComponent(lblEditora)
                            .addComponent(lblIdioma)
                            .addComponent(lblAcabamento))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEditora, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCordenador)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbAcabamento, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 156, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblQuantidade)
                            .addComponent(lblPreco)
                            .addComponent(lblPaginas)
                            .addComponent(lblOrganizador))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAllPages, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOrganization)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblIsbn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(btnSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimpar)
                                .addGap(5, 5, 5)
                                .addComponent(btnCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblGenero)
                                .addGap(92, 92, 92)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fmtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPapel)
                                .addGap(103, 103, 103)
                                .addComponent(cbPapel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIsbn)
                    .addComponent(txtIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAutor)
                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGenero)
                    .addComponent(comboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPreco)
                    .addComponent(fmtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantidade)
                    .addComponent(txtQuant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPaginas)
                    .addComponent(txtAllPages, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrganizador)
                    .addComponent(txtOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCoordenador, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCordenador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEditora)
                    .addComponent(txtEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdioma)
                    .addComponent(cbIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAcabamento)
                    .addComponent(cbAcabamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPapel)
                    .addComponent(cbPapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAno)
                    .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIsbnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIsbnFocusLost
        // Ele criar uma ação ao sair do campo de digitação.
    }//GEN-LAST:event_txtIsbnFocusLost

    private void txtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloActionPerformed

    private void txtCordenadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCordenadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCordenadorActionPerformed

    private void txtEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditoraActionPerformed
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {

        if (modoEdicao && livro != null) {

            txtTitulo.setText(livro.getTitulo());
            txtEditora.setText(livro.getEditora());

        }
    }

    public boolean isModoEdicao() {
        return modoEdicao;
    }

    //Permite configurar a tela como modo edição
    public void setModoEdicao(boolean modoEdicao) {
        this.modoEdicao = modoEdicao;
    }

    //Permite obter o cliente configurado para edição
    public Livro getLivro() {
        return livro;
    }

    //Permite configurar um cliente para edição
    public void setLivro(Livro livro) {
        this.livro = livro;
    }
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (!modoEdicao) {

            livro = new Livro();

        } else if (livro == null) {

            JOptionPane.showMessageDialog(rootPane,
                    "Não foi pré-selecionado um livro para salvar suas"
                    + " alterações",
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;

        }

        //      Coletar informações das variaveis
//      Processo sem validação
        livro.setIsbn(txtIsbn.getText().trim().toUpperCase());
        livro.setTitulo(txtTitulo.getText().trim().toUpperCase());
        livro.setAutor(txtAutor.getText().trim().toUpperCase());
        livro.setGenero((String) comboGenero.getSelectedItem());
        String valor = fmtPreco.getText();
        livro.setValor(Double.parseDouble(valor.replace(",",".")));
        livro.setQtd(Integer.parseInt(txtQuant.getText()));
        livro.setPaginas(txtAllPages.getText());
        livro.setOrganizador(txtOrganization.getText().trim().toUpperCase());
        livro.setCoordenador(txtCordenador.getText().trim().toUpperCase());
        livro.setEditora(txtEditora.getText().trim().toUpperCase());
        livro.setIdioma((String) cbIdioma.getSelectedItem());
        livro.setAcabamento((String) cbAcabamento.getSelectedItem());
        livro.setPapel((String) cbPapel.getSelectedItem());
        livro.setAno(txtAno.getText());

        String resposta = null;
        if (!modoEdicao) {

            resposta = ServicoLivro.cadastrarLivro(livro);

        } else {

            resposta = ServicoLivro.atualizarLivro(livro);

        }

        if (resposta == null) {

            if (!modoEdicao) {

                JOptionPane.showMessageDialog(rootPane,
                        "Livro inserido com sucesso",
                        "Cadastro efetuado",
                        JOptionPane.INFORMATION_MESSAGE);

            } else {

                this.dispose();

            }

            clear();

        } else {

            //Exibe mensagens de erro para o usuário
            JOptionPane.showMessageDialog(rootPane, resposta,
                    "Erro", JOptionPane.ERROR_MESSAGE);

        }

        clear();


    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        clear();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void clear() {
        txtIsbn.setText("");
        txtTitulo.setText("");
        txtAutor.setText("");
        comboGenero.setSelectedIndex(0);
        fmtPreco.setText("");
        txtQuant.setText("");
        txtAllPages.setText("");
        txtOrganization.setText("");
        txtCordenador.setText("");
        txtEditora.setText("");
        cbIdioma.setSelectedIndex(0);
        cbAcabamento.setSelectedIndex(0);
        cbPapel.setSelectedIndex(0);
        txtAno.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbAcabamento;
    private javax.swing.JComboBox<String> cbIdioma;
    private javax.swing.JComboBox<String> cbPapel;
    private javax.swing.JComboBox<String> comboGenero;
    private javax.swing.JFormattedTextField fmtPreco;
    private javax.swing.JLabel lblAcabamento;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblCoordenador;
    private javax.swing.JLabel lblEditora;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblIdioma;
    private javax.swing.JLabel lblIsbn;
    private javax.swing.JLabel lblOrganizador;
    private javax.swing.JLabel lblPaginas;
    private javax.swing.JLabel lblPapel;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtAllPages;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtCordenador;
    private javax.swing.JTextField txtEditora;
    private javax.swing.JTextField txtIsbn;
    private javax.swing.JTextField txtOrganization;
    private javax.swing.JTextField txtQuant;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
