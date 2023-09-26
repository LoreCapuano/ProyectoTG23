package proyectotg23.vistas;

/**
 *
 * @author Lorena
 */
public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem4 = new javax.swing.JMenuItem();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiGestiondeAlumnos = new javax.swing.JMenuItem();
        jMenuMateria = new javax.swing.JMenu();
        jmiMateria = new javax.swing.JMenuItem();
        jMenuAdministracion = new javax.swing.JMenu();
        jmiManejoInsc = new javax.swing.JMenuItem();
        jmiManipulaNotas = new javax.swing.JMenuItem();
        jmiConsultas = new javax.swing.JMenu();
        jmiAlumnoxMateria = new javax.swing.JMenuItem();
        jmiSalir = new javax.swing.JMenu();

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 628, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 503, Short.MAX_VALUE)
        );

        jMenu1.setText("Alumno");

        jmiGestiondeAlumnos.setText("Formulario de alumnos");
        jmiGestiondeAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiGestiondeAlumnosActionPerformed(evt);
            }
        });
        jMenu1.add(jmiGestiondeAlumnos);

        jMenuBar1.add(jMenu1);

        jMenuMateria.setText("Materia");

        jmiMateria.setText("Gestion de Materias");
        jmiMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiMateriaActionPerformed(evt);
            }
        });
        jMenuMateria.add(jmiMateria);

        jMenuBar1.add(jMenuMateria);

        jMenuAdministracion.setText("Administracion");

        jmiManejoInsc.setText("Manejo de Inscripciones");
        jmiManejoInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiManejoInscActionPerformed(evt);
            }
        });
        jMenuAdministracion.add(jmiManejoInsc);

        jmiManipulaNotas.setText("Manipulacion de Notas");
        jmiManipulaNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiManipulaNotasActionPerformed(evt);
            }
        });
        jMenuAdministracion.add(jmiManipulaNotas);

        jMenuBar1.add(jMenuAdministracion);

        jmiConsultas.setText("Consultas");

        jmiAlumnoxMateria.setText("Alumnos por Materia");
        jmiAlumnoxMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAlumnoxMateriaActionPerformed(evt);
            }
        });
        jmiConsultas.add(jmiAlumnoxMateria);

        jMenuBar1.add(jmiConsultas);

        jmiSalir.setText("Salir");
        jMenuBar1.add(jmiSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiGestiondeAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiGestiondeAlumnosActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        GestionDeAlumnos gda = new GestionDeAlumnos();
        escritorio.add(gda);
        gda.setVisible(true);
        escritorio.moveToFront(gda);
    }//GEN-LAST:event_jmiGestiondeAlumnosActionPerformed

    private void jmiMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiMateriaActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        GestionDeMaterias gdm = new GestionDeMaterias();
        escritorio.add(gdm);
        gdm.setVisible(true);
        escritorio.moveToFront(gdm);
    }//GEN-LAST:event_jmiMateriaActionPerformed

    private void jmiManejoInscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiManejoInscActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        GestionDeInscripciones gdi = new GestionDeInscripciones();
        escritorio.add(gdi);
        gdi.setVisible(true);
        escritorio.moveToFront(gdi);
    }//GEN-LAST:event_jmiManejoInscActionPerformed

    private void jmiManipulaNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiManipulaNotasActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        CargaDeNotas cdn = new CargaDeNotas();
        escritorio.add(cdn);
        cdn.setVisible(true);
        escritorio.moveToFront(cdn);
    }//GEN-LAST:event_jmiManipulaNotasActionPerformed

    private void jmiAlumnoxMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAlumnoxMateriaActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        AlumnosXMateria apm = new AlumnosXMateria();
        escritorio.add(apm);
        apm.setVisible(true);
        escritorio.moveToFront(apm);
    }//GEN-LAST:event_jmiAlumnoxMateriaActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenuAdministracion;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenu jMenuMateria;
    private javax.swing.JMenuItem jmiAlumnoxMateria;
    private javax.swing.JMenu jmiConsultas;
    private javax.swing.JMenuItem jmiGestiondeAlumnos;
    private javax.swing.JMenuItem jmiManejoInsc;
    private javax.swing.JMenuItem jmiManipulaNotas;
    private javax.swing.JMenuItem jmiMateria;
    private javax.swing.JMenu jmiSalir;
    // End of variables declaration//GEN-END:variables
}
