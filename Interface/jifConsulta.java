/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Interface;

import Persistencia.ExcluirDAO;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author paulo
 */
public class jifConsulta extends javax.swing.JInternalFrame {

    /**
     * Creates new form ijConsulta
     */
    public jifConsulta() {
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

        jcTipo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jtArg = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtb1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jbCap = new javax.swing.JButton();
        jbImprimir = new javax.swing.JButton();
        jbSair = new javax.swing.JButton();
        jbCap1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Consulta de Clientes");
        setToolTipText("");

        jcTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "RG", "CPF" }));
        jcTipo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Consulta por :");

        jLabel2.setText("Digite o argumento:");

        jtb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"00432", "João", null, "543.321.432-84", "(28) 98732-4892", "joãogomes@hotmail.com"},
                {"00321", "Gabriela", null, "234.543.134-52", "(21) 98321-4295", "gabriela_martins@gmail.com"},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Cod.", "Nome", "RG", "CPF", "Telefone", "Email"
            }
        ));
        jScrollPane1.setViewportView(jtb1);

        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jbCap.setText("Excluir");
        jbCap.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCapActionPerformed(evt);
            }
        });

        jbImprimir.setText("Imprimir");
        jbImprimir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbImprimir.setEnabled(false);

        jbSair.setText("Sair");
        jbSair.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });

        jbCap1.setText("Editar");
        jbCap1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbCap1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCap1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbSair, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbCap, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbCap1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(170, 170, 170))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jcTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(243, 243, 243))
                            .addComponent(jTextField1))
                        .addGap(396, 396, 396)
                        .addComponent(jtArg, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtArg)
                    .addComponent(jTextField1)
                    .addComponent(jcTipo, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jbImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbCap1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbCap, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbSair, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        setBounds(450, 150, 656, 398);
    }// </editor-fold>//GEN-END:initComponents

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
    dispose();
    }//GEN-LAST:event_jbSairActionPerformed

    private void jbCap1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCap1ActionPerformed
        new jifEditar().setVisible(true);   
    }//GEN-LAST:event_jbCap1ActionPerformed

    private void jbCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCapActionPerformed
        /* int codigo = Integer.parseInt(jtcod.getText());
         
         EXDAO = new ExcluirDAO();
         try{
            if (JOptionPane.showConfirmDialog(this, "Confirmar a exclusão ?","Confirmação",
                    JOptionPane.YES_NO_CANCEL_OPTION) == JOptionPane.YES_OPTION) {_
                            
            if (EXDAO.Excluir(codigo)) { 
                JOptionPane.showMessageDialog(this, "Excluido com sucesso !");
                cancelar();
            }                 
            else{
                JOptionPane.showMessageDialog (this, "Erro ao excluir o registro !");
            }
         }else{
                JOptionPane.showMessageDialog(this, "operação cancelada !"); 
                cancelar();                           
                }    
        }catch(SQLException error){
        JOptionPane.showMessageDialog(this,"Erro: Exclusão não realizada!"+ error.getMessage());
        } */      
    }//GEN-LAST:event_jbCapActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbCap;
    private javax.swing.JButton jbCap1;
    private javax.swing.JButton jbImprimir;
    private javax.swing.JButton jbSair;
    private javax.swing.JComboBox<String> jcTipo;
    private javax.swing.JTextField jtArg;
    private javax.swing.JTable jtb1;
    // End of variables declaration//GEN-END:variables
}