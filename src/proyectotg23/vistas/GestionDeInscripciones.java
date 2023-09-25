
package proyectotg23.vistas;

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
import proyectotg23.entidades.Inscripcion;
import proyectotg23.entidades.Materia;

public class GestionDeInscripciones extends javax.swing.JInternalFrame {

    private List<Materia> ListaM;
    private List<Alumno> ListaA;
    private InscripcionData insData;
    private AlumnoData aluData;
    private MateriaData MateriaData;

    private DefaultTableModel modelo;

    public boolean isCellEditable(int f, int c) {
        return false;
    }

    public GestionDeInscripciones() {
        initComponents();
        aluData = new AlumnoData();
        ListaA = aluData.listarAlumnos();
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
        jCBoxalumno = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jRBmateriasinscriptas = new javax.swing.JRadioButton();
        jRBmatNoInsc = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jBinscribir = new javax.swing.JButton();
        jBanularInscripcion = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTmaterias = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Formulario de Inscripcion");

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(552, 378));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel1.setText("Formulario de Inscripcion");

        jLabel2.setText("Seleccione un alumno: ");

        jCBoxalumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBoxalumnoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel3.setText("Listado de Materias");

        jRBmateriasinscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBmateriasinscriptasActionPerformed(evt);
            }
        });

        jRBmatNoInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBmatNoInscActionPerformed(evt);
            }
        });

        jLabel4.setText("Materias inscriptas");

        jLabel5.setText("Materias NO inscriptas");

        jBinscribir.setText("Inscribir");
        jBinscribir.setEnabled(false);
        jBinscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBinscribirActionPerformed(evt);
            }
        });

        jBanularInscripcion.setText("Anular Inscripcion");
        jBanularInscripcion.setEnabled(false);
        jBanularInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBanularInscripcionActionPerformed(evt);
            }
        });

        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jTmaterias.setAutoCreateRowSorter(true);
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
        jTmaterias.setName(""); // NOI18N
        jScrollPane1.setViewportView(jTmaterias);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jBinscribir)
                .addGap(86, 86, 86)
                .addComponent(jBanularInscripcion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBsalir)
                .addGap(59, 59, 59))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jCBoxalumno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jRBmateriasinscriptas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 13, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRBmatNoInsc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)))))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCBoxalumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jRBmateriasinscriptas)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jRBmatNoInsc)
                            .addGap(5, 5, 5))
                        .addComponent(jLabel4))
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBinscribir)
                    .addComponent(jBanularInscripcion)
                    .addComponent(jBsalir))
                .addGap(151, 151, 151))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCBoxalumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBoxalumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBoxalumnoActionPerformed

    private void jRBmateriasinscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBmateriasinscriptasActionPerformed
        borrarFilaTabla();
        jRBmatNoInsc.setSelected(false);
        cargarMateriasInscriptas();
        jBanularInscripcion.setEnabled(true);
        jBinscribir.setEnabled(false);

    }//GEN-LAST:event_jRBmateriasinscriptasActionPerformed

    private void jRBmatNoInscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBmatNoInscActionPerformed
         borrarFilaTabla();
        jRBmateriasinscriptas.setSelected(false);
        cargarMateriasNoInscriptas();
        jBinscribir.setEnabled(true);
        jBanularInscripcion.setEnabled(false);
    }//GEN-LAST:event_jRBmatNoInscActionPerformed

    private void jBinscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBinscribirActionPerformed
        int filaseleccionada = jTmaterias.getSelectedRow();
        if (filaseleccionada!=-1){
            Alumno a = (Alumno)jCBoxalumno.getSelectedItem();//me devuelve un objeto y lo casteo a Alumno
            int idmateria = (Integer)modelo.getValueAt(filaseleccionada,0);//el primer parametro es la fila seleccionada y el segundo la columna,el id de la materia esta en la columna 0, me devuleve un obj y lo casteo a Integer
            String nombreMateria = (String)modelo.getValueAt(filaseleccionada,1);
            int añoMateria =(Integer) modelo.getValueAt(filaseleccionada,2);
            Materia m = new Materia(idmateria,nombreMateria,añoMateria,true);
            Inscripcion i = new Inscripcion(0,a,m);
            insData.guardarInscripciones(i);
            borrarFilaTabla();
            cargarMateriasNoInscriptas();
            
        }
        else {
            JOptionPane.showMessageDialog(null, "debe seleccionar una fila");
        }
    }//GEN-LAST:event_jBinscribirActionPerformed

    private void jBanularInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBanularInscripcionActionPerformed
        int filaselecc = jTmaterias.getSelectedRow();
        if (filaselecc!=-1){
            Alumno a = (Alumno)jCBoxalumno.getSelectedItem();
            int idmateria =(Integer) modelo.getValueAt(filaselecc, 0);
            insData.borrarInscripcionMateriaAlumno(a.getIdAlumno(), idmateria);
            //JOptionPane.showMessageDialog(this,"Materia anulada correctamente");
            borrarFilaTabla();
            cargarMateriasInscriptas();
        }
        else {
            JOptionPane.showMessageDialog(null, "Ud debe seleccionar una materia ");
        }
    }//GEN-LAST:event_jBanularInscripcionActionPerformed

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
        // Si el usuario selecciona "No" o cierra el cuadro de diálogo, la ventana no se cerrará.
    }//GEN-LAST:event_jBsalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBanularInscripcion;
    private javax.swing.JButton jBinscribir;
    private javax.swing.JButton jBsalir;
    private javax.swing.JComboBox<Alumno> jCBoxalumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRBmatNoInsc;
    private javax.swing.JRadioButton jRBmateriasinscriptas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTmaterias;
    // End of variables declaration//GEN-END:variables

    
    private void armarCabecera() {
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Año");
        jTmaterias.setModel(modelo);
        JTableHeader tableHeader = jTmaterias.getTableHeader();
        DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) tableHeader.getDefaultRenderer();
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

    }

    public void cargarCombo() {

        for (Alumno item : ListaA) {

            jCBoxalumno.addItem(item);

        }
        jCBoxalumno.setSelectedIndex(-1);
    }

    private void borrarFilaTabla() {
        int indice = modelo.getRowCount() - 1;

        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);

        }

    }

    private void cargarMateriasNoInscriptas() {
//    borrarFilaTabla();
        Alumno selecc = (Alumno) jCBoxalumno.getSelectedItem();
        ListaM = (List) insData.obtenerMateriasNOCursadas(selecc.getIdAlumno());
        for (Materia m : ListaM) {
            modelo.addRow(new Object[]{m.getIdMateria(), m.getNombre(), m.getAño()});
        }

    }

    private void cargarMateriasInscriptas() {
//    borrarFilaTabla();
        Alumno selecc = (Alumno) jCBoxalumno.getSelectedItem();
//        List<Materia> list = (List) insData.obtenerMateriasCursadas(selecc.getIdAlumno());
        List<Materia> ListaM=insData.obtenerMateriasCursadas(selecc.getIdAlumno());
        for (Materia m : ListaM) {
            modelo.addRow(new Object[]{m.getIdMateria(), m.getNombre(), m.getAño()});

        }

    }
}
