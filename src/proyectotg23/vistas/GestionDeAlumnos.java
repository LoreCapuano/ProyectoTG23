
package proyectotg23.vistas;

import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import proyectotg23.accesoADatos.AlumnoData;
import proyectotg23.entidades.Alumno;

public class GestionDeAlumnos extends javax.swing.JInternalFrame {

    public GestionDeAlumnos() {
        initComponents();

    }
    private AlumnoData aluData = new AlumnoData();
    private Alumno alumnoActual = null;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jBnuevo = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();
        jBmodificar = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jBbuscarporDNI = new javax.swing.JButton();
        jTdocumento = new javax.swing.JTextField();
        jTapellido = new javax.swing.JTextField();
        jTnombre = new javax.swing.JTextField();
        jDateFechaNacimiento = new com.toedter.calendar.JDateChooser();
        jCBestado = new javax.swing.JCheckBox();
        jTestado = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTidAlumno = new javax.swing.JTextField();
        jBlimpiar = new javax.swing.JButton();
        jBbuscarporID = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Alumnos");

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(493, 431));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel1.setText("ALUMNOS");

        jLabel2.setText("Documento");

        jLabel3.setText("Apellido");

        jLabel4.setText("Nombre");

        jLabel5.setText("Estado");

        jLabel6.setText("Fecha de Nacimiento");

        jBnuevo.setText("Nuevo");
        jBnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnuevoActionPerformed(evt);
            }
        });

        jBeliminar.setText("Eliminar");
        jBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarActionPerformed(evt);
            }
        });

        jBmodificar.setText("Modificar");
        jBmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmodificarActionPerformed(evt);
            }
        });

        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jBbuscarporDNI.setText("Buscar");
        jBbuscarporDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarporDNIActionPerformed(evt);
            }
        });

        jLabel7.setText("IDalumno");

        jBlimpiar.setText("Limpiar");
        jBlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlimpiarActionPerformed(evt);
            }
        });

        jBbuscarporID.setText("Buscar por ID");
        jBbuscarporID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarporIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBnuevo)
                        .addGap(18, 18, 18)
                        .addComponent(jBlimpiar))
                    .addComponent(jLabel2)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBmodificar)
                        .addGap(18, 18, 18)
                        .addComponent(jBeliminar)
                        .addGap(18, 18, 18)
                        .addComponent(jBsalir))
                    .addComponent(jTapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCBestado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTestado, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jTidAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBbuscarporID))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jTdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31)
                            .addComponent(jBbuscarporDNI))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBbuscarporDNI))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTidAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBbuscarporID))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTapellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCBestado, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDateFechaNacimiento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBsalir)
                            .addComponent(jBeliminar)
                            .addComponent(jBmodificar)
                            .addComponent(jBnuevo)
                            .addComponent(jBlimpiar)))
                    .addComponent(jTestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jBnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnuevoActionPerformed
        // limpiar();
//        AlumnoData alu = new AlumnoData();
        alumnoActual = new Alumno(Integer.parseInt(jTdocumento.getText()), jTapellido.getText(), jTnombre.getText(), jDateFechaNacimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), jCBestado.isSelected());
        try {


            if (jTapellido.getText().isEmpty() || jTdocumento.getText().isEmpty() || jTnombre.getText().isEmpty() || jDateFechaNacimiento.getDate() == null || jDateFechaNacimiento.getDate().after(Date.valueOf(LocalDate.now()))) {
                JOptionPane.showMessageDialog(this, "Por favor complete todos los campos");
            }
            aluData.guardarAlumno(alumnoActual);
            limpiar();
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "ERROR: Debe ingresar un numero de DNI valido");
        }
    }//GEN-LAST:event_jBnuevoActionPerformed

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed

        if (alumnoActual != null) {
            aluData.eliminarAlumno(alumnoActual.getIdAlumno());
            alumnoActual = null;
            limpiar();

        } else {
            JOptionPane.showMessageDialog(this, "No hay un alumno seleccionado para eliminar");
        }
        
       


    }//GEN-LAST:event_jBeliminarActionPerformed

    private void jBmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmodificarActionPerformed
        try {
            AlumnoData alu = new AlumnoData();
            Alumno alumno = new Alumno();
            alumno.setDni(Integer.parseInt(jTdocumento.getText()));
            alumno.setEstado(jCBestado.isSelected());
            alumno.setIdAlumno(Integer.parseInt(jTidAlumno.getText()));
            alumno.setApellido(jTapellido.getText());
            alumno.setNombre(jTnombre.getText());
            alumno.setFechaNacimiento(jDateFechaNacimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());

            if (jTdocumento.getText().isEmpty() || jTapellido.getText().isEmpty() || jTnombre.getText().isEmpty() ||  jDateFechaNacimiento.getDate() == null || jDateFechaNacimiento.getDate().after(Date.valueOf(LocalDate.now()))) {
                JOptionPane.showMessageDialog(this, "Por favor complete todos los campos");
            }
            alu.modificarAlumno(alumno);
            System.out.println(alumno);
            limpiar();
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "ERROR, asegúrate de ingresar valores válidos");


    }//GEN-LAST:event_jBmodificarActionPerformed
    }
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

    private void jBbuscarporDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarporDNIActionPerformed
        try {

            //System.out.println(alumnoActual);
            Integer dni = Integer.parseInt(jTdocumento.getText());
            alumnoActual = aluData.buscarAlumnoPorDni(dni);

            if (alumnoActual != null) {
                jTidAlumno.setText(String.valueOf(alumnoActual.getIdAlumno()));
                jTapellido.setText(alumnoActual.getApellido());
                jTnombre.setText(alumnoActual.getNombre());
                if (alumnoActual.isEstado()) {

                    jCBestado.setSelected(true);
                    jTestado.setText("activo");
                } else {
                    jCBestado.setSelected(false);
                    jTestado.setText("inactivo");

                }
                jDateFechaNacimiento.setDate(Date.valueOf(alumnoActual.getFechaNacimiento()));

            } else {
                JOptionPane.showMessageDialog(null, "No existe un alumno con ese DNI");
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "ERROR, debe ingresar un numero de DNI valido");

        }


    }//GEN-LAST:event_jBbuscarporDNIActionPerformed

    private void jBlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlimpiarActionPerformed

        jTidAlumno.setText(null);
        jTdocumento.setText(null);
        jTapellido.setText(null);
        jTnombre.setText(null);
        jCBestado.setSelected(false);
        jTestado.setText(null);
        jDateFechaNacimiento.setDate(null);
    }//GEN-LAST:event_jBlimpiarActionPerformed

    private void jBbuscarporIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarporIDActionPerformed
        try {

            //System.out.println(alumnoActual);
            Integer ID = Integer.parseInt(jTidAlumno.getText());
            alumnoActual = aluData.buscarAlumnoPorId(ID);

            if (alumnoActual != null) {
                jTdocumento.setText(String.valueOf(alumnoActual.getDni()));
                jTapellido.setText(alumnoActual.getApellido());
                jTnombre.setText(alumnoActual.getNombre());
                if (alumnoActual.isEstado()) {

                    jCBestado.setSelected(true);
                    jTestado.setText("activo");
                } else {
                    jCBestado.setSelected(false);
                    jTestado.setText("inactivo");

                }
                jDateFechaNacimiento.setDate(Date.valueOf(alumnoActual.getFechaNacimiento()));

            } else {
                JOptionPane.showMessageDialog(null, "No existe un alumno con ese ID");
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "ERROR, debe ingresar un numero de ID valido");

        }
    }//GEN-LAST:event_jBbuscarporIDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscarporDNI;
    private javax.swing.JButton jBbuscarporID;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBlimpiar;
    private javax.swing.JButton jBmodificar;
    private javax.swing.JButton jBnuevo;
    private javax.swing.JButton jBsalir;
    private javax.swing.JCheckBox jCBestado;
    private com.toedter.calendar.JDateChooser jDateFechaNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTapellido;
    private javax.swing.JTextField jTdocumento;
    private javax.swing.JTextField jTestado;
    private javax.swing.JTextField jTidAlumno;
    private javax.swing.JTextField jTnombre;
    // End of variables declaration//GEN-END:variables
public void limpiar() {
        jTidAlumno.setText(null);
        jTdocumento.setText(null);
        jTapellido.setText(null);
        jTnombre.setText(null);
        jCBestado.setSelected(false);
        jTestado.setText(null);
        jDateFechaNacimiento.setDate(null);
    }

//    public boolean revisarString(String nombre) {
//        String x = nombre.toUpperCase();
//        for (int i = 0; i <= x.length() - 1; i++) {
//            if (x.charAt(i) < 65 || x.charAt(i) > 90) {
//                return false;
//            } else if (x.substring(i, i + 1).equals(" ")) {
//                return false;
//            }
//        }
//        return true;
//    }
}
