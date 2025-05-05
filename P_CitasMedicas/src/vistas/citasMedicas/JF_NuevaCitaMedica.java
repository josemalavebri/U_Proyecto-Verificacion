/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas.citasMedicas;

import Data.FakeDataBase;
import controladores.CitaMedicaController;
import controladores.PacienteController;
import controladores.TurnosController;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelos.CitaMedica;
import modelos.Medico;
import modelos.Paciente;
import modelos.Turno;
import utilidades.TableColumns;
import utilidades.Verificador.TipoValidacion;
import utilidades.Verificador.Verificador;

/**
 *
 * @author josem
 */
public class JF_NuevaCitaMedica extends javax.swing.JFrame {

    private Turno turnoSeleccionadoActual;
    private Verificador verificador;
    
    private TurnosController turnos;
    private PacienteController pacienteController;
    private CitaMedicaController citaMedicaController;
    private TurnosController turnosController;

    private ArrayList<Paciente> dataPacientes;
    private ArrayList<Medico> dataMedicos;
    private ArrayList<Turno>  turnosTemporales;


    public JF_NuevaCitaMedica() {
        initComponents();
        instanciarRecursos();
        cargarDatosTurnos();
        cargarDatosMedicos();
        cargarDatosPacientes();
    }
    
    private void instanciarRecursos(){
        turnoSeleccionadoActual = new Turno();
        pacienteController = new PacienteController();
        citaMedicaController = new CitaMedicaController();
        turnosController = new TurnosController();
        verificador = new Verificador();
        turnos = new TurnosController();
        MauseList();
    }
    
    private void cargarDatosMedicos(){
        dataMedicos = new ArrayList<>();
        Medico medico = new Medico(1,"jose","briones","psicologia");
        dataMedicos.add(medico);
        
        String nombresMedico = medico.getNombre()+" "+medico.getApellido();
        
        cbx_medicos.removeAllItems();
        cbx_medicos.addItem(nombresMedico);
    }
    
    private void cargarDatosPacientes(){
        cbx_paciente.removeAllItems();
        dataPacientes = pacienteController.GetPacientes();
        for(Paciente paciente : dataPacientes ){
            cbx_paciente.addItem(paciente.toString());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbx_paciente = new javax.swing.JComboBox<>();
        btn_resetear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_turnos = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        btn_guardar1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txta_descripcion = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbx_medicos = new javax.swing.JComboBox<>();
        txt_turnoSeleccionado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbx_paciente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btn_resetear.setText("Resetear");
        btn_resetear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetearActionPerformed(evt);
            }
        });

        tb_turnos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tb_turnos);

        jLabel5.setText("Turnos:");

        btn_guardar1.setText("Guardar");
        btn_guardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar1ActionPerformed(evt);
            }
        });

        txta_descripcion.setColumns(20);
        txta_descripcion.setRows(5);
        jScrollPane2.setViewportView(txta_descripcion);

        jLabel3.setText("Paciente:");

        jLabel2.setText("Medicos:");

        jLabel4.setText("Descripcion");

        cbx_medicos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txt_turnoSeleccionado.setText("Turno Seleccionado");
        txt_turnoSeleccionado.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(61, 61, 61)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(cbx_medicos, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cbx_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btn_resetear, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(113, 113, 113)
                                        .addComponent(txt_turnoSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addComponent(btn_guardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbx_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbx_medicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btn_resetear, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_guardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_turnoSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_resetearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetearActionPerformed

        cbx_paciente.setSelectedIndex(0);
        cbx_medicos.setSelectedIndex(0);
        txta_descripcion.setText("");
        txt_turnoSeleccionado.setText("Turno Seleccionado");
    }//GEN-LAST:event_btn_resetearActionPerformed

    private void btn_guardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar1ActionPerformed
        if(verificarObjetos()){
            int idMedicoSeleccionado = cbx_medicos.getSelectedIndex();
            Medico medico = dataMedicos.get(idMedicoSeleccionado);
            int idPacienteSeleccionado = cbx_paciente.getSelectedIndex();
            Paciente paciente = dataPacientes.get(idPacienteSeleccionado);
            String descripcion = txta_descripcion.getText();
            int turnoId = turnoSeleccionadoActual.getId();
            CitaMedica citaMedica = new CitaMedica(paciente, medico, descripcion, turnoSeleccionadoActual);
            if(citaMedicaController.postCitaMedica(citaMedica)){
                JOptionPane.showMessageDialog(null, "Cita Medica Guardada con exito");
            }
        } else{
            JOptionPane.showMessageDialog(null, "Verifique los campos");
        }
    }//GEN-LAST:event_btn_guardar1ActionPerformed
    
    private boolean verificarObjetos(){
        if( !VerificarComboBox(cbx_medicos)){
            JOptionPane.showMessageDialog(null, "Campo Medico Vacio o no valido");
            return false;
        }
        if(!VerificarComboBox(cbx_paciente)){
            JOptionPane.showMessageDialog(null, "Campo Paciente Vacio o no valido");
            return false;
        }
        if(!verificador.verificar(txta_descripcion.getText(), TipoValidacion.NO_NULO, TipoValidacion.CADENA_TEXTO_VALIDA)){
            JOptionPane.showMessageDialog(null, "Descripcion no valida");
            return false;
        }
        return true;
    }
    
    private boolean VerificarComboBox(JComboBox<String> combo){
        return verificador.verificar(combo.getSelectedItem(), TipoValidacion.CADENA_TEXTO_VALIDA,TipoValidacion.NO_NULO);
    }
    
    private void MauseList(){
        tb_turnos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int filaSeleccionada = tb_turnos.getSelectedRow();
                if (filaSeleccionada != -1) {
                    turnoSeleccionadoActual = turnosTemporales.get(filaSeleccionada);
                    TextBoxTurno(turnoSeleccionadoActual);
                }   
            }
        });
    }
    
    private void TextBoxTurno(Turno turnoSeleccionadoActual){
        txt_turnoSeleccionado.setText(turnoSeleccionadoActual.getId()+" "+turnoSeleccionadoActual.getFecha()+" "+turnoSeleccionadoActual.getHora());
    }
    
    private void cargarDatosTurnos() {
        turnosTemporales = turnosController.GetTurnos();
        DefaultTableModel modeloTabla = TableColumns.CrearColumnasModelo(turnosTemporales.get(1));
        for (Turno t : turnosTemporales) {
            Object[] fila = {t.getId(), t.getFecha(), t.getHora(), t.getMinuto()};
            modeloTabla.addRow(fila);
        }
        
        JTable tabla = new JTable(modeloTabla);
        tb_turnos.setModel(modeloTabla);
    }
    
    
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
            java.util.logging.Logger.getLogger(JF_NuevaCitaMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_NuevaCitaMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_NuevaCitaMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_NuevaCitaMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_NuevaCitaMedica().setVisible(true);
            }
        });
    }
    
    
    
    
     
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guardar1;
    private javax.swing.JButton btn_resetear;
    private javax.swing.JComboBox<String> cbx_medicos;
    private javax.swing.JComboBox<String> cbx_paciente;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tb_turnos;
    private javax.swing.JTextField txt_turnoSeleccionado;
    private javax.swing.JTextArea txta_descripcion;
    // End of variables declaration//GEN-END:variables
}
