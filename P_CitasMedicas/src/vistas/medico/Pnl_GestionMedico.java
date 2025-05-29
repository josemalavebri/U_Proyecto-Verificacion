package vistas.medico;

import Data.IRepository;
import java.util.List;
import modelos.Medico;
import utilidades.Controller.ManagerController;
import utilidades.Table.CreateTable.ConstructorModeloTabla;


public class Pnl_GestionMedico extends javax.swing.JPanel {
   
    private final ManagerController managerController;
    public Pnl_GestionMedico() {
        managerController = ManagerController.getInstance();
        initComponents();
        
        llenarDatosTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Buscar = new javax.swing.JButton();
        btn_Resetear = new javax.swing.JButton();
        btn_Nuevo = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_Cedula = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_Medico = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(600, 400));
        setRequestFocusEnabled(false);

        btn_Buscar.setText("Buscar");

        btn_Resetear.setText("Resetear");

        btn_Nuevo.setText("Nuevo");

        jLabel2.setText("Medicos Agregados");

        jLabel1.setText("Cedula");

        tb_Medico.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tb_Medico);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txt_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btn_Buscar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Resetear))
                    .addComponent(jLabel2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119)))
                .addContainerGap(141, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Buscar)
                    .addComponent(btn_Resetear)
                    .addComponent(jLabel1))
                .addGap(31, 31, 31)
                .addComponent(btn_Nuevo)
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void llenarDatosTabla(){
        List<Medico> listaMedicos = managerController.get(Medico.class);
        ConstructorModeloTabla.construirYAsignarModelo(tb_Medico, listaMedicos);
        ConstructorModeloTabla.AgregarEventosEditarYEliminar(tb_Medico, new JF_FormularioMedico());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Buscar;
    private javax.swing.JToggleButton btn_Nuevo;
    private javax.swing.JButton btn_Resetear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tb_Medico;
    private javax.swing.JTextField txt_Cedula;
    // End of variables declaration//GEN-END:variables
}
