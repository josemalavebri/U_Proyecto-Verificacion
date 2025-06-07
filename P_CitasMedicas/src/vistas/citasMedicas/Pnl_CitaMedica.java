package vistas.citasMedicas;

import java.util.List;
import javax.swing.JFrame;
import modelos.CitaMedica;
import utilidades.Controller.ManagerController;
import utilidades.RefreshTable.RefreshTable;
import utilidades.Table.CreateTable.ConstructorModeloTabla;

public class Pnl_CitaMedica extends javax.swing.JPanel {
    
    private ManagerController managerController;
    private RefreshTable refreshTable;
    
    public Pnl_CitaMedica() {
        initComponents();
        managerController = ManagerController.getInstance();
        llenarDatosTabla();
        refreshTable = RefreshTable.getInstance();
        refreshTable.suscribir("tb_citasMedicas", tb_citasMedicas);
    }
    
    private void llenarDatosTabla(){
        List<CitaMedica> listaCitaMedica = managerController.get(CitaMedica.class);
        ConstructorModeloTabla.construirYAsignarModelo(tb_citasMedicas, listaCitaMedica);
        ConstructorModeloTabla.AgregarEventosEditarYEliminar(tb_citasMedicas, new JF_NuevaCitaMedica());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_citasMedicas = new javax.swing.JTable();
        btn_nuevaCita = new javax.swing.JButton();

        jLabel1.setText("Citas Registradas:");

        tb_citasMedicas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tb_citasMedicas);

        btn_nuevaCita.setText("Nueva Cita");
        btn_nuevaCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevaCitaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_nuevaCita, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(236, 236, 236))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btn_nuevaCita, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void btn_nuevaCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevaCitaActionPerformed
       JFrame jframe = new JF_NuevaCitaMedica();
       jframe.setLocationRelativeTo(null);
       jframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       jframe.setVisible(true);
    }//GEN-LAST:event_btn_nuevaCitaActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_nuevaCita;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_citasMedicas;
    // End of variables declaration//GEN-END:variables

    
}
