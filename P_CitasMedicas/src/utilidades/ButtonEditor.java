/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilidades;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelos.Paciente;

/**
 *
 * @author HP
 */

public class ButtonEditor extends DefaultCellEditor {
    protected JButton button;
    private String action;
    private int row;
    private JTable table;
    private ActionListener actionListener;

    // Constructor para definir acción y listener genérico
    public ButtonEditor(JCheckBox checkBox, String action, ActionListener actionListener) {
        super(checkBox);
        this.action = action;
        this.actionListener = actionListener;
        button = new JButton();
        button.setOpaque(true);
        button.addActionListener(e -> {
            fireEditingStopped(); // Notifica que se terminó de editar
            actionListener.actionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, action));
        });
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        this.table = table;
        this.row = row;
        button.setText(action);
        return button;
    }

    @Override
    public Object getCellEditorValue() {
        return action;
    }
}