package proyectotg23.accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import proyectotg23.entidades.Alumno;
import proyectotg23.entidades.Inscripcion;
import proyectotg23.entidades.Materia;

public class InscripcionData {

    private Connection con = null;
    private MateriaData matdata = new MateriaData(); 
    private AlumnoData aludata = new AlumnoData();

    public InscripcionData() {
        con = Conexion.getConexion();

    }

    public void guardarInscripciones(Inscripcion insc) {
        try {
            String sql = "INSERT INTO inscripcion( nota, idAlumno, idMateria) "
                    + "VALUES (?,?,?) ";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setDouble(1, insc.getNota());
            ps.setInt(2, insc.getAlumno().getIdAlumno());
            ps.setInt(3, insc.getMateria().getIdMateria());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                insc.setIdInscripcion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "La inscrpcion se efuectuo correctamente");

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla inscripciones" + ex.getMessage());
        }

    }

    public List<Inscripcion> obtenerInscripciones() {
        ArrayList<Inscripcion> inscripciones = new ArrayList();
        String sql = "SELECT * FROM inscripcion";
        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Inscripcion inscripto = new Inscripcion();//insc
                inscripto.setIdInscripcion(rs.getInt("idInscripto"));
                Alumno nombre = aludata.buscarAlumnoPorId(rs.getInt("idAlumno"));//Alumno alu
                Materia nueva = matdata.buscarMateria(rs.getInt("idMateria")); //Materia mat
                inscripto.setAlumno(nombre);
                inscripto.setMateria(nueva);
                inscripto.setNota(rs.getDouble("nota"));
                inscripciones.add(inscripto); 
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder la tabla inscripciones " + ex.getMessage());
        }

        return inscripciones;
    }
//   

    public List<Inscripcion> obtenerInscripcionesPorAlumno(int idAlumno) {
        ArrayList<Inscripcion> inscripciones = new ArrayList();
        String sql = "SELECT * FROM inscripcion WHERE idAlumno=? ";
        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Inscripcion inscripto = new Inscripcion();//insc
                inscripto.setIdInscripcion(rs.getInt("idInscripto"));
                Alumno nombre = aludata.buscarAlumnoPorId(rs.getInt("idAlumno"));
                Materia nueva = matdata.buscarMateria(rs.getInt("idMateria"));
                inscripto.setAlumno(nombre);
                inscripto.setMateria(nueva);
                inscripto.setNota(rs.getDouble("nota"));
                inscripciones.add(inscripto); 
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder la tabla inscripciones " + ex.getMessage());
        }

        return inscripciones;

    }

    public List<Materia> obtenerMateriasCursadas(int idAlumno) {
        List<Materia> Materias = new ArrayList<Materia>();
        try {
            String sql = "SELECT inscripcion.idMateria, nombre, año FROM inscripcion, materia "
                    + "WHERE inscripcion.idMateria = materia.idMateria AND inscripcion.idAlumno = ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            Materia materia;
            while (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAño(rs.getInt("año"));
                Materias.add(materia);

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al obtener inscripciones " + ex.getMessage());
        }
        return Materias;
    }
//   

    public List<Materia> obtenerMateriasNOCursadas(int idAlumno) {
        ArrayList<Materia> materia = new ArrayList();
        String sql = " SELECT* FROM materia WHERE estado = 1 AND idMateria NOT IN "
                + "(SELECT idMateria FROM inscripcion WHERE idAlumno = ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Materia material = new Materia();
                material.setIdMateria(rs.getInt("idMateria"));
                material.setNombre(rs.getString("nombre"));
                material.setAño(rs.getInt("año"));
                materia.add(material);

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al obtener materias NO cursadas " + ex.getMessage());

        }
        return materia;

    }

    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria) {
        String sql = "DELETE FROM inscripcion WHERE idAlumno=? AND idMateria=?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            int fila = ps.executeUpdate();
            if (fila > 0) {
                JOptionPane.showMessageDialog(null, "Inscripcion borrada correctamente");

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla para borrar inscripcion ");
        }

    }

    public void actualizarNota(int idAlumno, int idMateria, double nota) {
        String sql = "UPDATE inscripcion SET nota = ? WHERE idAlumno = ? AND idMateria= ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);

            int fila = ps.executeUpdate();
            if (fila > 0) {
                JOptionPane.showMessageDialog(null, "Nota actualizada correctamente");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar nota");
        }

    }



    public List<Alumno> obtenerAlumnosMateria(String nombre) {

        ArrayList<Alumno> alumnos = new ArrayList(); 
        String sql = "SELECT * FROM alumno a JOIN inscripcion i ON (a.idAlumno = i.idAlumno) JOIN materia m ON (i.idMateria = m.idMateria) WHERE m.nombre LIKE ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre+"%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Alumno nuevo = new Alumno();
                nuevo.setIdAlumno(rs.getInt("idAlumno"));
                nuevo.setDni(rs.getInt("dni"));
                nuevo.setApellido(rs.getString("apellido"));
                nuevo.setNombre(rs.getString("nombre"));
                nuevo.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                nuevo.setEstado(rs.getBoolean("estado"));
                alumnos.add(nuevo);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en base de datos "+ ex.getMessage());
        }
        return alumnos;
    }
}
