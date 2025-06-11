package vistas.paciente;

import javax.swing.JOptionPane;
import modelos.Paciente;
import utilidades.Controller.ManagerController;
import utilidades.Table.RefreshTable.RefreshTable;
import utilidades.Validador.MsgValidacion;
import utilidades.Validador.TipoValidacion;
import utilidades.Validador.Validador;
import vistas.IReceptorEntityJFrame;

public class JF_FormularioPaciente extends javax.swing.JFrame implements IReceptorEntityJFrame<Paciente> {
    private final ManagerController managerController;
    private final RefreshTable tableRefresh;
    private boolean isEdit = false;
    private Paciente paciente;
    
    public JF_FormularioPaciente() {
        initComponents();
        managerController = ManagerController.getInstance();
        tableRefresh = RefreshTable.getInstance();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtEdad = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        lblCedula = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        lblApellido = new javax.swing.JLabel();
        btnResetear = new javax.swing.JButton();
        lblEdad = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtEdad.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BOTTOM)));

        txtCorreo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BOTTOM)));

        lblCedula.setText("Cedula");

        txtTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BOTTOM)));

        lblNombre.setText("Nombre");

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        lblApellido.setText("Apellido");

        btnResetear.setText("Resetear");
        btnResetear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetearActionPerformed(evt);
            }
        });

        lblEdad.setText("Edad");

        lblCorreo.setText("Correo");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulario");

        lblTelefono.setText("Telefono");

        txtCedula.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BOTTOM)));

        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BOTTOM)));

        txtApellido.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BOTTOM)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblTelefono)
                                .addComponent(lblCorreo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblEdad, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblApellido, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblCedula, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGap(34, 34, 34)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtNombre)
                                .addComponent(txtCedula)
                                .addComponent(txtApellido)
                                .addComponent(txtEdad)
                                .addComponent(txtCorreo)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(0, 50, Short.MAX_VALUE)
                            .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnResetear, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCedula))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblApellido, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEdad)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreo)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefono)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnResetear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
       if(!verificarCampos()){
            return;
        }
        if(isEdit){
            Paciente pacienteActualizado = getPacienteFormularioActualizado();
            boolean actualizadoExitoso = managerController.put(pacienteActualizado);
            if(actualizadoExitoso){
                JOptionPane.showMessageDialog(null, "Paciente Actualizado con exito");
                tableRefresh.refrescarTodas();
            }
            else {
                JOptionPane.showMessageDialog(null, "Error al actualizar paciente");
            }
        } else{
            Paciente paciente = getPacienteFormulario();
            boolean guadadoExitoso = managerController.post(paciente);

            if (guadadoExitoso){
                JOptionPane.showMessageDialog(null, "Paciente guardado con exito");
                tableRefresh.refrescarTodas();
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar paciente");
            }
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private boolean verificarCampos() {
        Validador validador = new Validador();
        validador.agregarCampo(txtNombre.getText(), MsgValidacion.NOMBRE_INVALIDO,
            TipoValidacion.NO_NULO, TipoValidacion.CADENA_TEXTO_VALIDA,TipoValidacion.SOLO_LETRAS);

        validador.agregarCampo(txtApellido.getText(), MsgValidacion.APELLIDO_INVALIDO,
            TipoValidacion.NO_NULO, TipoValidacion.CADENA_TEXTO_VALIDA, TipoValidacion.SOLO_LETRAS);

        validador.agregarCampo(txtEdad.getText(), MsgValidacion.EDAD_INVALIDA,
            TipoValidacion.NO_NULO, TipoValidacion.NUMERICO);

        validador.agregarCampo(txtCedula.getText(), MsgValidacion.CEDULA_INVALIDA,
            TipoValidacion.NO_NULO, TipoValidacion.NUMERICO);

        validador.agregarCampo(txtCorreo.getText(), MsgValidacion.CORREO_INVALIDO,
            TipoValidacion.NO_NULO);
        
        validador.agregarCampo(txtTelefono.getText(), MsgValidacion.TELEFONO_INVALIDO,
            TipoValidacion.NO_NULO, TipoValidacion.NUMERICO);

        return validador.validarTodos();
    }
    
    private Paciente getPacienteFormularioActualizado(){
        paciente.setCedula(Integer.parseInt(txtCedula.getText()) );
        paciente.setNombre(txtNombre.getText());
        paciente.setApellido(txtApellido.getText());
        paciente.setEdad(Integer.parseInt(txtEdad.getText()));
        paciente.setCorreo(txtCorreo.getText());
        paciente.setTelefono(Integer.parseInt(txtTelefono.getText()));
        return paciente;
    }
    
    private Paciente getPacienteFormulario(){
        paciente = new Paciente();
        paciente.setCedula(Integer.parseInt(txtCedula.getText()) );
        paciente.setNombre(txtNombre.getText());
        paciente.setApellido(txtApellido.getText());
        paciente.setEdad(Integer.parseInt(txtEdad.getText()));
        paciente.setCorreo(txtCorreo.getText());
        paciente.setTelefono(Integer.parseInt(txtTelefono.getText()));
        return paciente;
    }
    
    private void llenarFormularioConObjeto(Paciente paciente) {
        if (paciente != null) {
            String cedula = ""+paciente.getCedula();
            String telefono = ""+paciente.getTelefono();
            String edad = ""+paciente.getEdad();
            txtCedula.setText(cedula);
            txtEdad.setText(edad);
            txtNombre.setText(paciente.getNombre());
            txtApellido.setText(paciente.getApellido());
            txtCorreo.setText(paciente.getCorreo());
            txtTelefono.setText(telefono);
        }
    }  
    
    private void btnResetearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetearActionPerformed
        txtCedula.setText("");
        txtEdad.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtCorreo.setText("");
        txtTelefono.setText("");
    }//GEN-LAST:event_btnResetearActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnResetear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setEntidad(Paciente entidad) {
        btnAceptar.setText("Actualizar");
        this.isEdit= true;
        llenarFormularioConObjeto(entidad);
        this.paciente = entidad;
    }
}
