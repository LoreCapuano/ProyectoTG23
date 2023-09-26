package proyectotg23.vistas;

import com.sun.glass.events.KeyEvent;
import java.awt.event.ItemEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import proyectotg23.accesoADatos.AlumnoData;
import proyectotg23.accesoADatos.InscripcionData;
import proyectotg23.accesoADatos.MateriaData;
import proyectotg23.entidades.Alumno;
import proyectotg23.entidades.Materia;

public class AlumnosXMateria extends javax.swing.JInternalFrame {

    private List<Materia> ListaM;
    private List<Alumno> ListaA;
    private InscripcionData insData;
    private AlumnoData aluData;
    private MateriaData MateriaData;

    private DefaultTableModel modelo;

    public AlumnosXMateria() {
        initComponents();
        jBsalir.setMnemonic(KeyEvent.VK_S);
        MateriaData matData = new MateriaData();
        ListaM = matData.ListarMaterias();
        modelo = new DefaultTableModel();
        insData = new InscripcionData();

        cargarCombo();
        armarCabecera();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCBoxMateria = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTmaterias = new javax.swing.JTable();
        jBsalir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Alumnos por Materia");

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel1.setText("LISTADO DE ALUMNOS POR MATERIA");

        jLabel2.setText("Seleccione una materia:");

        jCBoxMateria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCBoxMateriaItemStateChanged(evt);
            }
        });
        jCBoxMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBoxMateriaActionPerformed(evt);
            }
        });

        jTmaterias.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTmaterias);

        jBsalir.setMnemonic('S');
        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jCBoxMateria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 13, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBsalir)
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCBoxMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBsalir)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCBoxMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBoxMateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBoxMateriaActionPerformed

    private void jCBoxMateriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCBoxMateriaItemStateChanged
        
        if (evt.getStateChange() == ItemEvent.SELECTED) {
        Materia mat= (Materia) jCBoxMateria.getSelectedItem();
        borrarFilaTabla();
        cargarTabla();
        
        }
    }//GEN-LAST:event_jCBoxMateriaItemStateChanged

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
       int confirmacion = JOptionPane.showConfirmDialog(
                null,
                "¿Está seguro de que desea salir?",
                "Confirmar Salida",
                JOptionPane.YES_NO_OPTION
        );

        if (confirmacion == JOptionPane.YES_OPTION) {
            dispose(); // Cierra la ventana actual si el usuario confirma
        }
    }//GEN-LAST:event_jBsalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBsalir;
    private javax.swing.JComboBox<Materia> jCBoxMateria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTmaterias;
    // End of variables declaration//GEN-END:variables
public void cargarCombo() {

        for (Materia item : ListaM) {

            jCBoxMateria.addItem(item);

        }
        jCBoxMateria.setSelectedIndex(-1);
    }

    private void armarCabecera() {
        modelo.addColumn("ID");
        modelo.addColumn("DNI");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nombre");
        jTmaterias.setModel(modelo);
        JTableHeader tableHeader = jTmaterias.getTableHeader();
        DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) tableHeader.getDefaultRenderer();
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
    }

    private void cargarTabla() {
        Materia selecc = (Materia) jCBoxMateria.getSelectedItem();
        List<Alumno> list = insData.obtenerAlumnosMateria(selecc.getNombre());
        for (Alumno item : list) {
            modelo.addRow(new Object[]{
                item.getIdAlumno(),
                item.getDni(),
                item.getApellido(),
                item.getNombre(),});

        }
    }
    
    private void borrarFilaTabla() {
        int indice = modelo.getRowCount() - 1;

        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);

        }
    }
}
