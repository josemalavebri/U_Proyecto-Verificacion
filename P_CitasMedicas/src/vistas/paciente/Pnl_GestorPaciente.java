/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistas.paciente;

import Data.DatosTemporales;
import Data.FakeDataBase;
import controladores.PacienteController;
import java.awt.Dimension;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelos.Paciente;
import utilidades.ButtonEditor;
import utilidades.ButtonRenderer;
import utilidades.TableColumns;
import utilidades.TableColumns;

/**
 *
 * @author HP
 */
public class Pnl_GestorPaciente extends javax.swing.JPanel {
    
    private PacienteController pacienteController;
    private Paciente paciente;
    private ArrayList<Paciente> datosPaciente;
    
    public Pnl_GestorPaciente() {
        initComponents();
        TablaPacienteLlenado();
        pacienteController = new PacienteController();
        datosPaciente = new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_cedula = new javax.swing.JLabel();
        txtCedulaNombre = new javax.swing.JTextField();
        btn_borrar = new javax.swing.JButton();
        btn_nuevo = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_paciente = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(600, 400));

        lbl_cedula.setText("Cedula o Nombre");

        btn_borrar.setText("Borrar");
        btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarActionPerformed(evt);
            }
        });

        btn_nuevo.setText("Nuevo");
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        tb_paciente.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tb_paciente);

        jLabel1.setText("Paciente:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_nuevo)
                .addGap(260, 260, 260))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(lbl_cedula)
                        .addGap(18, 18, 18)
                        .addComponent(txtCedulaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_buscar)
                            .addComponent(btn_borrar))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_buscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_borrar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCedulaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_cedula))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_nuevo)
                        .addGap(0, 29, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_borrarActionPerformed

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        // TODO add your handling code here:
        JFrame jframe = new JF_NuevoFormularioPaciente(this);
        jframe.setVisible(true);
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
        String campoCedulaNombre = txtCedulaNombre.getText().trim();
        datosPaciente = pacienteController.GetPacientes();
        
        DefaultTableModel modelo = (DefaultTableModel) tb_paciente.getModel();
        modelo.setRowCount(0);
        
        for (Paciente pacienteTemporal : datosPaciente){
            boolean isCedula = campoCedulaNombre.equals(pacienteTemporal.getCedula());
            boolean isNombre = campoCedulaNombre.equals(pacienteTemporal.getNombre());
            boolean isApellido = campoCedulaNombre.equals(pacienteTemporal.getApellido());
            if(isCedula||isNombre||isApellido){
                
            }
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    public void TablaPacienteLlenado(){
        
        FakeDataBase dataBase = FakeDataBase.getInstancia();
        ArrayList<Paciente> listaPaciente = dataBase.AllPacientes();
        
        String[] campos = {"id","cedula","nombre", "apellido"};
        DefaultTableModel modelo = CrearColumnasModeloPersonalizado(listaPaciente.get(1), campos);
        
        modelo.addColumn("Modificar");
        modelo.addColumn("Eliminar");
        
        for (Paciente p : listaPaciente){
            Object[] fila = {p.getId(), p.getCedula(), p.getNombre(), p.getApellido(), "Modificar", "Eliminar"};
            modelo.addRow(fila);
        }
       
        tb_paciente.setModel(modelo);
        
        ActionListener modificarAction = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int filaSeleccionada = tb_paciente.getSelectedRow();
                if (filaSeleccionada >= 0) {
                    
                    String idTexto = tb_paciente.getValueAt(filaSeleccionada, 0).toString(); // columna 0 = ID
                    int idPaciente = Integer.parseInt(idTexto);
                    
                        JF_NuevoFormularioPaciente formularioModificar = new JF_NuevoFormularioPaciente(Pnl_GestorPaciente.this);

                        Paciente paciente = pacienteController.ObtenerPacienteId(idPaciente);
                        String cedula = paciente.getCedula();
                        String nombre = paciente.getNombre();
                        String apellido = paciente.getApellido();
                        int edad = paciente.getEdad();
                        String correo = paciente.getCorreo();
                        String telefono = paciente.getTelefono();
                        
                        paciente = new Paciente(cedula,nombre,apellido,edad,correo,telefono);

                        formularioModificar.setPaciente(paciente);
                        formularioModificar.setVisible(true);

                        pacienteController.PutPaciente(paciente);

                        TablaPacienteLlenado();
                }
            }
        };

            ActionListener eliminarAction = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int filaSeleccionada = tb_paciente.getSelectedRow();
                
                int idTablaPaciente = (int) tb_paciente.getValueAt(filaSeleccionada, 0);

                boolean eliminado = pacienteController.DeletePaciente(idTablaPaciente);
                    
                JOptionPane.showMessageDialog(null, "Se eliminó el paciente con ID: " + idTablaPaciente);
                TablaPacienteLlenado();
            }
        };

        // En la tabla, al configurar los botones:
        tb_paciente.getColumn("Modificar").setCellRenderer(new ButtonRenderer());
        tb_paciente.getColumn("Modificar").setCellEditor(new ButtonEditor(new JCheckBox(), "Modificar", modificarAction));

        tb_paciente.getColumn("Eliminar").setCellRenderer(new ButtonRenderer());
        tb_paciente.getColumn("Eliminar").setCellEditor(new ButtonEditor(new JCheckBox(), "Eliminar", eliminarAction));
    }
    
    public static DefaultTableModel CrearColumnasModeloPersonalizado(Object objeto, String[] camposDeseados){
    Field[] campos = objeto.getClass().getDeclaredFields();
    ArrayList<String> columnas = new ArrayList<>();

    for (String campoDeseado : camposDeseados) {
        for (Field campo : campos) {
            if (campo.getName().equals(campoDeseado)) {
                columnas.add(campoDeseado);
                break;
            }
        }
    }

    String[] nombresDeColumnas = columnas.toArray(new String[0]);
    return new DefaultTableModel(nombresDeColumnas, 0);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_borrar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_cedula;
    private javax.swing.JTable tb_paciente;
    private javax.swing.JTextField txtCedulaNombre;
    // End of variables declaration//GEN-END:variables
}
