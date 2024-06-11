/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Controller.ProdutoController;
import dao.VendaDAO;
import dto.ClienteDTO;
import dto.ProdutoDTO;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Produto;
import modelo.Venda;
import service.ClienteService;
import service.ProdutoService;

/**
 *
 * @author allan
 */
public class ViewPDV extends javax.swing.JFrame {

    private DefaultTableModel modelo = new DefaultTableModel();
    private int linhaselecionada = -1;
    
    private VendaDAO vendaDao = new VendaDAO();
    private boolean vendaPesquisada;
    private ArrayList<Venda>lista;
    private ClienteDTO cliente;
    private ProdutoDTO produto;
    
    public ViewPDV() {
        initComponents();
        setLocationRelativeTo(this);
        carregarTabela();        
    }

    public void carregarTabela(){

        modelo.addColumn("Código");        
        modelo.addColumn("Descrição");
        modelo.addColumn("QTDE.");
        modelo.addColumn("VLR.UNITARIO");
        tbItensVenda.setModel(modelo);
        
        tbItensVenda.getColumnModel().getColumn(0).setPreferredWidth(20);        
        tbItensVenda.getColumnModel().getColumn(1).setPreferredWidth(120);
        tbItensVenda.getColumnModel().getColumn(2).setPreferredWidth(20);
        tbItensVenda.getColumnModel().getColumn(3).setPreferredWidth(20);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfClienteID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfNomeCliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfTelefoneCliente = new javax.swing.JTextField();
        tfEmailCliente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfCodigoProduto = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tfDescricaoProduto = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tfCategoriaProduto = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tfValorUnitarioProduto = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tfQuantidadeProduto = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbItensVenda = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tfObservacoes = new javax.swing.JTextPane();
        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        tfValorTotal = new javax.swing.JTextField();
        lbNumeroPedido = new javax.swing.JLabel();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PDV");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("N° Pedido:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Selecione cliente:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Código cliente:");

        tfClienteID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfClienteIDKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Nome:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Telefone:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Email:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Selecione os produtos:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Código produto:");

        tfCodigoProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfCodigoProdutoKeyPressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Descrição produto:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Categoria:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Valor:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Qtde.:");

        jButton1.setText("Adicionar produto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tbItensVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbItensVenda);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Itens da venda:");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("Observações:");

        jScrollPane2.setViewportView(tfObservacoes);

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Valor total:");

        lbNumeroPedido.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfEmailCliente)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfClienteID))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(tfNomeCliente)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfCodigoProduto))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(tfDescricaoProduto)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(tfCategoriaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(tfValorUnitarioProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(tfQuantidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbNumeroPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel9))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(btSalvar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbNumeroPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfClienteID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCategoriaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfValorUnitarioProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfQuantidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(tfValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar)
                    .addComponent(btCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    double valorTotal;
        
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
        String codigo = tfCodigoProduto.getText();
        String descricao = tfDescricaoProduto.getText();
        String qtde = tfQuantidadeProduto.getText();
        String vlrUnitario = tfValorUnitarioProduto.getText();
        
        if (codigo.isEmpty() || descricao.isEmpty() || qtde.isEmpty() || vlrUnitario.isEmpty()) {
            throw new IllegalArgumentException("Por favor, preencha todos os campos.");
        }
        
        int codigoInt = Integer.parseInt(codigo);
        int quantidade = Integer.parseInt(qtde);
        double valorUnitario = Double.parseDouble(vlrUnitario);
        
        if(linhaselecionada >= 0){
            modelo.removeRow(linhaselecionada);
            modelo.insertRow(linhaselecionada, 
                    new Object[]{codigo, descricao, qtde, vlrUnitario});
        }else{
             modelo.addRow(new Object[]{codigo, descricao, qtde, vlrUnitario});
        }
        
        JOptionPane.showMessageDialog(this,
                "Produto lançado com sucesso!");
        tfCodigoProduto.setText("");
        tfDescricaoProduto.setText("");
        tfQuantidadeProduto.setText("");
        tfValorUnitarioProduto.setText("");
        tfCategoriaProduto.setText("");
        tfDescricaoProduto.requestFocus();
        linhaselecionada = -1;
        
        Produto produto = new Produto();
        produto.setCodigo(codigoInt);
        produto.setDescricao(descricao);
        produto.setQuantidade(quantidade);
        produto.setValorUnitario(valorUnitario);
        
        ProdutoController.getInstance().salvarProduto(produto);
         
        
        double somaValores= valorUnitario*quantidade;
        valorTotal+=somaValores;
        
         String valorFinal= String.valueOf(valorTotal);
         tfValorTotal.setText(valorFinal);
        
        } catch (Exception e) {
        JOptionPane.showMessageDialog(this, e.getMessage(), "Por favor, preencha todos os campos.", JOptionPane.ERROR_MESSAGE);
        if (tfDescricaoProduto.getText().isEmpty()) {
            tfDescricaoProduto.requestFocus();
        } else if (tfQuantidadeProduto.getText().isEmpty()) {
            tfQuantidadeProduto.requestFocus();
        }else if (tfValorUnitarioProduto.getText().isEmpty()) {
            tfValorUnitarioProduto.requestFocus();
        }
      }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        int resposta = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja cancelar? Todos as iformações serão perdidas!",
                "Confirmação", JOptionPane.YES_NO_OPTION);
    
             if (resposta == JOptionPane.YES_OPTION) {
                this.dispose();
            }  
    }//GEN-LAST:event_btCancelarActionPerformed

    private void tfCodigoProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCodigoProdutoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String produtoIDText = tfCodigoProduto.getText();
            if(!produtoIDText.isEmpty()){
                try{
                    int produtoIDTe = Integer.parseInt(produtoIDText);
                    ProdutoDTO produto = ProdutoService.buscaProduto(produtoIDTe);
                    
                    tfDescricaoProduto.setText(produto.getDescricao());
                    tfValorUnitarioProduto.setText(produto.getValor().toString());
                    tfCategoriaProduto.setText(produto.getCategoria());
            } catch (NumberFormatException ex) {
                Logger.getLogger(ViewPrincipalVenda.class.getName()).log(Level.SEVERE, "ID do produto inválido: " + produtoIDText, ex);
            } catch (Exception ex) {
                Logger.getLogger(ViewPrincipalVenda.class.getName()).log(Level.SEVERE, "Erro ao buscar produto", ex);
            }
            }
        }     
    }//GEN-LAST:event_tfCodigoProdutoKeyPressed

    private void tfClienteIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfClienteIDKeyPressed
       if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String clienteIDText = tfClienteID.getText();
            if(!clienteIDText.isEmpty()) {
             try {
                int clienteID = Integer.parseInt(clienteIDText);
                cliente = ClienteService.buscaCliente(clienteID);

                tfNomeCliente.setText(cliente.getNome());
                tfTelefoneCliente.setText(cliente.getTelefone());
                tfEmailCliente.setText(cliente.getEmail());
            } catch (NumberFormatException ex) {
                Logger.getLogger(ViewPrincipalVenda.class.getName()).log(Level.SEVERE, "ID de cliente inválido: " + clienteIDText, ex);
            } catch (Exception ex) {
                Logger.getLogger(ViewPrincipalVenda.class.getName()).log(Level.SEVERE, "Erro ao buscar cliente", ex);
            }
        }
    }
    }//GEN-LAST:event_tfClienteIDKeyPressed

    private void mostrarVenda(Venda venda) {
    lbNumeroPedido.setText(String.valueOf(venda.getNumeroPedido()));
    tfNomeCliente.setText(venda.getNomeCliente());
    tfTelefoneCliente.setText(venda.getTelefoneCliente());
    tfEmailCliente.setText(venda.getEmailCliente());

    tfNomeCliente.setEditable(false);
    tfTelefoneCliente.setEditable(false);
    tfEmailCliente.setEditable(false);


    btSalvar.setEnabled(false);
}

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        
        Venda novaVenda = new Venda();
        novaVenda.setNomeCliente(cliente.getNome());
        novaVenda.setTelefoneCliente(cliente.getTelefone());
        novaVenda.setEmailCliente(cliente.getEmail());
        novaVenda.setValorTotalVenda(valorTotal);
        novaVenda.setObservacoesVenda(tfObservacoes.getText());
                                       
    }//GEN-LAST:event_btSalvarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbNumeroPedido;
    private javax.swing.JTable tbItensVenda;
    private javax.swing.JTextField tfCategoriaProduto;
    private javax.swing.JTextField tfClienteID;
    private javax.swing.JTextField tfCodigoProduto;
    private javax.swing.JTextField tfDescricaoProduto;
    private javax.swing.JTextField tfEmailCliente;
    private javax.swing.JTextField tfNomeCliente;
    private javax.swing.JTextPane tfObservacoes;
    private javax.swing.JTextField tfQuantidadeProduto;
    private javax.swing.JTextField tfTelefoneCliente;
    private javax.swing.JTextField tfValorTotal;
    private javax.swing.JTextField tfValorUnitarioProduto;
    // End of variables declaration//GEN-END:variables
}
