
package br.com.livraria.Telas.principal;


import br.com.livraria.Telas.vendas.TelaVenda;
import br.com.livraria.Telas.clientes.FormCadastrarCliente;
import br.com.livraria.Telas.clientes.FormConsultarClientes;
import br.com.livraria.Telas.produto.FormCadastrarProd;
import br.com.livraria.Telas.produto.FormConsultarProd;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JInternalFrame;

public class TelaPrincipal extends javax.swing.JFrame {

    FormCadastrarCliente cadastrarCliente = null;
    FormConsultarClientes consultarClientes = null;
    FormCadastrarProd cadastrarProduto = null;
    FormConsultarProd consultarProdutos = null;
    TelaVenda efetuarVenda = null;
    
    //Venda efetuarVenda = null;

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        desktop = new javax.swing.JDesktopPane() {
            private Image image;
            {
                try {
                    image = ImageIO.read(new File("src/image/logo.png"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCliente = new javax.swing.JMenu();
        itmMenuCadastroCliente = new javax.swing.JMenuItem();
        itmMenuConsultaCliente = new javax.swing.JMenuItem();
        menuProdutos = new javax.swing.JMenu();
        itmMenuCadastroProd = new javax.swing.JMenuItem();
        itmMenuConsultaProd = new javax.swing.JMenuItem();
        menuVendas = new javax.swing.JMenu();
        itmMenuVenda = new javax.swing.JMenuItem();
        itmMenuRelatorio = new javax.swing.JMenuItem();

        jMenuItem5.setText("jMenuItem5");

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Livraria Como é Bom Ler");

        desktop.setDoubleBuffered(true);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 654, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 625, Short.MAX_VALUE)
        );

        menuCliente.setText("Cliente");

        itmMenuCadastroCliente.setText("Cadastrar Cliente");
        itmMenuCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmMenuCadastroClienteActionPerformed(evt);
            }
        });
        menuCliente.add(itmMenuCadastroCliente);

        itmMenuConsultaCliente.setText("Consultar Clientes");
        itmMenuConsultaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmMenuConsultaClienteActionPerformed(evt);
            }
        });
        menuCliente.add(itmMenuConsultaCliente);

        jMenuBar1.add(menuCliente);

        menuProdutos.setText("Produtos");
        menuProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProdutosActionPerformed(evt);
            }
        });

        itmMenuCadastroProd.setText("Cadastrar Produto");
        itmMenuCadastroProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmMenuCadastroProdActionPerformed(evt);
            }
        });
        menuProdutos.add(itmMenuCadastroProd);

        itmMenuConsultaProd.setText("Consultar Produtos");
        itmMenuConsultaProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmMenuConsultaProdActionPerformed(evt);
            }
        });
        menuProdutos.add(itmMenuConsultaProd);

        jMenuBar1.add(menuProdutos);

        menuVendas.setText("Vendas\n");

        itmMenuVenda.setText("Venda");
        itmMenuVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmMenuVendaActionPerformed(evt);
            }
        });
        menuVendas.add(itmMenuVenda);

        itmMenuRelatorio.setText("Relatório ");
        menuVendas.add(itmMenuRelatorio);

        jMenuBar1.add(menuVendas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itmMenuCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmMenuCadastroClienteActionPerformed
        if (cadastrarCliente == null || !cadastrarCliente.isDisplayable()) {
            cadastrarCliente = new FormCadastrarCliente();
            desktop.add(cadastrarCliente);
            this.openFrameInCenter(cadastrarCliente);
        }
        cadastrarCliente.toFront();
    }//GEN-LAST:event_itmMenuCadastroClienteActionPerformed

    private void itmMenuConsultaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmMenuConsultaClienteActionPerformed
        if (consultarClientes == null || !consultarClientes.isDisplayable()) {
            consultarClientes = new FormConsultarClientes();
            desktop.add(consultarClientes);
            this.openFrameInCenter(consultarClientes);
        }
        consultarClientes.toFront();
    }//GEN-LAST:event_itmMenuConsultaClienteActionPerformed

    private void itmMenuCadastroProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmMenuCadastroProdActionPerformed
        if (cadastrarProduto == null || !cadastrarProduto.isDisplayable()) {
            cadastrarProduto = new FormCadastrarProd();
            desktop.add(cadastrarProduto);
            this.openFrameInCenter(cadastrarProduto);
        }
        cadastrarProduto.toFront();
    }//GEN-LAST:event_itmMenuCadastroProdActionPerformed

    private void itmMenuConsultaProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmMenuConsultaProdActionPerformed
        if (consultarProdutos == null || !consultarProdutos.isDisplayable()) {
            consultarProdutos = new FormConsultarProd();
            desktop.add(consultarProdutos);
            this.openFrameInCenter(consultarProdutos);
        }
        consultarProdutos.toFront();
    }//GEN-LAST:event_itmMenuConsultaProdActionPerformed

    private void menuProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProdutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuProdutosActionPerformed

    private void itmMenuVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmMenuVendaActionPerformed
        if (efetuarVenda == null || !efetuarVenda.isDisplayable()) {
            efetuarVenda = new TelaVenda();
            desktop.add(efetuarVenda);
            this.openFrameInCenter(efetuarVenda);
        }
        efetuarVenda.toFront();
    }//GEN-LAST:event_itmMenuVendaActionPerformed

    //Abre um internal frame centralizado na tela
    public void openFrameInCenter(JInternalFrame jif) {
        Dimension desktopSize = desktop.getSize();
        Dimension jInternalFrameSize = jif.getSize();
        int width = (desktopSize.width - jInternalFrameSize.width) / 2;
        int height = (desktopSize.height - jInternalFrameSize.height) / 2;
        jif.setLocation(width, height);
        jif.setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenuItem itmMenuCadastroCliente;
    private javax.swing.JMenuItem itmMenuCadastroProd;
    private javax.swing.JMenuItem itmMenuConsultaCliente;
    private javax.swing.JMenuItem itmMenuConsultaProd;
    private javax.swing.JMenuItem itmMenuRelatorio;
    private javax.swing.JMenuItem itmMenuVenda;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenu menuCliente;
    private javax.swing.JMenu menuProdutos;
    private javax.swing.JMenu menuVendas;
    // End of variables declaration//GEN-END:variables
}