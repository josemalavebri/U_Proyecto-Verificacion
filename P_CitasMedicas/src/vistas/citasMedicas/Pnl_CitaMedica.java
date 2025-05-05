package vistas.citasMedicas;

import controladores.CitaMedicaController;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import modelos.CitaMedica;
import modelos.Turno;
import utilidades.ButtonEditor;
import utilidades.ButtonRenderer;
import utilidades.TableColumns;
import vistas.paciente.Pnl_GestorPaciente;

/**
 *
 * @author josem
 */
public class Pnl_CitaMedica extends javax.swing.JPanel {

    private CitaMedicaController citaMedicaController;
    private ArrayList<CitaMedica> citasMedicas = new ArrayList<>();
    private DefaultTableModel modeloTabla;


    public Pnl_CitaMedica() {
        initComponents();
        citaMedicaController = new CitaMedicaController();
        crearModeloTablaCitaMedica();
        cargarDatosCitaMedica();
        asignarEventosBotones();
    }
    
    public void crearModeloTablaCitaMedica(){
        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Id");
        modeloTabla.addColumn("Paciente");
        modeloTabla.addColumn("Médico");
        modeloTabla.addColumn("Turno");
        modeloTabla.addColumn("Modificar");
        modeloTabla.addColumn("Eliminar");
    }
    
    public void asignarEventoEliminar(ActionListener eliminarAction){
        /*tb_citasMedicas.getColumn("Modificar").setCellRenderer(new ButtonRenderer());
        tb_citasMedicas.getColumn("Modificar").setCellEditor(new ButtonEditor(new JCheckBox(), "Modificar", modificarAction));
        */
        
        tb_citasMedicas.getColumn("Eliminar").setCellRenderer(new ButtonRenderer());
        tb_citasMedicas.getColumn("Eliminar").setCellEditor(new ButtonEditor(new JCheckBox(), "Eliminar", eliminarAction));
  
    }
    
    private void asignarEventosBotones(){
        ActionListener listener = crearEventoEliminar();
        asignarEventoEliminar(listener);
        
    }
    
    private ActionListener crearEventoEliminar(){
        
        ActionListener eventoEliminar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int filaSeleccionada = tb_citasMedicas.getSelectedRow();
                int idTablaCitaMedica = (int) tb_citasMedicas.getValueAt(filaSeleccionada, 0);
                boolean eliminado = citaMedicaController.removeCitaMedica(idTablaCitaMedica);
                    
                cargarDatosCitaMedica();
                JOptionPane.showMessageDialog(null, "Se eliminó el paciente con ID: " + idTablaCitaMedica);
            }
        };
        
        return eventoEliminar;
    }

    
    public void crearEventosModificarEliminar(){
     /*   ActionListener modificarAction = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn_nuevoActionPerformed(e);
                int filaSeleccionada = tb_paciente.getSelectedRow();
                if (filaSeleccionada >= 0) {
                    // Obtener los valores de la fila seleccionada

                    //int id = (int) tb_paciente.getValueAt(filaSeleccionada, 0);
                    System.out.println("Tipo de dato en celda: " + tb_paciente.getValueAt(filaSeleccionada, 0).getClass());
                    String cedula = (String) tb_paciente.getValueAt(filaSeleccionada, 1);
                    String nombre = (String) tb_paciente.getValueAt(filaSeleccionada, 2);
                    String apellido = (String) tb_paciente.getValueAt(filaSeleccionada, 3);
                    //int edad = (int) tb_paciente.getValueAt(filaSeleccionada, 4);
                    System.out.println("Tipo de dato en celda: " + tb_paciente.getValueAt(filaSeleccionada, 0).getClass());
                    String correo = (String) tb_paciente.getValueAt(filaSeleccionada, 5);
                    String telefono = (String) tb_paciente.getValueAt(filaSeleccionada, 6);
                    
                    //Paciente paciente = new Paciente(cedula,nombre,apellido,edad,correo,telefono);
                    
                    pacienteController.PutPaciente(paciente);

                    //JOptionPane.showMessageDialog(null, "Modificar paciente con ID: " + id);
                }
            }
        };
        /**/
     
           
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_citasMedicas = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

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

        jButton1.setText("Nueva Cita");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(236, 236, 236))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       JFrame jframe = new JF_NuevaCitaMedica();
       jframe.setLocationRelativeTo(null);
       jframe.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void cargarDatosCitaMedica() {
        DefaultTableModel modelo = (DefaultTableModel) tb_citasMedicas.getModel();
        modelo.setRowCount(0);
        citasMedicas = citaMedicaController.getCitasMedicas();
        for (CitaMedica c : citasMedicas) {
            Object[] fila = {c.getId(), c.getMedico().getNombre(), c.getPaciente().getNombre(), c.getTurno().getFecha()};
            modeloTabla.addRow(fila);
        }
        
        JTable tabla = new JTable(modeloTabla);
        tb_citasMedicas.setModel(modeloTabla);
    }
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_citasMedicas;
    // End of variables declaration//GEN-END:variables

    
}
